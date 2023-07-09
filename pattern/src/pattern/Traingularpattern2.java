

package pattern;
import java.util.Scanner;
public class Traingularpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int p=1;
        while(i<=n) {
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

