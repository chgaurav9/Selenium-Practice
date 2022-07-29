package qatesting.Mavenjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class PracticeTest {
	/*
	 * ExtentReports r;
	 * 
	 * @BeforeTest public void report() {
	 * 
	 * String s= System.getProperty(("D:\\selenium\\Workspace\\Mavenjava")+
	 * "\\reports\\index.html"); ExtentSparkReporter ex=new ExtentSparkReporter(s);
	 * ex.config().setReportName("switch");
	 * ex.config().setDocumentTitle("Perficient");
	 * 
	 * r=new ExtentReports(); r.attachReporter(ex); r.setSystemInfo("Tester",
	 * "Gaurav");
	 * 
	 * 
	 * 
	 * 
	 * }
	 */

	
	
	@Test
	public void prac() {
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		ChromeOptions c=new ChromeOptions();
		c.addArguments("Headless");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		System.out.println(driver.getTitle());
		
	}
}
