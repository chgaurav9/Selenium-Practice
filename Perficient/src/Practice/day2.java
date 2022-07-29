package Practice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test
	public void Demo1day2() {
		
		System.out.println("demo1day2");
		
	}
	
	@Test
	public void Demo2day2() {
		
		System.out.println("demo2day2");
		
	}
	
	@AfterGroups("apple")
	public void beforegroup(){
		System.out.println("inside Aftrergroup");
		
	}
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("in beforetest");
	}
	
	@Test(dependsOnMethods= {"Demo3day2"})
	public void Demo3day2() {
		
		System.out.println("demo3day2");
		
	}
	
	
	
		
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
}
