package fundamental;

public class Pecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //  int i = 10;
 //  int a= ++i * 5;
   
   int a=10;
   a+=++a-5/3+6*a;
   System.out.print(a);
	}

}
