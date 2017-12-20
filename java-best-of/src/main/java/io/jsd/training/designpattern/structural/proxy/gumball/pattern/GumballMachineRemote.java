package io.jsd.training.designpattern.structural.proxy.gumball.pattern;

import java.rmi.*;

import io.jsd.training.designpattern.structural.proxy.gumball.quarter.State;
 
public interface GumballMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public String getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
