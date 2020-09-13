package com.skilldistillery.jet;

public class CargoPlane extends Jet implements CargoPlaneActions{
	private String type;
	


	public CargoPlane() {}

	public CargoPlane(String model, double speed, int range, long price, String type) {
		super(model, speed, range, price);
		this.type = type;
	
	}

	public void loadCargo() {
		System.out.println(getModel()+ " " + "is prepared to fly");
		System.out.println("wake up guys we gotta load the plane! ");
		wrapCargo();
		loadingTruck();
		tieDownCargo();
		System.out.println("");
	}
	
	public void fly() {
		double timeInAir = getSpeed() / getRange();
	System.out.println(toString() + " " + timeInAir);
	}
	
	public void getSpeedInMach() {
		double speedInMach = this.getSpeed() / 761;
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



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CargoPlane [getType()=" + getType() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}



	
}
