package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage1 {

	private WebDriver driver;

By email=By.xpath("//*[@type='email']");
By pwd=By.xpath("//*[@type='password']");
By loginBtn=By.xpath("//*[text()='Login']");

	
	public loginpage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		
		this.driver=driver;
	}

	public WebElement emailId() {

		return driver.findElement(email);
	}

	public WebElement Password() {

		return driver.findElement(pwd);
	}
	
	public WebElement loginb() {
		
		return driver.findElement(loginBtn);
	}

	
	
	

}
