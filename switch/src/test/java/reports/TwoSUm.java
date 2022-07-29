package reports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSUm {
	
	public static void main(String[] args) {
		
		int a[]= {3,3};
		int sum=6;
		int flag=-1;
		int nums[]=new int[2];
		//Set<Integer>s=new LinkedHashSet<>();
		List<Integer>s=new ArrayList<>();
		for(int x:a) {
			s.add(x);
		}
			
		for(int i=0;i<s.size();i++) {
			
			System.out.println(s.indexOf(sum-s.get(i)));
			System.out.println(s.indexOf(s.get(i)));
			System.out.println((s.indexOf(3)!=s.indexOf(3)));
			if(s.contains(sum-s.get(i)) && (s.indexOf(sum-s.get(i))!=s.indexOf(s.get(i)))) {
				System.out.println("number found");
				nums[0]=s.get(i);
				nums[1]=sum-s.get(i);
				flag=-1;
				break;
				
			}else {
				flag=0;
			}
		}
		
		if(flag==0) {
			System.out.println("not found");
		}
		
		System.out.println(Arrays.toString(nums));
			
	}

}
