package io.jsd.training.designpattern.behavioural.command.undo.pattern;

public interface Command {
	public void execute();
	public void undo();
}
