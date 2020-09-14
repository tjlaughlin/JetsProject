package com.skilldistillery.jet;


import java.util.List;
import java.util.Scanner;

public class JetsApplication {
	private static AirField af;
	List<Jet> jets;
public static void main(String[] args) {
		JetsApplication app = new JetsApplication();
		app.run();

		
	}
private void run() {
	af = new AirField();
	boolean keepGoing = true;
	while(keepGoing) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hello and welcome to the skill distillery airfield!");
		System.out.println("Here is the menu for the interactive airfield, please select one of the following options:");
		System.out.println("1: List fleet");
		System.out.println("2: Fly all jets");
		System.out.println("3: View fastest jet");
		System.out.println("4: View jet with the longest range");
		System.out.println("5: Load al the cargo jets");
		System.out.println("6: Dogfight");
		System.out.println("7: add jet to fleet");
		System.out.println("8: Remove jet from fleet");
		System.out.println("9: quit");
		
		int menuChoice = userInput.nextInt();
		
		
		switch (menuChoice) {
		
		case 1:
			af.listFleet(jets); 
			break;
		case 2: 
			af.flyAllJets(jets);
			break;
		case 3: 
			af.fastestJet(jets);
			break;
		case 4: 
			af.longestRange(jets);
			break;
		case 5:
			af.loadAllCargoJets(jets);
			break;
		case 6: 
			af.dogFight(jets);
			break;
		case 7:
			af.dogFight(jets);
			break;
		case 8: 
			af.addJet();
		case 9:
			System.out.println("thanks for coming, goodbye!");
			keepGoing = false;
			break;
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
}
