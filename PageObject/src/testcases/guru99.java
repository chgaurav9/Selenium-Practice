package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Guru99Login;
import objectrepository.RediffHomePage;
import objectrepository.RediffLoginPage;

public class guru99 {
	
	
	@Test
	public void Login() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		Guru99Login g= new Guru99Login(driver);
		
		
		g.loginToGuru99("potatooooooooooooooooooooo", "balling");
		Thread.sleep(4);
		
		//g.setPassword("cat");
		

	}

}
