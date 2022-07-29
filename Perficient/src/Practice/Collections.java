package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<String> a= new ArrayList<String>();
		a.add("a");
		a.add("c");
		a.add("b");
		
		
		Iterator<String> i=a.iterator();
		while(i.hasNext()) {
			
			
			System.out.println(i.next());
		}
		
		
		for(String f:a) {
		
		System.out.println(f);
		
		
		
		}
		
		
		
		System.out.println(a.get(2));
		
		
		
		a.add(1, "mango");
		
		for(String f:a) {
			
			System.out.println(f);
			
			
			
			}
		
		
		
		
		
		List<Integer> lis=new ArrayList<>();
		lis.add(1);
		lis.add(5);
		lis.add(7);
		
		int a1[]={1,2};
		
		//int a[]=lis.toArray(new int[lis.size()]);
		Integer[] array = lis.toArray(new Integer[lis.size()]);   
		
		
		
		
		
		
	}

}
