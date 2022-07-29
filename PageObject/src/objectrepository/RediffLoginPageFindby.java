package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFindby {
	
	
	WebDriver driver;
	
	
	
	public RediffLoginPageFindby(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	/*
	 * By username=By.xpath("//*[@id='login1']"); 
	 * By password=By.name("passwd");
	 * Bygo=By.name("proceed"); 
	 * By home=By.linkText("rediff.com");
	 */
	
	
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	
	
	
	public WebElement Emailid() {
		
		
		return username;
	}
	
	public WebElement password() {
		
		
		return password;
	}
	
	
	public WebElement submit() {
		
		return go;
		
	}
	
	
	
	
	
	
}
