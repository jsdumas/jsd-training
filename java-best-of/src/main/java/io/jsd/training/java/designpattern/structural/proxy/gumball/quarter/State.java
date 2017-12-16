package io.jsd.training.java.designpattern.structural.proxy.gumball.quarter;

import java.io.*;
  
public interface State extends Serializable {
	public void insertQuarter();
	public void ejectQuarter();
	public void turnCrank();
	public void dispense();
}
