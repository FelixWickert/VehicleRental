package de.hdm.VehicleRental.shared.bo;

import java.util.Vector;


public class Profile extends BusinessObject {
	
	private Vector<Vehicle> memoryList = new Vector<>();
	private Vector<Vehicle> reservation = new Vector<>();
	
	private int driversLicence;
	private double balance;
	private String LastName;
	private String FirstName;
	private String gender;
	private String email;
	private String adress;
	

	
	
//	// TODO 
//	public Vector <Vehicle> getVehicle() {
//		return getAllVehiclesByProfile(this);
//	}

//	public void add(Vehicle vehicle){
//		
//		//1. Profil in Vehicle schreiben
//		this.reservation.add(vehicle);
//		//2. Vehicle in Profil schreiben
//		vehicle.getReservation().add(this);
//		//3. Vehicle in Datenbank schreiben
//		vm.update(vehicle);
//		//4. Profil in Datenbank schreiben
//		pm.update(this);
//		//5. Reservation in Datenbank schreiben
//		rm.insert(vehicle, this);
//		}
	
//	public void removeReservation(Vehicle vehicle){
//		if (vehicle != null){
//			if (this.reservation != null){
//				this.reservation.remove(vehicle);
//				vm.update(vehicle);
//				pm.update(this);
//			}
//			vehicle.setReservation(null);
//			vm.update(vehicle);
//			pm.update(this);
//		}
//	}
	
	// TODO 

	public void addVehicleToReservation(Vehicle vehicle) {
		this.reservation.add(vehicle);
	}
	
	public void setReservation(Vehicle vehicle) {
		if (vehicle == null && this != null) {
			this.reservation.remove(this);
		}
	}

	public Vector<Vehicle> getReservations() {
		return this.reservation;
	}

	public void deleteVehicleFromReserveration(Vehicle vehicle) {
		reservation.remove(vehicle);
	}

	

	

	
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

//	public double getBalance() {
//		return balance;
//	}
//
//	public void setBalance(double balance) {
//		this.balance = balance;
//	}

	
	public void addVehicleToMemorylist(Vehicle v) {
		this.memoryList.add(v);
	}
	
	
	public int getDriversLicence() {
		return driversLicence;
	}

	public void setDriversLicence(int driversLicence) {
		this.driversLicence = driversLicence;
	}

//	public String getGender() {
//		return gender;
//	}
//
//	public void setGender(String gender) {
//		this.gender = gender;
//	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



//	public String getAdress() {
//		return adress;
//	}
//
//	public void setAdress(String adress) {
//		this.adress = adress;
//	}
	

}
