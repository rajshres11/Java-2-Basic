package recursion;

public class recursion {

	public static int fact(int n) {
		if (n == 1) {
			return 1;
		}
		int smallOutput = fact(n-1);
		int Output = n*smallOutput;
		return Output;
	}
	
	public static int sumn(int n) {
		 if(n==0) {
			 return 0;
		 }
		 int smalloutput = sumn(n-1);
		 int output = n+smalloutput;
		 return output;
	}
	public static void print1ton(int n) {
		if(n== 0) {
			return;
		}
		print1ton(n-1);
		System.out.println(n);
	}
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}
		int fib_n_1 =fib(n - 1);
		int fib_n_2 =fib(n - 2);
		int output = fib_n_1 + fib_n_2;
		return output;
	}
	public static boolean isSorted(int a[]) {
		if(a.length == 1) {
			return true;
		}
		if(a[0] > a[1]) {
			return false;
		}
		int smallarray[] = new int[a.length - 1];
		for(int i = 1;i<a.length;i++) {
			smallarray[i-1] = a[i];
			
		}
		boolean isSmallarraySorted = isSorted(smallarray);
		
		return isSmallarraySorted;
	}
    public static boolean isSortedbetter(int a[], int si) {
    	if(si == a.length-1) {
    		return true;
    	}
    	if(a[si]>a[si+1]) {
    		return false;
    	}
boolean isSmallarraySorted = isSortedbetter(a,si+1);
		
		return isSmallarraySorted;
    }
    
    public static int firstIndex(int a[],int x){
        if(a.length==0){
            return -1;
        }
        if(a[0]==x){
            return 0;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int fi=firstIndex(smallArray,x);
        if(fi==-1){
            return -1;
        }else{
            return fi+1;
        }
        
        
    }
    
    public static int firstIndexBetter(int a[],int x,int si){
        if(si==a.length){
            return -1;
        }
        if(a[si]==x){
            return si;
        }
        int k=firstIndexBetter(a,x,si+1);
        return k;
    }
    
    public static int lastIndexBetter(int a[],int x,int si){
        if(si==a.length){
            return -1;
        }
        int k=lastIndexBetter(a,x,si+1);
        if(k!=-1){
            return k;
        }else{
            if(a[si]==x){
                return si;
            }else{
                return -1;
            }
        }
    }
    public static int lastindex(int a[],int x) {
    	if(a.length ==0) {
    		return -1;
    	}
    	  int smallArray[]=new int[a.length-1];
          for(int i=1;i<a.length;i++){
              smallArray[i-1]=a[i];
          }
          int k= lastindex(smallArray,x);
          if(k!=-1) {
        	  return k+1;
        	  
          }else {
        	  if(a[0] == x) {
        		  return 0;
        	  }else {
        		  return -1;
        	  }
          }
    }
    
    
    
    
    
    
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //  System.out.println(fact(5));
   //  System.out.print(sumn(10));
   //  print1ton(10);
     System.out.println(fib(10));
	}

}
