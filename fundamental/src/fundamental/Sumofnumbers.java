package fundamental;
import java.util.Scanner;
public class Sumofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s= new Scanner(System.in);
		  int n;
		  n = s.nextInt();
		  
		  int i=1;
		  int sum = 0;
		  while(i<= n) {
			  sum = sum+i;
		    i++;
		  }
		    
		        System.out.println(sum);
		        
		       
		    
		

	}

}
