package generics;

public class print {
 //	public static<T extends Vehicle> void printarray(T arr[])
	public static<T extends printinterface> void printarray(T arr[]) {
		for(int i = 0;i<arr.length;i++) {
			arr[i].print();
		//	System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer arr[] = new Integer[5];
//		for(int i = 0;i<arr.length;i++) {
//			arr[i] = i+1;
//		}
//		printarray(arr);
		
//		String arrS[] = new String[5];
//		for(int i = 0;i<arrS.length;i++) {
//			arrS[i] = "abc";
//		}
//		printarray(arrS);
		
		Vehicle v[] = new Vehicle[5];
		for(int i = 0;i<v.length;i++) {
			v[i] = new Vehicle(10*i,"ab");
		}
		printarray(v);
	}

}
