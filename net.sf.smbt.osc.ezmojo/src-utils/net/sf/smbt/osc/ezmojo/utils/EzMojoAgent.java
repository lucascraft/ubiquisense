/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010 - 2012, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/

package net.sf.smbt.osc.ezmojo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import net.sf.smbt.ezmojo.EZMojoCmd;
import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoNode;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezmojo.EzMojoInfoCmd;
import net.sf.smbt.ezmojo.EzmojoFactory;
import net.sf.smbt.ezmojo.EzmojoPackage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.xqz.engine.utils.EngineUtil;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.Qx;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.apache.log4j.jmx.Agent;
import org.eclipse.emf.query.conditions.eobjects.EObjectTypeRelationCondition;
import org.eclipse.emf.query.conditions.eobjects.TypeRelation;
import org.eclipse.emf.query.statements.FROM;
import org.eclipse.emf.query.statements.IQueryResult;
import org.eclipse.emf.query.statements.SELECT;
import org.eclipse.emf.query.statements.WHERE;
import org.eclipse.emf.transaction.RunnableWithResult;

import com.illposed.osc.OSCMessage;

/**
 * Entity holding capability to maintain connectivity to be able to receive
 * EzMojo commands accordingly to definition (see: http://code.google.com/a/eclipselabs.org/p/ubqt/wiki/EzMojo).
 * 
 * It usually listens to 4443 port and default outgoing on 4445.
 * 
 * Being an agent implies maintaining a pipe to all other nodes if necessary. It implies {@link EZMojoRoot} to
 * get {@link CmdPipe} references to be stored.
 * 
 * This way commands for OSC forwarding or binding are possibles.
 */
class EzMojoAgent implements EzAgent{
	private String addr;
	private int port;
	private EZMojoRoot ezMojo;
	
	@SuppressWarnings("unused")
	private EzMojoAgent() {
		this("localhost:4445", 4443);
	}
	
	EzMojoAgent(String _addr, int _port) {
		addr = _addr;
		port = _port;
		ezMojo = EzmojoFactory.eINSTANCE.createEZMojoRoot();
		ezMojo.setFeedback(false);
		ezMojo.setRoot(EzMojoCmdUtils.INSTANCE.createEzMojoNode("/")); // noob
		ezMojo.setSelected(ezMojo.getRoot());
	}
	
	public String getAddr() {
		return addr;
	}
	
	public int getPort() {
		return port;
	}
	
