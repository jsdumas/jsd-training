package io.jsd.training.java.designpattern.reference;

import java.util.Date;

public class Car implements Movable {
	private static final String CAR_MOVE_FORWARD = "Car move forward";
	private static final String CAR_MOVE_BACK = "Car move backward";
	private String brand;
	private String modele;
	private Date dateMiseEnCirculation;

	public Car() {
		super();
	}

	public Car(String brand, String modele, Date dateMiseEnCirculation) {
		super();
		this.brand = brand;
		this.modele = modele;
		this.dateMiseEnCirculation = dateMiseEnCirculation;
	}

	@Override
	public String moveForward() {
		System.out.println(CAR_MOVE_FORWARD);
		return CAR_MOVE_FORWARD;
	}

	@Override
	public String moveBack() {
		System.out.println(CAR_MOVE_BACK);
		return CAR_MOVE_BACK;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Date getDateMiseEnCirculation() {
		return dateMiseEnCirculation;
	}

	public void setDateMiseEnCirculation(Date dateMiseEnCirculation) {
		this.dateMiseEnCirculation = dateMiseEnCirculation;
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
