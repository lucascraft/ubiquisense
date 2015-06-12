/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2010, Lucas Bigeardel
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

package net.sf.smbt.blinkm.cmd.tests;

import junit.framework.TestCase;

public class CmdEngineDefaultTestCase extends TestCase {
//    static CmdEngine engine;
    public CmdEngineDefaultTestCase(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
//        checkAndInitCmdEngine();
    }
    
//    private void checkAndInitCmdEngine() {
//      if (engine == null) {
//            engine = EngineUtil.INSTANCE.createSimpleCmdEngine();
//       }
//    }
    
//    public void testAddCmdToCmdEngineTxAndRxQueues() {
//        int NB_CMD_TO_ADD = 1000;
//        for (Qx q : engine.getQueues()) {
//            for (int i = 0, max = NB_CMD_TO_ADD; i < max; i++) {
//                EngineUtil.INSTANCE.sendCmd(q, BlinkMUtil.INSTANCE.generateRamdomBlinkMCmd());
//                System.out.println("Size : " + q.getCommands().size());
//            }
//        }
//    }
//    
//    public void testAppEngineWithSingleClientRunning() {
//    	EngineApplication app = AppEngineUtil.INSTANCE.createSimpleEngineApplicationWithSingleEngineClient(
//    			AppEngineUtil.START_ENGINE_CLIENT, 
//    			BlinkMUtil.INSTANCE.getInterpreter()
//    	);
//    	CmdEngine engine = app.getEngine().get(0);
//        int NB_CMD_TO_ADD = 1000;
//        for (Qx q : engine.getQueues()) {
//            for (int i = 0, max = NB_CMD_TO_ADD; i < max; i++) {
//                EngineUtil.INSTANCE.sendCmd(q, BlinkMUtil.INSTANCE.generateRamdomBlinkMCmd());
//                System.out.println("Size : " + q.getCommands().size());
//            }
//        }
//        app.getClients().get(0).getRunner().done(Status.CANCEL_STATUS);
//    }
//    
//    
//    //
//    // 
//    //
//    
//    public void testAppEngineWithClientRunningFeededByFiveBlinkMCmdSimulators() {
//    	EngineApplication app = AppEngineUtil.INSTANCE.createSimpleEngineApplicationWithSingleEngineClient(
//    			AppEngineUtil.START_ENGINE_CLIENT,
//    			BlinkMUtil.INSTANCE.getInterpreter()
//    	);
//    	
//    	int[] idx = new int[] { 0, 1, 2, 3, 4 };
//    	
//    	final List<Job> jobs = new ArrayList<Job>();
//    	for (@SuppressWarnings("unused") int i : idx) {
//    		Job j = new QxCmdFeedingSimulator(app.getEngine().get(0), 25000);
//    		jobs.add(j);
//    		j.schedule();
//    	}
//    	
//		while(true) {
//			if (jobs.get(0).getState() != Job.RUNNING &&
//					jobs.get(0).getState() != Job.SLEEPING &&
//					jobs.get(0).getState() != Job.WAITING
//			) {
//		    	app.getClients().get(0).getRunner().done(Status.CANCEL_STATUS);
//				return;
//			}
//		}
//		
//    }
    
//    public void testAppEngineWithClientRunningFeededByBlinkMSetRGBColorCmdSimulator() {
//    	EngineApplication app = AppEngineUtil.INSTANCE.createSimpleEngineApplicationWithSingleEngineClient(
//    			AppEngineUtil.START_ENGINE_CLIENT,
//    			BlinkMUtil.INSTANCE.getInterpreter()
//    	);
//    	
//    	BlinkMSetRGBColorCmdFeedingSimulator simulator = new BlinkMSetRGBColorCmdFeedingSimulator(app.getEngine().get(0), 10000);
//    	simulator.schedule();
//    	
//    	while(simulator.isRunning());
//    }
    
    public void testAppEngineWithClientRunningFeededByPulsatileBlinkMSetHSBColorCmdSimulator() {
    	
		//Injector injector = Guice.createInjector(new OrchestrorUtilsModule());
		//OrchestrorUtil orchestrorUtil = (OrchestrorUtil) injector.getInstance(IOrchestrorUtils.class);
    	
    	
    	//BlinkMPulsatileSetHSBColorCmdFeedingSimulator simulator = new BlinkMPulsatileSetHSBColorCmdFeedingSimulator(
    	//	orchestrorUtil.loadOrchestror("data/one-track.orchestror").getApplication().getEngine().get(0), 10000
    	//);
    //	simulator.schedule();
    	
    	//while(simulator.isRunning());
    }
}
