package fundamental;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		
		int rem=a%2;
		boolean result= rem==0;
		//if(result)
		//if(rem==0)
		if(result==true) {
			System.out.print(a+ "is even");
		}else
		{
			System.out.println(a+ "is odd");
			
		}
		

	}

}
