

package pattern;
import java.util.Scanner;
public class Traingularpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int p;
        while(i<=n) {
        	p=i;
        	int j = 1;
        	while(j<=i) {
        		
        		System.out.print(p);
        		p++;
        		j++;
        	}
        	System.out.println();
        	i++;
        }
	}

}


