package resources;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	public Properties prop;
	
	
	public WebDriver initializeDriver() throws IOException {
		
		FileInputStream fis= new FileInputStream("D:\\selenium\\Workspace\\e2eproject\\src\\main\\java\\resources\\Data.properties");
		prop= new Properties();
		prop.load(fis);
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(browserName.equals("firefox")) {
			
			//firefox
			
		}else if(browserName.equals("IE")) {
			
			//IE
		}
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public String getScreenshotAs(String testcasename, WebDriver driver) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination="D:\\selenium\\Workspace\\e2eproject\\reports\\"+testcasename+".png";
		FileUtils.copyFile(source, new File(destination));
		
		return destination;
	}
	
	

}
