package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	
	
	
	
	
	@Test
	public void and(String s) {
		
		System.out.println("and"+s);
		
	}
	
	@Test
	public void band() {
		
		System.out.println("band");
		
	}
	
	@Test(dataProvider="dp")
	public void sand(String s, String p) {
		
		System.out.println("sand"+s+p);
	}
	
	
	@DataProvider
	public Object[][] dp(){
		
		Object [][] o=new Object[2][2];
		
		o[0][0]="unAME";
		o[0][1]="PWD";
		
		
		o[1][0]="unAME";
		o[1][1]="PWD";
		
		
		return o;
		
	}
	
	

}
