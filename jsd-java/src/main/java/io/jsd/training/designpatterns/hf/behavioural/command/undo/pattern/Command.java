package io.jsd.training.designpatterns.hf.behavioural.command.undo.pattern;

public interface Command {
	public void execute();
	public void undo();
}
