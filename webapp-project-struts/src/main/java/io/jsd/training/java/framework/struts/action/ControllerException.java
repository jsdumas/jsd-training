package io.jsd.training.java.framework.struts.action;

public class ControllerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ControllerException(String message, Throwable e){
		super(message, e);
	}

}
