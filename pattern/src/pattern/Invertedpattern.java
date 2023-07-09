package pattern;
import java.util.Scanner;
public class Invertedpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner s= new Scanner(System.in);
          int n = s.nextInt();
          int i=1;
          while(i<=n) {
        	  int j=1;
        	 
        	  while(j<=n-i+1) {
        		  int p= n-i+1;
        		  System.out.print(p);
        		  
        				  j++;
          }
        	  System.out.println();
        	  i++;
	}

}
}
