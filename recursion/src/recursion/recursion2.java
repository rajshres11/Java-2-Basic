package recursion;

public class recursion2 {
      
	public static String replaceChar(String s, char a, char b) {
		if(s.length() == 0) {
			return s;
		}
		String smalloutput = replaceChar(s.substring(1),a,b);
		if(s.charAt(0) == a) {
		return b + smalloutput;
	}else {
		return s.charAt(0) + smalloutput;
	}
	}
    public static String replacePi(String s){
        if(s.length()<=1){
            return s;
        }
        if(s.charAt(0)=='p' && s.charAt(1)=='i'){
            //Call recursion on string of length n-2;
            String smallOutput=replacePi(s.substring(2));
            return "3.14"+smallOutput;
        }else{
            //call recursion on string of length n-1;
            String smallOutput=replacePi(s.substring(1));
            return s.charAt(0)+smallOutput;
        }
    }
    public static void merge(int []s1, int []s2,int []d) {
    	int i=0;
    	int j=0;
    	int k=0;
    	while(i<s1.length && j<s2.length) {
    		if(s1[i]<=s2[j]) {
    			d[k] = s1[i];
    			i++;
    			k++;
    		}else {
    			d[k]= s2[j];
    			k++;
    			j++;
    		}
    	}
    	if(i<s1.length) {
    		while(i<s1.length) {
    			d[k]=s1[i];
    			i++;
    			k++;
    		}
    	}
    	if(j< s2.length) {
    		d[k]=s2[j];
    	     k++;
    	     j++;
    	}
    }
      public static void mergesort(int a[]) {
    	if(a.length <= 1) {
    		return;
    	}
    	int b[] = new int[a.length/2];
    	int c[] = new int[a.length - b.length];
    	
    	 for(int i=0;i<=a.length/2;i++) {
    		 b[i] = a[i];
    	 }
    	for(int i=a.length/2;i<=a.length;i++) {
    		c[i-a.length/2] = a[i];
    	}
    	mergesort(b);
    	mergesort(c);
    	merge(b,c,a);
    }
    public static int binarysearch(int a[], int si, int ei,int x) {
    	if(si>ei) {
    		return -1;
    	}
    	int midindex = (si+ei)/2;
    	if(a[midindex] == x) {
    		return midindex;
    	}else if(a[midindex] < x) {
    	return	binarysearch(a, midindex + 1,ei,x);	
    	}else {
    		return binarysearch(a,si,midindex-1,x);
    	}
    	}
    public static int partition(int a[],int si,int ei) {
    	int pivotelement = a[si];
    	int smallernumbercount = 0;
    	
    	for(int i= si+1;i<=ei;i++) {
    		if(a[i] < pivotelement){
    		smallernumbercount++;	
    		}
    		}
    	int temp = a[si+ smallernumbercount];
    	a[si + smallernumbercount]= pivotelement;
    	a[si] = temp;
    	
    	 int i= si;
    	 int j = ei;
    	 while(i < j) {
    		 if(a[i]< pivotelement) {
    			 i++;
    			 
    		 }else if(a[j]>= pivotelement) {
    			 j--;
    		 }else {
    			 temp =  a[i];
    			 a[i] = a[j];
    			 a[j] = temp;
    			 i++;
    			 j--;
    		 }
    	 }
    	return si+ smallernumbercount;
    }
    public static void quicksort(int a[],int si,int ei) {
    	if(si>=ei) {
    		return;
    	}
    	int pivotindex = partition(a,si,ei);
    	quicksort(a,si,pivotindex-11);
    	quicksort(a,pivotindex+1,ei);
    	
    }
    public static void towerofhanoi(int n, char s, char h,char d) {
    	if(n==1) {
    		System.out.println("move 1st disk from"+s+"to"+d);
    		return;
    	}
    	towerofhanoi(n-1,s,d,h);
    	System.out.println("move"+n+"disk"+s+"to"+d);
    	towerofhanoi(n-1,h,s,d);
    }


    public static void main(String[] args) {
		// TODO Auto-generated method stub
    //ystem.out.println(replaceChar("axbxcxdx",'x','y'));
 //  System.out.println(replacePi("appibpxipip"));
  // int a[] = {1,2,3,4,5};
 //  System.out.println(binarysearch(a,0,a.length-1,100));
 //    int a[] = {10,689,8,38,3};
  // mergesort(a);
  //   quicksort(a,0,a.length-1); 
  // int i;
  // for( i=0;i<a.length;i++);
   //System.out.println(a[i]);
 //    towerofhanoi(2,'s','h','d');
}
}
