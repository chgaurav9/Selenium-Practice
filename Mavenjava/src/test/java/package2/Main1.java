package package2;

//
//import java.util.*;
//import java.io.*;
//
///* You may add any imports here, if you wish, but only from the 
//   standard library */
//
//public class Main {
//	public static int process(String str) {
//		/*
//		 * Modify this method to process `str` as indicated in the question. At the end,
//		 * return the appropriate value.
//		 *
//		 * Please create appropriate classes, and use appropriate data structures as
//		 * necessary.
//		 *
//		 * Do not print anything in this method.
//		 *
//		 * Submit this entire program (not just this method) as your answer
//		 */
//
//		int count = 0;
//		//String str = "Let's meet l8r 2nite?";
//		String str1 = str.replaceAll("\\W", " ");
//		String str2 = str1.replaceAll("\\d", " ");
//		String str3 = str2.replaceAll("[ ]+", " ");
//		String[] str4 = str3.split(" ");
//		for (String a : str4) {
//			count++;
//		}
//
//		
//
//		return count;
//	}
//
//	public static void main(String[] args) {
//		try {
//			Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
//			String line = in.nextLine().trim();
//			int retVal = process(line);
//			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//			output.println("" + retVal);
//			output.close();
//		} catch (IOException e) {
//			System.out.println("IO error in input.txt or output.txt");
//		}
//	}
//}


