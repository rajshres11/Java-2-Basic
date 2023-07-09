package Inheritance;
//drive class
//public class final vehicle
public abstract class Vehicle {

	final private String color;
	public int maxspeed;
	
	public Vehicle() {
		color = "red";
		System.out.println("vehicle construscter");
		maxspeed = 60;
	}
	
	public Vehicle(int maxspeed) {
		color = "red";
		System.out.println("vehicles consstructer");
		this.maxspeed = maxspeed;
	}
	
	
	public String getcolor() {
		return color;
	}
	
//	public void setcolor(String color) {
//		this.color = color;
//		return;
//	}
//	final public void print()
	 public void print() {
		System.out.println("Vehicle"+ "color" +" "+ color +" "+ "maxspeed"+" " + maxspeed);
	}
	
	public abstract boolean ismotorized() ;
		
	public abstract String getcompany();
}
