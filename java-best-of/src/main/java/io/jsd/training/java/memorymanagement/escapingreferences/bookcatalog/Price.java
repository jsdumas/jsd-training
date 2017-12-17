package io.jsd.training.java.memorymanagement.escapingreferences.bookcatalog;


import java.util.HashMap;
import java.util.Map;

public class Price {

	private Map<String,Double> rates;
	private Double value;
	
	public Price(Double value) {
		this.value = value;
		rates = new HashMap<String,Double>();
		rates.put("USD", 1d);
		rates.put("GBP", 0.6);
		rates.put("EUR", 0.8);
	}
		
	public Double convert(String toCurrency) {
		
		if (toCurrency.equals("USD")) {
			return value;
		}
		else {
			Double conversion = rates.get("USD") / rates.get(toCurrency);
			//We appear to be mutating a value in a get method
			//value = conversion * value;
			//return value;
			//Fix : 
			return conversion * value;
		}
	}
	
	public String toString() {
		return this.value.toString();
	}
	
	//TODO: Definintely an escaping reference
//	public Map<String,Double> getRates() {
		public Double getRates(String currency) {
		return rates.get(currency);
	}
	
}
