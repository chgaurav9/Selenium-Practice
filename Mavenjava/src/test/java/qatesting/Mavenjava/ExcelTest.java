package qatesting.Mavenjava;

import java.io.FileInputStream; 
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFAnchor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelTest {

	
	@Test
	public void test1() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Gaurav\\Desktop\\Gmail_Compose_click.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Sheet1");
		
		int lr = s.getLastRowNum();
		
		
	for(int i=0;i<=lr;i++) {
		int lc = s.getRow(i).getLastCellNum();
		
		for(int j=0;j<lc;j++) {
			System.out.print(s.getRow(i).getCell(j).getStringCellValue()+"  ");
		}
	}
	System.out.println("passed here");
	s.getRow(0).createCell(0).setCellValue("yeah");
	s.getRow(0).createCell(2).setCellValue("porn");
	s.createRow(3).createCell(1).setCellValue("komal");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\Gaurav\\Desktop\\Gmail_Compose_click.xlsx");
	wb.write(fos);
	wb.close();
	
	}
	
	
public XSSFWorkbook excell() throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Gaurav\\Desktop\\Gmail_Compose_click.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		return wb;
	}
}
