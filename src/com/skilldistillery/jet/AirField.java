package com.skilldistillery.jet;

import java.util.List;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class AirField {

	List <Jet> jets;

	public void reader() {
	try (BufferedReader bufIn = new BufferedReader(new FileReader("jet.txt"))) {
		String line;
		while ((line = bufIn.readLine()) != null) {
			String[] fields = line.split(",");
			Jet newJet = new FighterJet(fields[0], Double.parseDouble(fields[1]), Integer.parseInt(fields[2]),
					Long.parseLong(fields[3]), fields[4]);
			jets.add(newJet);
		}
	} catch (IOException e) {
		System.err.println(e);
	}

	for (Jet jet : jets) {
		System.out.println(jet);
		} 
	}
	
	
	public AirField() {
	}

	public void listFleet(List<Jet> jets) {
		for (Jet jet : jets) {
			System.out.println(jet.toString());
		}
	}
	
	public void flyAllJets(List<Jet> jets) {
		for (Jet jet : jets) {
			((Jet) jet).getModel();
			System.out.println();
		}
	}
	public void fastestJet(List<Jet> jets) {
		double max = 0;
		String fastestJet = "";
		for (int i = 0; i < jets.size(); i++) {

			if (jets == null) {
				break;
			} else if (max < jets.get(i).getSpeed()) {
				max = jets.get(i).getSpeed();
				fastestJet = jets.toString();
			}
		}
		System.out.println(fastestJet);

	}
	public void longestRange(Jet [] jets) {
		double max = 0;
		String longestRange = "";
		for (int i = 0; i < jets.length; i++) {

			if (jets[i] == null) {
				break;
			} else if (max < jets[i].getRange()) {
				max = jets[i].getRange();
				longestRange = jets[i].toString();
			}
		}
		System.out.println(longestRange);
	}
	public void loadAllCargoJets(Jet [] jets) {
		for (Jet jet : jets) {
			if(jets[5] instanceof("cargo")) {
				
			}
		}
	}
	public void dogFight(Jet [] jets) {
	
		
		
	}
	public void addJet(Jet jet) {
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] == null) {
				jets[i] = jet;
				break;
			}
		}
	}

}
