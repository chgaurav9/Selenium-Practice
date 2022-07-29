package Practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class window {
	
	
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		
		driver.findElement(By.xpath("//button[starts-with(@id,'openwindow')]\r\n" + 
				"")).click();
		
String mainwind=driver.getWindowHandle();
		
		Set<String>multi=driver.getWindowHandles();
		
		
		
		Iterator<String> i=multi.iterator();
		
		System.out.println(driver.getTitle());
		while(i.hasNext()) {
			
			
			driver.switchTo().window(i.next());
		}
		
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[2]/div/nav/ul/li[3]/a")).click();
		
		
		
	}

}
