 package pattern;
import java.util.Scanner;
public class Characterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i = 1;
	        int p;
	        while(i<=n) {
	        	
	        	int j = 1;
	        	while(j<=n) {
	        		char jthChar = (char)('A' + j - 1);
	        		System.out.print(jthChar);
	        		
	        		j++;
	        	}
	        	System.out.println();
	        	i++;
	        }
	}

}
