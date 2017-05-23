package de.hdm.VehicleRental.server.db;

import java.util.Scanner;

import de.hdm.VehicleRental.shared.bo.Vehicle;

import java.util.Scanner;

import testing.Vehicle;

public class  Daten_eingeben { 
	
	public static void main (){
		
			System.out.println("Geben Sie eine Automarke ein:");
			Scanner scanner1 = new Scanner(System.in);
			String marke = scanner1.nextLine();
			
			System.out.println("Geben Sie eine Fahrzeugtyp an:");
			Scanner scanner2 = new Scanner (System.in);
			String typ = scanner2.nextLine();
			
			System.out.println("Geben Sie die Leistung des Fahrzeugs an:");
			Scanner scanner3 = new Scanner (System.in);
			String leistung = scanner3.nextLine();
			
			System.out.println("Geben Sie eine Kategorie für das Fahrzeug an:");
			Scanner scanner4 = new Scanner (System.in);
			String kategorie = scanner4.nextLine();
			
			Vehicle vehicle = new Vehicle();
			vehicle.setBrand(marke);
			vehicle.setModel(typ);
			vehicle.setPerformance(leistung);
			vehicle.setCategory(kategorie);
						
			System.out.println(VehicleMapper.findByID(1));
		}
		
	}
/*
		public ausgeben (){
			
			
			system.out.println (vehicle);
		}*/
}
