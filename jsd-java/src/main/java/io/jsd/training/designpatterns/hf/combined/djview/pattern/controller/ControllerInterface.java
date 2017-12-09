package io.jsd.training.designpatterns.hf.combined.djview.pattern.controller;

public interface ControllerInterface {
	void start();

	void stop();

	void increaseBPM();

	void decreaseBPM();

	void setBPM(int bpm);
}
