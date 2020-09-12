package com.skilldistillery.jet;

public class FighterJet extends Jet implements FighterJetActions {
private String type;
	
	
	public FighterJet() {}

	public FighterJet(String model, double speed, int range, long price, String type) {
		super(model, speed, range, price);
		this.type = type;
	}

	public void fly() {
		System.out.println(getModel()+ " " + "is prepared to fly");
		scrambleJets();
		loadAmmunition();
		fight();
	}
	
	@Override
	public void scrambleJets() {
		System.out.println("Enemy planes spotted, scramble the fighter jets!!");
	}

	@Override
	public void loadAmmunition() {
		System.out.println("this is not a drill, load up fighter jets with ammunition and missiles!");
	}

	public void fight() {
		scrambleJets();
		loadAmmunition();
		System.out.println("locked on enemy target! fire missiles!");
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "FighterJet [getType()=" + getType() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed()
				+ ", getRange()=" + getRange() + ", getPrice()=" + getPrice() + "]";
	}

	
}


