package pattern;

import java.util.Scanner;

public class iscoseles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int i=1;
	     while(i<=n){
	         int spaces=1;
	         while(spaces<=n-i){
	             System.out.print(" ");
	             spaces=spaces+1;
	         }
	         
	         int num=1;
	         int p=i;
	         while(num<=i){
	             System.out.print(p);
	             p=p+1;
	             num=num+1;
	         }
	         
	         
	         int p2=i-1;
	         int j=i-1;
	         while(j>=1){
	             System.out.print(p2+i-1);
	             p2=p2-1;
	             j=j-1;
	         }
	         
	         System.out.println();
	         i=i+1;
	     }
         
        
    

}
}
