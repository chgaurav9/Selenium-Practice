package Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Everything {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * driver.manage().window().getSize(); Dimension dm=new Dimension(460,600);
		 * driver.manage().window().setSize(dm);
		 */

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://rahulshettyacademy.com/AutomationPractice'");

//table iteration

		WebElement table = driver.findElement(By.id("product"));

		List<WebElement> rows = table.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {

			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));

			for (int j = 0; j < column.size(); j++) {

				if (j == 2) {
					System.out.print(column.get(j).getText());

				}

			}

		}


		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss,new File("D:\\selenium\\ss.png"));
		System.out.println();
		System.out.println("=========================================================================================");

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
		a.moveToElement(driver.findElement(By.linkText("Top"))).click().build().perform();

		System.out.println("=========================================================================================");

		a.moveToElement(driver.findElement(By.id("name"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("hello").doubleClick().contextClick().build().perform();
		
		a.moveToElement(driver.findElement(By.linkText("REST API"))).keyDown(Keys.CONTROL).click().build().perform();
		
		System.out.println("=========================================================================================");


		Select sel=new Select(driver.findElement(By.id("dropdown-class-example")));
		sel.selectByIndex(2);
		
		
		
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
