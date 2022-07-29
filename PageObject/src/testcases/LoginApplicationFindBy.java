package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPageFindby;

public class LoginApplicationFindBy {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		RediffLoginPageFindby rd=	new RediffLoginPageFindby(driver);
		
		
		rd.Emailid().sendKeys("apple");;
		rd.password().sendKeys("pwdball");
		rd.submit().click();
		
		
		
		/*
		 * RediffHomePage rh=new RediffHomePage(driver); rh.serahc().sendKeys("hello");
		 * rh.submit().click();
		 */
		
		

	}
}
