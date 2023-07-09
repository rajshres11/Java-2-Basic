package pattern;
import java.util.Scanner;
public class Checktriangleaagigment {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

         if ((n%2)!=0)
            {
            int i =1;
            while(i<=n)
            {
                if(i<=((n/2)+1))
                   {
                       int space= 1;
                while(space<=(n/2)+1-i)
                {
                    System.out.print(' ');
                    space++;
                }
                int star=1;
                while(star<=2*i-1)
                {
                    System.out.print('*');
                    star++;
                }
                	}
                	else
                    {
                        int space= 1;
                while(space<i-(n/2))
                {
                    System.out.print(' ');
                    space++;
                }
                int star=1;
                while(star<=2*(n-i)+1)
                {
                    System.out.print('*');
                    star=star+1;
                }
                
                	}
                
             System.out.println();
             i=i+1;
             }
            }
    }
}
    