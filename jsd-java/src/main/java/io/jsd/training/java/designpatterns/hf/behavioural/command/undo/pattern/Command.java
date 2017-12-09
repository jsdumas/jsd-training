package io.jsd.training.java.designpatterns.hf.behavioural.command.undo.pattern;

public interface Command {
	public void execute();
	public void undo();
}
