package com.skilldistillery.jet;

public class PassengerJet extends Jet implements PassengerJetActions{
private String type;

	public PassengerJet() {}

	public PassengerJet(String model, double speed, int range, long price, String type) {
		super(model, speed, range, price);
		this.type = type;
	
	}
	
	public void fly() {
		double timeInAir = getSpeed() / getRange();
		System.out.println(toString() + " " + timeInAir);
		}
		
//		System.out.println(getModel()+ " " + "is prepared to fly");
//		loadPassengers();
//		takeOffMessage();
		
	public void getSpeedInMach() {
		double speedInMach = this.getSpeed() / 761;
	}

	@Override
	public void loadPassengers() {
		System.out.println("Welcome to skill distilley airlines, we are now loading all zones");
	}
	
	@Override
	public void takeOffMessage() {
		System.out.println("Hello everyone this is your captain speaking, please buckle up and prepare for takeoff");
	}
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PassengerJet [getType()=" + getType() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}


	

}
