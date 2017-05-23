package de.hdm.VehicleRental.server;

import java.util.Scanner;

import testing.Vehicle;

public class  Daten_eingeben { 
	
	public static void main {
		
		public einlesen{
			
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
		/*
		public ausgeben (){
			
			
			system.out.println (vehicle);
		}*/
	}

}
