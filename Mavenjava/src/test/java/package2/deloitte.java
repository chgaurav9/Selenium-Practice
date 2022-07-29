package package2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class deloitte {
	
//	@Test(priority=0)
//	public void priority() {
//		
//		System.out.println("priority");
//		
//	}
//	
//	@Test(priority=2,enabled=false)
//	public void enabled() {
//		System.out.println("enabled");
//		
//	}
//	
//	@Test(groups="switch")
//	public void parameter() {
//		System.out.println("parameter");
//		
//	}
//	
//	@DataProvider
//	public Object[][] datapro() {
//		
//		Object [][]obj=new Object[1][2];
//		obj[0][0]=1;
//		obj[0][1]="deloitte";
//		
//		return obj;
//		
//	}
//	
	@Test(groups="switch")
	public void listener() {
		System.out.println("listener");
		
	}
//	
//	@Test(invocationCount=5,timeOut=5000)
//	public void retry() {
//		
//		System.out.println("retry");
//		
//	}
//	
	
	@BeforeGroups("switch")
	public void invocount() {
		
		System.out.println("invocount");
		
	}
//
//	@Test(dataProvider="datapro")
//	public void dependson(Integer value1,String value2) {
//		System.out.println("dependson");
//		System.out.println(value1);
//		System.out.println(value2);
//		
//	}
//	@Parameters({"param"})
//	@Test(groups= {"switch","apple"})
//	public void timeout(String c) {
//		System.out.println("timeout");
//		System.out.println(c);
//		
//	}
//	@Ignore
//	@Test(retryAnalyzer = package2.retryanalyser.class,groups="switch")
//	public void group() {
//		System.out.println("groups");
//		Assert.assertFalse(true);
//		
//	}
	
	@Test(retryAnalyzer = package2.retryanalyser.class,groups="switch")
	public void group256() throws IOException {
//		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\browserdrivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice");
//		WebElement table = driver.findElement(By.xpath("(//*[@id='product'])[2]"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		
//		for(int i=0;i<rows.size();i++) {
//			List<WebElement> col = rows.get(i).findElements(By.tagName("td"));
//			for(int j=0;j<col.size();j++){
//				
//				System.out.println(col.get(j).getText());
//			}
//			
//		}
//		System.out.println("======================================");
//		
//		Actions a=new Actions(driver);
//		a.moveToElement(driver.findElement(By.xpath(""))).click().contextClick().build().perform();
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Gaurav\\Desktop\\deloitte.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		FormulaEvaluator fe=new XSSFFormulaEvaluator(wb);
		int row=sh.getLastRowNum();
		
		for(int i=0;i<row;i++) {
			
			int col=sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<col;j++) {
				//System.out.println(sh.getRow(i).getCell(j).getCellType());
				if(sh.getRow(i).getCell(j).getCellType().equals(CellType.STRING)) {
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue());
				}else if(sh.getRow(i).getCell(j).getCellType().equals(CellType.NUMERIC)) {
					
					System.out.println((int)sh.getRow(i).getCell(j).getNumericCellValue());
				}
			}
			
			
		}
		
		sh.getRow(1).createCell(2).setCellValue(7);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Gaurav\\Desktop\\deloitte.xlsx");
		
		wb.write(fos);
	}
	
	
}
