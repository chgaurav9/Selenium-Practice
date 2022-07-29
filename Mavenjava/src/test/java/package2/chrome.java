package package2;

class chrome implements Web{
	
	

	@Override
	public void apple() {
		// TODO Auto-generated method stub
		System.out.println("in apple");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("in move");
	}
	

	
	
	
	public static void main(String[] args) {
		
		
		Web w=new chrome();
		w.apple();
		w.move();
		System.out.println(w.a);
		
	}
	
}