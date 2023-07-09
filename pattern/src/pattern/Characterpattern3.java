package pattern;
import java.util.Scanner;
public class Characterpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int i=1;
	        
	        while(i<=n) {
	        	char p = (char)('A' + i - 1);
	        	int j = 1;
	        	while(j<=i) {
	        	
	        		System.out.print(p);
	        		p =(char)(p+1);
	        		j++;
	        	}
	        	System.out.println();
	        	i++;
	        
  }

}
	}


