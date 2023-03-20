package com.qa.garage.vehicle;

import com.qa.garage.Billable;

public abstract class Vehicle implements Billable {

	private int numWheels;

	private String colour;

	private final int id;

	public static int idCount;

	public Vehicle(int numWheels, String colour) {
		super();
		this.numWheels = numWheels;
		this.colour = colour;
		this.id = idCount;
		idCount++;
	}

	@Override
	public abstract int calcBill();;

	public int getId() {
		return this.id;
	}

	public int getNumWheels() {
		return this.numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	public String getColour() {
		return this.colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [numWheels=" + this.numWheels + ", colour=" + this.colour + "]";
	}

}
