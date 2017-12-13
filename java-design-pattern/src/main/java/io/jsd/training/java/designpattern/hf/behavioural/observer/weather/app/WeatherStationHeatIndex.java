package io.jsd.training.java.designpattern.hf.behavioural.observer.weather.app;

import java.util.*;

import io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern.CurrentConditionsDisplay;
import io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern.ForecastDisplay;
import io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern.HeatIndexDisplay;
import io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern.StatisticsDisplay;
import io.jsd.training.java.designpattern.hf.behavioural.observer.weather.pattern.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
