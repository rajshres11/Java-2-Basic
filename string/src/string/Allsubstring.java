package string;

public class Allsubstring {

    public static void printSubstrings(String str){

	for(int start=0;start<str.length();start++){
        //We will be printing all substrings starting with char at index start
        for(int end=start;end<str.length();end++){
            System.out.println(str.substring(start,end+1));
        }
    
}
    }
    
    public static void main(String args[]) {
        String str="pqrs";
        printSubstrings(str);
}
}
