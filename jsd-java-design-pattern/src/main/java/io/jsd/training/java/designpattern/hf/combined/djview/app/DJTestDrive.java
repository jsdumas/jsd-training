package io.jsd.training.java.designpattern.hf.combined.djview.app;

import io.jsd.training.java.designpattern.hf.combined.djview.pattern.controller.BeatController;
import io.jsd.training.java.designpattern.hf.combined.djview.pattern.controller.ControllerInterface;
import io.jsd.training.java.designpattern.hf.combined.djview.pattern.model.BeatModel;
import io.jsd.training.java.designpattern.hf.combined.djview.pattern.model.BeatModelInterface;

public class DJTestDrive {

	public static void main(String[] args) {
		BeatModelInterface model = new BeatModel();
		ControllerInterface controller = new BeatController(model);
	}
}
