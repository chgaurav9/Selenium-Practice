package package2;



class Counter{
	static int a;
	
	
	static{
		
	 a=7; 
	 System.out.println("in static1");
		System.out.println(a);
		 System.out.println("in static2");
	}
	
}

public class gauravexception {

	public static void main(String[] args) {
		System.out.println(Counter.a);
		System.out.println("in main");
		
		
		
	}
	

}
