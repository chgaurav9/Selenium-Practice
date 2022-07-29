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

public class ValidTitle extends Base {

	public WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		System.out.println("In ValidTitle BeforeTest");
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void basePageNavigation3() throws IOException, InterruptedException {

		landingpage1 lp = new landingpage1(driver);
		System.out.println(lp.getTitle().getText());
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");

	}

	

	@AfterTest
	public void tearDown() {
		System.out.println("In ValidTitle AfterTest");

		driver.quit();
	}

}
