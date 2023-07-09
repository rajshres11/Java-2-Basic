package fundamental;
import java.util.Scanner;
public class Assigmentone {
	
	
		
		public static void main(String[] args) {
		//	 Write your code here
	       int bs,al;
	       double hra,da,pf;
	        double ts;
	        Scanner s = new Scanner(System.in);
	        
	        bs= s.nextInt();
	        String str = s.next();
	        char ch = str.charAt(0);
	        
	        hra = bs*0.2;
	        da = bs*0.5;
	        
	        pf = bs*0.11;
	         
	        if(ch =='A'){
	            al = 1700;
	            System.out.println(ts=bs+da+hra+al-pf);
	        }else if(ch == 'B'){
	            al= 1500;
	            System.out.println(ts=bs+da+hra+al-pf);
	        }else
	        {
	            al= 1300;
	            System.out.println(ts=bs+da+hra+al-pf);
	        }
	        
	        
		}
	}
//import java.util.Scanner;
//public class Main {
	
	// public static void main(String[] args) {
      //  Scanner sc=new Scanner(System.in);
        //int basic=sc.nextInt();
  //
//char grade=sc.next().charAt(0);
  //      double totalsalary;
    //    double hra=0.2*basic;
      //  double da=0.5*basic;
   //     double pf=0.11*basic;
     //   int allow=0;
      //  if(grade=='A')
        //{
       // allow=1700;
     //   }
   //     else if(grade=='B')
     //   {
      //  allow=1500;
      //  }
   //     else{
     //   allow=1300;
       // }
         //totalsalary=basic+hra+da+allow-pf;
         //totalsalary1=(int)totalsalary;
        // System.out.println(Math.round(totalsalary));
    //}
//}





