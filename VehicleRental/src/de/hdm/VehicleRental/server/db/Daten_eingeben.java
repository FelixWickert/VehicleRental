package de.hdm.VehicleRental.server.db;

import java.util.Scanner;

import de.hdm.VehicleRental.shared.bo.Vehicle;

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
			
			Vehicle vehicle = new Vehicle();
			vehicle.addMarke = marke;
			vehicle.addTyp = typ;
			vehicle.addLeistung = leistung;
			
			System.out.println(vehicle);
		}
		
	}
/*
		public ausgeben (){
			
			
			system.out.println (vehicle);
		}*/
}
