package com.scenario;

class Vehicle{
	String make;
	String model;
	int year;
	public void displayInfo() {
		System.out.println("make:"+make+"\n"+"model:"+model+"\n"+"year:"+year);
		
	}
}
 class Car extends Vehicle{
	 int numberOfDoors;
	 public Car(String make,String model,int year,int numberOfDoors) {
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 this.numberOfDoors=numberOfDoors;
	}
	 public void displayCarInfo() {
		 System.out.println("Number of Doors:"+numberOfDoors);
	 }
 }
 class Truck extends Vehicle{
	 int cargoCapacity;
	 public Truck(String make,String model,int year,int cargoCapacity) {
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 this.cargoCapacity=cargoCapacity;
	 }
	 public void displayTruckInfo() {
		 System.out.println("Cargo Capacity:"+ cargoCapacity);
	 }
 }
 class Motorcycle extends Vehicle{
	 boolean hasSidecar;
	 public Motorcycle(String make,String model,int year,boolean hasSidecar) {
		 this.make=make;
		 this.model=model;
		 this.year=year;
		 this.hasSidecar=hasSidecar;
	 }
	 public void displayMotorcycleInfo() {
		 if(hasSidecar==true) {
		 System.out.println(true);
		 }
		 else {
			 System.out.println(false);
		 }
	 }
 }
 
public class Vehicle1 {
	
	public static void main(String[] args) {
		Vehicle car= new Car("Toyiota:","Corolla",2022,4);
		car.displayInfo();
		((Car) car).displayCarInfo();
		Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);
		truck.displayInfo(); 
		((Truck) truck).displayTruckInfo();
		Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Street Glide", 2023, true);
		motorcycle.displayInfo(); 
		((Motorcycle) motorcycle).displayMotorcycleInfo();

	}

}
