package io.jsd.training.designpatterns.hf.structural.proxy.gumballmonitor.quarter;

import java.io.*;

public interface State extends Serializable {
 
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
