package generics;

public class Vehicle implements printinterface {

	int maxspeed;
	String company;
	
	
	
	public Vehicle(int maxspeed, String company) {
		super();
		this.maxspeed = maxspeed;
		this.company = company;
	}
	
	public void print() {
		System.out.println(maxspeed+" "+ company);
	}
}
