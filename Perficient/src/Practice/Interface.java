package Practice;




class Antheax{
	
	public void a() {
		
		
		System.out.println("in A");
	}
	
	
}

class Bon {
	
public void b() {
		
		
		System.out.println("in B");
	}
	
}



class Cc{
	
	public void dosomething(B b) {
		System.out.println("in do something");
		
	}
	
public void c() {
		
		
		System.out.println("in C");
	}
	
	
}









public class Interface {
	
	public static void main(String[] args) {
		
		
		
		Cc c=new Cc();
		B b = null;
		c.dosomething(b);
		
	}

}
