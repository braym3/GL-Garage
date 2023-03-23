package com.qa.vehiclecontainer;

import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;

public class Demo {

	public static void main(String[] args) {

		// Make a vehicle container for cars
		VehicleContainer<Car> carContainer = new VehicleContainer<>();
		carContainer.addVehicle(new Car(4, "Blue"));
		carContainer.addVehicle(new Car(4, "Red"));

		Car c1 = carContainer.getVehicle(0);

		System.out.println(c1.getColour() + " " + c1.getClass().getSimpleName());

		// Make a vehicle container for boats
		VehicleContainer<Boat> boatContainer = new VehicleContainer<>();
		boatContainer.addVehicle(new Boat(8, "Orange"));
		boatContainer.addVehicle(new Boat(2, "Yellow"));

		Boat b1 = boatContainer.getVehicle(1);

		System.out.println(b1.getColour() + " " + b1.getClass().getSimpleName());

	}

}
