package fundamental;

import java.util.Scanner;
public class Solutions {
    
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        String str = s.next();
        char ch = str.charAt(0);
        
        if(ch>'A'&&ch<'Z'){
            System.out.print("1");
        }else{
            if(ch>'a'&&ch<'z'){
                System.out.print("0");
                
            }else{
                System.out.print("-1");
            }
        }

    }
}