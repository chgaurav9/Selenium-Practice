package qatesting.Mavenjava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Duplicates {
	
//	static int x=8;
//	
	public static void main(String[] args) {
//		
//		
//		Duplicates d=new Duplicates();
//		Duplicates d1=new Duplicates();
//		
//		d.x=9;
//		
//		System.out.println(d.x);
//		System.out.println(d1.x);
		
		
		
		int a[]= {1, 2, 3 , 4 , 1 ,9, 8, 9 , 9 , 0 , 0 , 5, 6, 7};
		
		
		String s1="";

	for(int j=0;j<a.length;j++ ) {
	//	System.out.println(s1.contains(String.valueOf(a[j]))+" "+a[j]);
			if(!(s1.contains(String.valueOf(a[j])))){
				
				s1+=String.valueOf(a[j])+" ";
			}
		
	}
	System.out.println(s1);
	
	s1.trim();
	String[] arr = s1.split(" ");
		for(int k=0;k<arr.length;k++) {
			
			System.out.println(arr[k]);
			
			
		}

}
	}
