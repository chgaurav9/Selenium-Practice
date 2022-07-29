package package2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class hackerrank {

	public static void main(String[] args) throws InterruptedException {

		/*
		 * 1 23 456 78910 1112131415 1617181920
		 */
//		int point = 1;
//		int num = 20;
//		boolean flag = false;
//
//		for (int i = 1; i < 100; i++) {
//
//			for (int j = 1; j < i; j++) {
//
//				System.out.print(point++);
//				if (point == num + 1) {
//					flag = true;
//					break;
//
//				}
//
//			}
//			System.out.println();
//
//			if (flag) {
//				break;
//			}
//
//		}

		int n = 7;
		int count = 1;
		int count2 = 0;
		for (int i = 0; i < 7; i++) {
			int count1 = 0;
			
			for (int j = (n * 2)-count; j > 0; j--) {

				if (count1 < count2) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
				// Thread.sleep(1000);
				
				count1++;

			}
			count++;
			count2++;
			System.out.println();

		}

	}

}