	public EZMojoRoot getEzMojo() {
		return ezMojo;
	}
	
	
	/**
     * Generically retrieves *EzMojoTarget* queues from a given {@link CmdPipe} reference.
     * 
     * @return a list of all compatible {@link Qx} queues to given parameters, a void list otherwise
     */
   public Collection<EZMojoTarget> getEzTargets() {
        final EObjectTypeRelationCondition condition = 
            new EObjectTypeRelationCondition(
                EzmojoPackage.Literals.EZ_MOJO_TARGET,
                TypeRelation.SAMETYPE_LITERAL
            );        
        IQueryResult result = null;
        try {
            result = (IQueryResult) EngineUtil.INSTANCE.getQxTransactionalEditingDomain().runExclusive(
            	new RunnableWithResult.Impl<IQueryResult>() {
            		public void run() {
            			setResult(new SELECT(
            				new FROM(ezMojo.getRoot()),
            				new WHERE(condition)
            			).execute());
            		}
            	}
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (result != null && !result.isEmpty()) {
            return Arrays.asList(result.getEObjects().toArray(new EZMojoTarget[0]));
        }
        return Collections.emptySet();
    }
   
   /**
    * Generically retrieves *EzMojoNode* elements from a given {@link Agent} reference.
    * 
    * @return a list of all compatible {@link EZMojoNode} elements, a void list otherwise
    */
  public List<OSCMessage> getOscMessages() {
	   List<OSCMessage> tokens = new ArrayList<OSCMessage>();
	   
	   for (EZMojoNode node : getEZMojoNodes()) {
		   tokens.addAll(EzMojoCmdUtils.INSTANCE.getOSCMessagesFromEzMojoNode(node));
	   }
	   
       return tokens;
   }
  
  /**
   * Generically retrieves *EzMojoNode* elements from a given {@link Agent} reference.
   * 
   * @return a list of all compatible {@link EZMojoNode} elements, a void list otherwise
   */
 public Collection<EZMojoNode> getEZMojoNodes() {
      final EObjectTypeRelationCondition condition = 
          new EObjectTypeRelationCondition(
              EzmojoPackage.Literals.EZ_MOJO_NODE,
              TypeRelation.SAMETYPE_LITERAL
          );        
      IQueryResult result = null;
      try {
          result = (IQueryResult) EngineUtil.INSTANCE.getQxTransactionalEditingDomain().runExclusive(
          	new RunnableWithResult.Impl<IQueryResult>() {
          		public void run() {
          			setResult(new SELECT(
          				new FROM(ezMojo.getRoot()),
          				new WHERE(condition)
          			).execute());
          		}
          	}
          );
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      if (result != null && !result.isEmpty()) {
          return Arrays.asList(result.getEObjects().toArray(new EZMojoNode[0]));
      }
      return Collections.emptySet();
  }
 
   private List<EZMojoTarget> removeDupsIfAny(List<EZMojoTarget> targets) {
	   List<EZMojoTarget> targetsToKeep = new ArrayList<EZMojoTarget>();
	   for (EZMojoTarget t : targets) {
		   if (!EzMojoCmdUtils.INSTANCE.isTargetForwardAlreadyHere(targetsToKeep, t)) {
			   targetsToKeep.add(t);
		   }
	   }
	   return targetsToKeep;
   }
   
   /*
   private List<CmdPipe> removeDupsIfAny(List<CmdPipe> pipes) {
	   List<CmdPipe> targetsToKeep = new ArrayList<CmdPipe>();
	   for (CmdPipe t : pipes) {
		   
		   if (!) {
			   targetsToKeep.add(t);
		   }
	   }
	   return targetsToKeep;
   }
    */
	
	@Override
	public void resetEzMojo(EZMojoRoot root, boolean reconnect) {
		if (root != null && root .getRoot() != null) {
			synchronized(ezMojo) {
				root.getRoot().setToken("/");
				ezMojo.setRoot(root.getRoot());
				ezMojo.setFeedback(root.isFeedback());
				ezMojo.setMotionReactor(root.getMotionReactor());
				ezMojo.setSelected(root.getSelected());
				ezMojo.setVarsMode(root.isVarsMode());
				
				ezMojo.getEngines().clear();
				ezMojo.getEngines().addAll(root.getEngines());
				
				ezMojo.setDefault(root.getDefault());
				ezMojo.getTargets().clear();
				
				/*
				ezMojo.getTargets().addAll(removeDupsIfAny(root.getTargets()));
				List<EZMojoTarget> targets = new ArrayList<EZMojoTarget>(getEzTargets());
				targets.addAll(ezMojo.getTargets());
				final List<EZMojoTarget> targetsWithNoDups = removeDupsIfAny(targets);
				if (reconnect) {
					new Job(UUID.randomUUID().toString()) {
						@Override
						protected IStatus run(IProgressMonitor monitor) {
							for (EZMojoTarget t : targetsWithNoDups) {
								if (!"usb://".equals(t.getTransportID()) && !"bt://".equals(t.getTransportID())) {
									if (!EzMojoCmdUtils.INSTANCE.isConnected(t)) {
										EzMojoCmdUtils.INSTANCE.getCmdPipe(t, true); 
										try {
											Thread.sleep(100);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
								}
							}
							return Status.OK_STATUS;
						}
					}.schedule();
				} */
			}
		}
	}	

	public void init() {
		try {
			if (ezMojo.getDefault() == null) {
				final CmdPipe pipe = QuanticMojo.INSTANCE.openUdpPipe(
					"ezmojo",
					addr,
					port
				);
				pipe.setLocked(true);
				pipe.addQxEventHandler(
					new AbstractQxEventHandlerImpl() {
						@Override
						public void handleQxEvent(Event event) {
							//if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
								if (event.getCmd() instanceof EZMojoCmd) {
									handleInputCmd(event.getCmd(), pipe);
								} else if (event.getCmd() instanceof OscCmd) {
									handleInputCmd(
										EzMojoCmdUtils.INSTANCE.createEZMojoCmd(
											getEzMojo().getSelected(), 
											EZMojoKind.LEGACY_SET, 
											((OscCmd) event.getCmd()).getMsg()
										), 
										pipe
									);
								} 
							//}
						}
					}
				);
				ezMojo.getEngines().add(pipe);
				ezMojo.setDefault(pipe);
			}
		} catch (Throwable t) {
			//
		}
	}
	
	private void handleInputCmd(Cmd cmd, CmdPipe pipe) {
		List<EZMojoNode> nodes = ezMojo.accept((EZMojoCmd) cmd);
		EzMojoInfoCmd feedback = null;
		if (((EZMojoCmd) cmd).getKind().equals(EZMojoKind.LEGACY_SET) || 
				((EZMojoCmd) cmd).getKind().equals(EZMojoKind.SET) ) {
			return; // don't feed the troll ^^
		}
		if (nodes != null && !nodes.isEmpty()) {
			feedback = EzMojoAgentCmdUtils.INSTANCE.createEzINFO(
				nodes	
			);
		} else {
			feedback = EzMojoAgentCmdUtils.INSTANCE.createEzINFO(
				"" + ((EZMojoCmd)cmd).getKind().getLiteral()
			);
		}
		if (feedback != null) {
			pipe.send(
				feedback
			);
		}
	}
}
