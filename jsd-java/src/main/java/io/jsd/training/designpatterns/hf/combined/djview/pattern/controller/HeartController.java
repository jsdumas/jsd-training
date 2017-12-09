package io.jsd.training.designpatterns.hf.combined.djview.pattern.controller;

import io.jsd.training.designpatterns.hf.combined.djview.pattern.DJView;
import io.jsd.training.designpatterns.hf.combined.djview.pattern.model.HeartAdapter;
import io.jsd.training.designpatterns.hf.combined.djview.pattern.model.HeartModelInterface;


public class HeartController implements ControllerInterface {
	HeartModelInterface model;
	DJView view;

	public HeartController(HeartModelInterface model) {
		this.model = model;
		view = new DJView(this, new HeartAdapter(model));
		view.createView();
		view.createControls();
		view.disableStopMenuItem();
		view.disableStartMenuItem();
	}

	@Override
	public void start() {
	}

	@Override
	public void stop() {
	}

	@Override
	public void increaseBPM() {
	}

	@Override
	public void decreaseBPM() {
	}

	@Override
	public void setBPM(int bpm) {
	}
}
