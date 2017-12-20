package io.jsd.training.designpattern.combined.djview.pattern.model;

import io.jsd.training.designpattern.combined.djview.pattern.observer.BPMObserver;
import io.jsd.training.designpattern.combined.djview.pattern.observer.BeatObserver;


public interface HeartModelInterface {
	int getHeartRate();

	void registerObserver(BeatObserver o);

	void removeObserver(BeatObserver o);

	void registerObserver(BPMObserver o);

	void removeObserver(BPMObserver o);
}
