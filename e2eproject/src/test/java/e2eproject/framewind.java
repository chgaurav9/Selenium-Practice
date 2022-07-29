package e2eproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//class A{
//	//Binary search
//	
//	public int binary (int[]a,int num) {
//		
//		
//		
//		int left=0;
//		int right=a.length-1;
//		while(left<=right) {
//			
//			int mid=(left+right)/2;
//			
//			
//			
//			if(num<a[mid]) {
//				
//				right=mid-1;
//			}else if(num>a[mid]) {
//				
//				left=mid+1;
//			}else {
//				
//				return mid;
//			}
//		}
//		
//		return -1;
//		
//		
//		
//	}
//	
//}

public class framewind {
	public static void main(String[] args) throws InterruptedException, IOException {

		// Window handling
//	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
//	WebDriver driver=new ChromeDriver();
//	
//	driver.manage().window().maximize();
//	
//	driver.get("https://rahulshettyacademy.com/AutomationPractice");
//	
//	driver.findElement(By.id("openwindow")).click();
//	
//	String mainwin = driver.getWindowHandle();
//	
//	Set<String> s = driver.getWindowHandles();
//	Iterator<String> i=s.iterator();
//	Thread.sleep(6000);
//	String childwin="";
//	while(i.hasNext()) {
//		childwin=i.next();
//		if(!mainwin.equalsIgnoreCase(childwin)) {
//			driver.switchTo().window(childwin);
//			
//			
//		}
//	}
//	
//	System.out.println(driver.findElement(By.xpath("//*[@class='text-center']/h2")).getText());

		// Binary search
//		A a=new A();
//		int arr[]= {1,4,5,2,4,4,7,9};
//		Arrays.sort(arr);
//		int m=a.binary(arr,4);
//		System.out.println(m);
//		System.out.println(arr[m]);

		// largest and smallest in array

//		String string = "Hardships often prepare ordinary people for an extraordinary destiny";
//		String words[] = string.split(" ");
//		String small = "", large = "";
//
//		small = large = words[0];
//
//		for (int i = 0; i < words.length; i++) {
//
//			if (small.length() > words[i].length()) {
//
//				small = words[i];
//			}
//
//			if (large.length() < words[i].length()) {
//
//				large = words[i];
//			}
//		}
//		
//		
//		System.out.println("small "+small);
//		System.out.println("large "+large);
//		
		File f=new File("C:\\Users\\Gaurav\\Desktop\\io.txt");
	FileOutputStream fos=new FileOutputStream(f);
		String s="Hello Deloitte";
		byte[] s2 = s.getBytes();
//		
//		
//		fos.write(s1);
//		fos.close();
//		
		FileInputStream fis = new FileInputStream("C:\\Users\\Gaurav\\Desktop\\io.txt");
//		int i=0;
//		while((i=fis.read())!=-1){    
//            System.out.print((char)i);    
//           }    
//		fis.close();

//		  FileReader fr=new FileReader("C:\\Users\\Gaurav\\Desktop\\io.txt");
//		BufferedReader bf=new BufferedReader(fr);
//		
		Scanner s1 = new Scanner(fis);

		while (s1.hasNext()) {

			System.out.println(s1.nextLine());
			
		}
		
		
		fos.write(s2);
//		fr.close();
		// bf.close();
		
		//File f=new File("C:\\Users\\Gaurav\\Desktop\\io.txt");
		//FileOutputStream fos=new FileOutputStream(f);
		
		 s1.close();
//		
//	   String str1=new String("Deloitte");
		String str = "Deloitte";
		StringBuffer sb = new StringBuffer();

//		try {
//		int a=5;
//		int b=6;
//			if(b>a
//					) {
//			throw new ArithsException("hi");}
//		
//		}catch(ArithsException e) {
//			
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		
		

	}
}
