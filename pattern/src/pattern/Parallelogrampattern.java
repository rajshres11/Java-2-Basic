package pattern;
import java.util.Scanner;
public class Parallelogrampattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	    
		Scanner sc = new Scanner(System.in);
				
				int row = sc.nextInt();
				// int col = sc.nextInt();
		        int col=row;
				
				for (int i = 1; i <= row; i++) {
					for (int j = 1; j <= i-1; j++) 
					    	System.out.print(" ");
					for (int j = 1; j <= col; j++) 
						System.out.print("*");
					System.out.println();
				}


}
}

