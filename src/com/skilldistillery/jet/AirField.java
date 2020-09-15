package com.skilldistillery.jet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
//private AirField af;
	private List<Jet> jets;

	public AirField() {
		jets = new ArrayList<>();
		jetCreator();
	}

//	public static void main(String[] args) {
	

	public List<Jet> jetCreator() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jet.txt"))) {
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fields = line.split(",");
				if (fields[4].contains("fighter")) {
					Jet newJet = new FighterJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]), fields[4]);
					jets.add(newJet);
				}
				if (fields[4].contains("cargo")) {
					Jet newJet = new CargoPlane(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]), fields[4]);
					jets.add(newJet);
				}
				if (fields[4].contains("passenger")) {
					Jet newJet = new PassengerJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
							Long.parseLong(fields[3]), fields[4]);
					jets.add(newJet);
				}
			}
		bufIn.close();
		} catch (IOException e) {
			System.err.println(e);
		}

		
		return jets;
		
	}
	




	public void listFleet() {
		for (int i = 0 ; i < jets.size() ; i++) {
			System.out.println(jets.get(i));
		}
//			this sysout is just me trying to figure out if i can print off anything from this for loop
//			System.out.println("hello");
			System.out.println();
		}
//	}

	public void flyAllJets() {
		for (int i = 0 ; i < jets.size() ; i ++) {
			jets.get(i).fly();
		}
	}

	
//	Make SURE ALL THE CLASSES LOOK LIKE THEY DO FOR THE FLY METHOD IN JET
	public void fastestJet() {
		double max = 0;
		String fastestJet = null;
		for (int i = 0; i < jets.size(); i++) {
			 if (max < jets.get(i).getSpeed()) {
				max = jets.get(i).getSpeed();
				fastestJet = jets.toString();
			}
		}
		System.out.println(fastestJet);

	}

	public void longestRange() {
		double max = 0;
		String longestRange = "";
		for (int i = 0; i < jets.size(); i++) {

			if (jets.get(i) == null) {
				break;
			} else if (max < jets.get(i).getRange()) {
				max = jets.get(i).getRange();
				longestRange = jets.get(i).toString();
			}
		}
		System.out.println(longestRange);
	}

	public void loadAllCargoJets() {
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i) instanceof CargoPlane) {
				((CargoPlane) jets.get(i)).loadCargo();
			}
		}
	}

	public void dogFight() {
		for (int i = 0; i < jets.size(); i++) {
			if (jets.get(i) instanceof FighterJet) {
				((FighterJet) jets.get(i)).fight();
			}
		}
	}

	public void addJet() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello, you are now adding a jet");
		System.out.println("Please enter the type of jet you would like to add");
		System.out.println("***************************************************");
		System.out.println("1: Fighter Jet");
		System.out.println("2: Cargo Jet");
		System.out.println("3: Passenger Jet");
		System.out.println("****************************************************");
		int userChoice = kb.nextInt();
	
		
	
		switch(userChoice) {
		
		case 1:
			System.out.println("Please enter the model of your new jet: ");
			String model = kb.next();
			System.out.println("Please enter the speed of your jet: ");
			double speed = kb.nextDouble();
			System.out.println("Please enter the range of your jet: ");
			int range = kb.nextInt();
			System.out.println("Please enter the price of your new jet: ");
			long price = kb.nextInt();
			String type = "fighter";
			Jet newFJ = new FighterJet(model, speed, range, price, type);
			jets.add(newFJ);
			System.out.println(newFJ);
			break;
		case 2: 
			System.out.println("Please enter the model of your new jet: ");
			String modelC = kb.next();
			System.out.println("Please enter the speed of your jet: ");
			double speedC = kb.nextDouble();
			System.out.println("Please enter the range of your jet: ");
			int rangeC = kb.nextInt();
			System.out.println("Please enter the price of your new jet: ");
			long priceC = kb.nextLong();
			String typeC = "cargo";
			Jet newCargo = new FighterJet(modelC, speedC, rangeC, priceC, typeC);
			jets.add(newCargo);
			break;
		case 3:
			System.out.println("Please enter the model of your new jet: ");
			String modelP = kb.next();
			System.out.println("Please enter the speed of your jet: ");
			double speedP = kb.nextDouble();
			System.out.println("Please enter the range of your jet: ");
			int rangeP = kb.nextInt();
			System.out.println("Please enter the price of your new jet: ");
			long priceP = kb.nextLong();
			String typeP= "passenger";
			Jet newPassenger = new FighterJet(modelP, speedP, rangeP, priceP, typeP);
			jets.add(newPassenger);
			break;
			default: 
				System.out.println("invalid option. Please enter either 1, 2 or 3");
		}
		kb.close();
	}

	public void removeJet() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please select the jet you would like to remove: ");
		System.out.println("1: F35 ");
		System.out.println("2: fedex ");
		System.out.println("3: 737 ");
		System.out.println("4: raptor ");
		System.out.println("5: airbus ");
		int userChoice = input.nextInt();
		
		switch(userChoice) {
		
		case 1: 
			jets.remove(0);
			break;
		case 2: 
			jets.remove(1);
			break;
		case 3: 
			jets.remove(2);
			break;
		case 4: 
			jets.remove(3);
		case 5: 
			jets.remove(4);
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}

}
