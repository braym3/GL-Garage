package com.qa.garage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.qa.garage.vehicle.Bike;
import com.qa.garage.vehicle.Boat;
import com.qa.garage.vehicle.Car;

public class Runner {

	public static void main(String[] args) throws VehicleNotFoundException {
		Garage g = new Garage();

		g.addVehicle(new Car(4, "Black"));
		g.addVehicle(new Boat(0, "Blue"));
		g.addVehicle(new Bike(2, "Red"));
		g.addVehicle(new Car(3, "red"));

		System.out.println(g);

		System.out.println(g.listIDs());

//		g.removeByType("car");
		g.remove(Car.class);
		System.out.println("Removed Cars:");
		System.out.println(g.listIDs());
		;

		// Create list of billable objects
		List<Billable> billObjects = new ArrayList<Billable>();
		// Add some vehicles and employees to billable list
		billObjects.add(new Car(4, "Blue"));
		billObjects.add(new Employee("Bob", 23, "Software"));
		billObjects.add(new Employee("Dave", 41, "DevOps"));
		billObjects.add(new Bike(2, "Orange"));

		// Loop through calling calcBill
		for (Billable b : billObjects) {
			System.out.println(b.getClass().getSimpleName() + " bill = " + b.calcBill());
			// System.out.println(b.toString());
		}
		System.out.println();

		// Try calling find by ID
		// close scanner in a try-with-resources
		try (Scanner scan = new Scanner(System.in);) {
			boolean correctID = false;
			do {
				try {
					// Use scanner to get user input ID
					System.out.println("Enter ID: ");
					int id = scan.nextInt();

					// Print the type of vehicle found from ID
					System.out.println(g.findByID(id).getClass().getSimpleName());
					correctID = true;
				} catch (VehicleNotFoundException vnfe) {
					System.out.println("Vehicle ID not found, try again\n");
				}
			} while (!correctID);

		}
	}

}
