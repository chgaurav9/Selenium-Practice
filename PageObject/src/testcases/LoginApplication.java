package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class LoginApplication {

	@Test
	public void Login() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	
		RediffLoginPage rd=	new RediffLoginPage(driver);
		
		
		rd.Emailid().sendKeys("hello");;
		rd.password().sendKeys("pwd");
		rd.submit().click();
		rd.home().click();
		
		
		RediffHomePage rh=new RediffHomePage(driver);
		rh.serahc().sendKeys("hello");
		rh.submit().click();
		
		

	}
}
