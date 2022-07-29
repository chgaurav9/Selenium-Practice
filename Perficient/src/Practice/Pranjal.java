package Practice;

import java.util.HashMap;
import java.util.Map;




public  class Pranjal {
	
	public void main(String[] args) {
		
		int input1=7;
		int input2[]= {3,7,1,1,3,1,7};
		
		Map<Integer,Integer>m=new HashMap<>();
		
		for(int i:input2) {
			
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}else {
				m.put(i, 1);
			}
		}
		
		System.out.println(m);
		
		
	}
    
  
}
