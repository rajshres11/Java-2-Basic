package Inheritance_temp;
import Inheritance.Vehicle;
public class truck extends Vehicle {
//drive class
	int maxloadingcapacity;
	
	public void print() {
		System.out.println("Vehicle"+ "color" +" "+ getcolor() +" "+ "maxspeed"+" " + maxspeed+ "maxloadingcapaity"+ maxloadingcapacity);
	}
}
