package CucuSwitch;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class jhgdsjhaskjd {
	
public int main(String[] args) {
		
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
		
		
		Set<Integer> s=new HashSet<>();
		for (Map.Entry<Integer,Integer> entry : m.entrySet()) {
			
			s.add(entry.getValue());
            
    }
		int add=0;
		for(Integer sum: s){
			  add+= sum;
			}
		
		return add;
	}

}
