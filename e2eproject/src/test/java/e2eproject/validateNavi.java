package e2eproject;

import java.io.IOException; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageobject.landingpage1;
import resources.Base;

public class validateNavi extends Base {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		System.out.println("In valnav BeforeTest");
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void basePageNavigation2() throws IOException, InterruptedException {

		
		System.out.println("in valnav test");
		landingpage1 lp = new landingpage1(driver);
		Assert.assertTrue(lp.navigateBar().isDisplayed());
		System.out.println("in valnav test");


	}

	
	@AfterTest
	public void tearDown() {
		System.out.println("In valnav AfterTest");

		driver.quit();
	}

}
