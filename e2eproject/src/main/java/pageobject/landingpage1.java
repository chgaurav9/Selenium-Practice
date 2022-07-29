package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage1 {

	private WebDriver driver;

	By nav = By.xpath("//*[@class='navbar-header']/following-sibling::nav");
	By title = By.xpath("//*[@class='text-center']/h2");
	By login = By.xpath("//*[text()='Login']");
	By popup = By.xpath("//*[text()='NO THANKS']");
	By submit=By.xpath("//*[@type='submit']");
	
	
	
	
	public landingpage1(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement navigateBar() {
		// TODO Auto-generated method stub
		return driver.findElement(nav);
	}

	public WebElement getTitle() {
		// TODO Auto-generated method stub
		return driver.findElement(title);
	}

	public WebElement getLogin() {
		// TODO Auto-generated method stub
		return driver.findElement(login);
	}

	public WebElement popup() {
		// TODO Auto-generated method stub
		return driver.findElement(popup);
	}
	
	
	public WebElement submit() {
		// TODO Auto-generated method stub
		return driver.findElement(submit);
	}

}
