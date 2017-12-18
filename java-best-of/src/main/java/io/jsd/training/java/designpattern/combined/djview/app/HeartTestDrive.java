package io.jsd.training.java.designpattern.combined.djview.app;

import io.jsd.training.java.designpattern.combined.djview.pattern.controller.ControllerInterface;
import io.jsd.training.java.designpattern.combined.djview.pattern.controller.HeartController;
import io.jsd.training.java.designpattern.combined.djview.pattern.model.HeartModel;

public class HeartTestDrive {

	public static void main(String[] args) {
		HeartModel heartModel = new HeartModel();
		ControllerInterface model = new HeartController(heartModel);
	}
}
