package io.jsd.training.java.designpatterns.hf.combined.djview.pattern.model;

import io.jsd.training.java.designpatterns.hf.combined.djview.pattern.observer.BPMObserver;
import io.jsd.training.java.designpatterns.hf.combined.djview.pattern.observer.BeatObserver;


public interface HeartModelInterface {
	int getHeartRate();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);
}
