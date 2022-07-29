package qatesting.Mavenjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class tp {
	
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(55);
		a.add(3);
		a.add(11);
		a.add(-1);
		
		int count=0;
    	Iterator i=a.iterator();
    	while(i.hasNext()) {
    		int num=(int)i.next();
    		if(num>=10) {
    			
    			count++;
    		}else {
    			
    			continue;
    		}
    	}
    	
    	System.out.println(count);

	}}
