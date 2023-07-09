package generics;

public class pairuse {

	public static void main(String[] args) {
	
		pair<String,Integer> pInner = new pair<>("ab",100);
	
	 pair<pair<String,Integer>,String> p = new pair<>();
	    p.setFirst(pInner);
		System.out.println(p.getFirst());
		System.out.println(p.getFirst().getFirst());
		System.out.println(p.getFirst().getSecond());
	//	p.setSecond("abcd");
	//	System.out.println(p.getSecond());
		
		
		
		
		
		
		
		
		
	//	pair<String,Integer> p= new pair<>("ab",10);
	////	p.setFirst();
	//	System.out.println(p.getFirst()+" " +p.getSecond());
		
		
		
	//	pair<Integer> p = new pair<>();
	//	p.setFirst(10);
	//	System.out.println(p.getFirst()+" " +p.getSecond());
		
	////	int i = 10;//not allowed null here
	////	 Integer i1 = 10;// allow null here
		// TODO Auto-generated method stub

	////	pair p = new pair(10,20);
	////	System.out.println(p.getFirst()+" "+p.getSecond());
		
		
		
	////	pairString pS= new pairString("aa","bb");
	//	pair<String> pS= new pair<String>("aa","bb");
	//	System.out.println(pS.getFirst()+" "+pS.getSecond());
	//	pS.setFirst("10");
		
	//	//pair<Integer> pI= new pair<Integer>(10,20);
	//	pair<Integer> pI= new pair<>(10,20);
	//	System.out.println(pI.getFirst()+" " +pI.getSecond());
		
	////	pair<Vehicle> pV = new pair<Vehicle>(new Vehicle(),new Vehicle());
		
		
		
	}

}
