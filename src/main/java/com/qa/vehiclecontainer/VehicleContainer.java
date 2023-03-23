package com.qa.vehiclecontainer;

import java.util.ArrayList;
import java.util.List;

import com.qa.garage.vehicle.Vehicle;

public class VehicleContainer<T extends Vehicle> {
	private List<T> list = new ArrayList<T>();

	public void addList(List<T> list) {
		this.list = list;
	}

	public void addVehicle(T v) {
		this.list.add(v);
	}

	public T getVehicle(int i) {
		return list.get(i);
	}

	public List<T> getList() {
		return list;
	}
}
