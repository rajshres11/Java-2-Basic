package fundamental;
import java.util.Scanner;

public class Largestoftwo {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a,b;
		a = s.nextInt();
		b = s.nextInt();
		// TODO Auto-generated method stub
       if(a>b) {
    	   System.out.print("a os greater");
       }
       
       else{
    	   //nested
    	   if(b>a) {
    	   System.out.print("b is greater");
    	   
    	   
       }else {
    	   System.out.print("both are equal");
       }

}
}
}