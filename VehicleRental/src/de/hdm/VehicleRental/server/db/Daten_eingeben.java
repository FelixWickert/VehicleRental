package de.hdm.VehicleRental.server;

public class  Daten_eingeben { 
	
	public static void main {
		
		public einlesen{
			
			system.out.println("Geben Sie eine Automarke ein:");
			Scanner scanner1 = new Scanner(System.in);
			String marke = scanner1.nextLine();
			
			system.out.println("Geben Sie eine Fahrzeugtyp an:");
			Scanner scanner2 = new Scanner (System.in);
			String typ = scanner2.nextLine();
			
			system.out.println("Geben Sie die Leistung des Fahrzeugs an:");
			Scanner scanner3 = new Scanner (System.in);
			String leistung = scanner3.nextLine();
			
			Vehicle vehicle = new Vehicle;
			vehicle.addMarke = marke;
			vehicle.addTyp = typ;
			vehicle.addLeistung = leistung;
			
			system.out.println(vehicle);
		}
		/*
		public ausgeben (){
			
			
			system.out.println (vehicle);
		}*/
	}

}
