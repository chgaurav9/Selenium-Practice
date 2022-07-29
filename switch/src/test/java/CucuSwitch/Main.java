package CucuSwitch;

import java.util.*;
import java.io.*;

public class Main {
	public static int processArray(ArrayList<Integer> array) {

		Iterator i = array.iterator();
		int count = 0;
//77, 127
		while (i.hasNext()) {

			int num = (int) i.next();
				
			

			if (num % 7 == 0 && num > 100) {

				array.set(count, Integer.valueOf(-3));
				count++;

			} else if (num % 7 == 0) {

				array.set(count, Integer.valueOf(-1));
				count++;

			} else if (num > 100) {
				
					array.set(count, Integer.valueOf(-2));
					count++;
				
			} else {

				array.set(count, Integer.valueOf(num));
				count++;
			}

		}

		
		return array.size();
	}

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int num = in.nextInt();
			if (num < 0)
				break;
			arrayList.add(new Integer(num));
		}
		int new_length = processArray(arrayList);
		for (int i = 0; i < new_length; i++)
			System.out.println(arrayList.get(i));
	}
}
