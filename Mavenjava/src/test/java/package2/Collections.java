package package2;

import java.util.*;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Collections {

	@Ignore
	@Test
	public void list() {

		List<String> list = new ArrayList<String>();
		list.add("Ravi");// Adding object in arraylist
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		list.set(1, "element");

		int a[] = { 1, 2, 4, 7, 5, 4 };
		String[] q = list.toArray(new String[list.size()]);

		List<String> ll = new LinkedList<String>();
		LinkedList<String> al = new LinkedList<String>(list);
		LinkedList<String> a2 = new LinkedList<String>();
		a2.addAll(list);

		ListIterator<String> li = al.listIterator();

		while (li.hasNext()) {

			System.out.println(li.next());
		}

		ListIterator<String> li11 = al.listIterator();

		while (li11.hasNext()) {

			System.out.println(li11.next());
		}

	}

	@Test(enabled = false)
	public void list1() {

		String s = "Wow you own kayak omyymo";
		String s2 = s.toLowerCase();
		// System.out.println(s2);
		String[] s1 = s2.split(" ");
		String palin = "";
		for (int i = 0; i < s1.length; i++) {
			String[] s3 = s1[i].split("");
			String temp = "";
			for (int j = s3.length - 1; j >= 0; j--) {

				temp += s3[j];
			}

			if (temp.equals(s1[i])) {
				palin += temp + " ";
			}

		}

		String[] minmax = palin.trim().split(" ");
		String max;
		String min = max = minmax[0];

		for (int k = 0; k < minmax.length; k++) {

			if (min.length() > minmax[k].length()) {

				min = minmax[k];
			}
		}
		System.out.println("min=" + min);
		for (int k = 0; k < minmax.length; k++) {

			if (min.length() < minmax[k].length()) {

				max = minmax[k];
			}
		}
		System.out.println("max=" + max);
	}

	@Test
	public void frequency() {

//		String str = "picture perfect";    
//        int []freq=new int[str.length()];
//        
//        
//        char[] c=str.toCharArray();
//        for(int i=0;i<str.length();i++) {
//        	freq[i]=1;
//        	for(int j=i+1;j<str.length();j++) {
//        		
//        		
//        		if(c[i]==c[j]) {
//        			
//        			freq[i]++;
//        			c[j]='0';
//        			
//        		}
//        	}
//        }
//        
//        for(int i=0;i<freq.length;i++) {
//        	
//        	if(c[i]!='0' && c[i]!=' ') {
//        		System.out.println(c[i]+" "+freq[i]);

		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8,8,3,2,2,2,1, 3 };
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;

				}
			}

			if (count >= 1 && arr[i] != 0) {
				System.out.println(arr[i]);
			}
		}

	}

}
