package Inheritance;

public abstract class car extends Vehicle{

	int numdoors;
	//int maxspeed;
	int numgears;
	
	public car() {
	//	super(100);
    System.out.println("car constructer");
     numdoors = 4;
     numgears= 5;	
	}
	
	
	public car(int numdoors,int maxspeed) {
	//	super(100);
		super(maxspeed);
		System.out.println("cars consstructer");
		this.numdoors = numdoors;
	}
	
//	public void printcar() {
//		System.out.println("car"+ "color" +" "+ getcolor() +" " + "maxspeed"+" " + maxspeed+ " "+"numdoors"+numdoors);
//	}

	public void print() {
		super.print();
	System.out.println("numdoors"+" "+numdoors+" "+"numgears"+" "+ numgears);
		//System.out.println("car"+ "color" +" "+ getcolor() +" " + "maxspeed"+" " + maxspeed+ " "+"numdoors"+numdoors);
	}
	
	public void printmaxspeed() {
		//super.maxspeed=150;
		maxspeed = 100;
		System.out.println(maxspeed+" "+ maxspeed);
	}
	
	public boolean ismotorized() {
		return true;
	}
}
