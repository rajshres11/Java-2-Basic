package fundamental;
import java.util.Scanner;
public class assigmenttwo {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
         int n,i,r;
         n = s.nextInt();
        i = 1;
         
         for(i=1;i<=10;i++)
         {
        	 r = (n * i);
             System.out.println(r);
         }
	}
}
