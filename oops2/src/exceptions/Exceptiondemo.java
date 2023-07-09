package exceptions;

public class Exceptiondemo {

	public static int fact(int n) throws negativenumberexception  {
		if(n<0) {
			throw new negativenumberexception();
		}
		int ans = 1;
		for(int i=2; i<=n; i++) {
			ans = ans*i;
		}
		return ans;
	}
	
	
	public static int divide(int a, int b) throws dividebyException {
		if(b==0) {
			throw new dividebyException();
		//	throw new ArithmeticException();
		}
		return a/b;
	}
	public static void main(String[] args) //throws dividebyException 
	{
		// TODO Auto-generated method stub
       
	//	String s = null;
	//	System.out.println(s.length());
	//	System.out.println(4 / 0);
		try {
			divide(10,5);
			System.out.println(fact(-1));
			System.out.println("within try"); //not print
		}catch (dividebyException e) {
			System.out.println("Divide by zero exception raised ");
	//		e.printStackTrace();
		} catch (negativenumberexception e) {
			// TODO Auto-generated catch block
			System.out.println("negative number exception");
			//e.printStackTrace();
		}catch(Exception e) {
			System.out.println("generic exception");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("main");
	}

}
