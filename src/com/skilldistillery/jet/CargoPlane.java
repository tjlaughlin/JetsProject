package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoPlaneActions{
	private String type;
	private double cargoCapacity;


	public CargoPlane() {}

	public CargoPlane(String model, double speed, int range, long price, String type, double cargoCapacity) {
		super(model, speed, range, price);
		this.type = type;
		this.cargoCapacity = cargoCapacity;
	}

	public void loadCargo() {
		System.out.println("wake up guys we gotta load the plane! ");
	}
	
	public void fly() {
		System.out.println(getModel()+ " " + "is prepared to fly");
		wrapCargo();
		loadingTruck();
		tieDownCargo();
		
	}

	@Override
	public void wrapCargo() {
		System.out.println("Start wrapping the cargo in bubble wrap");
		System.out.println("Dont need aything breaking on our watch");
	}

	@Override
	public void loadingTruck() {
		System.out.println("Here comes the loading truck! Stay out of the way");
	}

	@Override
	public void tieDownCargo() {
		System.out.println("Grab the tiedowns! we dont need all this stuff moving durig the flight");
			System.out.println("We all know how crazy Dee flys on fridays");

	}

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CargoPlane [type=" + type + ", cargoCapacity=" + cargoCapacity + ", getCargoCapacity()="
				+ getCargoCapacity() + ", getType()=" + getType() + "]";
	}

	
}
