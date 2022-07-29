package e2eproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobject.landingpage1;
import pageobject.loginpage1;
import resources.Base;

public class HomePage extends Base {

	private WebDriver driver;

	@BeforeTest
	public void initialize() throws IOException {
		System.out.println("In HomePage BeforeClass");
		driver = initializeDriver();
		//System.out.println(((Object) driver).getclass());


	
	}
	

	@Test(dataProvider = "dp")
	public void basePageNavigation1(String uname, String password) throws IOException, InterruptedException {

		System.out.println("in test");
		driver.get(prop.getProperty("url"));

		landingpage1 lp = new landingpage1(driver);

		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(lp.popup()));
			

			lp.popup().click();
			System.out.println("after popup");
			loginpage1 loginp = new loginpage1(driver);

			System.out.println("fgfgf");
			loginp.loginb().click();
			loginp.emailId().sendKeys(uname);
			loginp.Password().sendKeys(password);
			lp.submit().click();
			System.out.println("fgfgf");

		} catch (Exception e) {
			loginpage1 loginp = new loginpage1(driver);

			System.out.println("fgfgf");
			loginp.loginb().click();
			loginp.emailId().sendKeys(uname);
			loginp.Password().sendKeys(password);
			lp.submit().click();
			System.out.println("fgfgf");

		}

	}

	@DataProvider
	public Object[][] dp() {
		System.out.println("in dp");
		Object[][] obj = new Object[2][2];
		obj[0][0] = "invalid@gmail.com";
		obj[0][1] = "pwd123";

		obj[1][0] = "valid@gmail.com";
		obj[1][1] = "pwd456";
		return obj;

	}

	@AfterTest
	public void tearDown() {
		System.out.println("In HomePage AfterClass");

		driver.quit();
	}

}
