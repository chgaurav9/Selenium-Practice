package Practice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	
	
	@Test()
	public void Demo1() {
		
		System.out.println("demo1");
		
	}
	
	@BeforeGroups("apple")
	public void beforegroup(){
		System.out.println("inside beforegroup");
		
	}
	
	
	@AfterClass(groups= {"apple"})
	public void afterclass() {
		
		
		System.out.println("in afterclass");
	}
	
	@Test(groups= {"apple","ball"})
	public void Demo2() {
		
		System.out.println("demo2");
		
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("in beforeclass");
	}
	
	@Test
	public void Demo3() {
		
		System.out.println("demo3");
		
	}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("in aftertest");
		
	}
	
	
	

}
