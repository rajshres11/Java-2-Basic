package fundamental;
import java.util.Scanner;
public class Checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Scanner s  = new Scanner(System.in);
    n = s.nextInt();
    
    int div= 2;
    //boolean isPrime = true;
    while(div <= n-1) {
    	if(n % div == 0) {
    	//	System.out.println("composite");
    		System.out.println("composite");
    		
    	//	isPrime = false;
    		return;
    	}
    	div = div + 1;
	}
    System.out.print("prime");
 //   if(isPrime){
    //	System.out.println("Prime");
 //   }else{
    //	System.out.println("Composite");
 //   }

}
}
