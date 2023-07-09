package string;

public class Reverseestring {
   
	public static String reverse(String str) {
		String reversestr="";
		//for(int i=str.length()-1;i>=0;i--)
		for(int i=0;i<str.length();i++){
		//	reversestr+=str.charAt(i);
			reversestr=str.charAt(i)+reversestr;
		}
		return reversestr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str ="abcde";
        String reversestr=  reverse(str);
          System.out.print(reversestr);
	}

}
