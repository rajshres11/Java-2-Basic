package string;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="abc";
	      String str1="abc";
	      String str3=new String("abc");
	      //if(str1==str3){
	        //  System.out.println("Both are equal");
	      //}
	      if(str1.equals(str3)){
	          System.out.println("Both are equal");
	      }
	      else{
	          System.out.println("Both are not equal");
	      }
	}

}
