package net.sf.smbt.ui.console.mojo;

import net.sf.smbt.ezmojo.EZCmdKind;

public class EzInterpreterFeedback {
	private EZCmdKind type;
	private String text;

	public final static EzInterpreterFeedback OK = new EzInterpreterFeedback(EZCmdKind.OK, ""); 
	public final static EzInterpreterFeedback CLEAR = new EzInterpreterFeedback(EZCmdKind.CLEAR, ""); 
	public final static EzInterpreterFeedback PROTOCOL = new EzInterpreterFeedback(EZCmdKind.PROTOCOL, ""); 
	
	public EzInterpreterFeedback(EZCmdKind k, String txt) {
		type = k;
		text = txt;
	}
	public String getText() {
		return text;
	}
	public EZCmdKind getType() {
		return type;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void setType(EZCmdKind type) {
		this.type = type;
	}
}
