package package2;


 class Hi implements Runnable{
	
	public void run(){
		
		for(int i=0;i<5;i++) {
			
			System.out.println("hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

 class Hello implements Runnable{
	 
	 public void run() {
			
			for(int i=0;i<5;i++) {
				
				System.out.println("hello"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
 }



 public class Threads {
	 
	 
	 
	 
	 
	 
	 public static void main(String[] args) throws Exception {
		
		
		 Hi obj1=new Hi();
		 Hello obj2=new Hello();
		 
		 Thread t1=new Thread(obj1);
		 Thread t2=new Thread(obj2);
		 
		 t1.start();
		 try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		 
		 //t1.join();
		 
		
		 t2.start();
		
		 
	}

}
