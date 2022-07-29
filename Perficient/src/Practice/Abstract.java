package Practice;







abstract class And{
	
	public abstract void eat();
	
	public void add() {
		
		System.out.println("in add");
		
	}
	
	
}



class Ball extends And{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("apple");
		
	}
	
	
	
	
	
}

public class Abstract {

	
	
	public static void main(String[] args) {
		
		
		Ball b=new Ball();
		b.eat();
		b.add();
		
		
		
	}
}