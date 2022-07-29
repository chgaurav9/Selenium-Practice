package qatesting.Mavenjava;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
        
    	FileInputStream fis= new FileInputStream("D:\\selenium\\Workspace\\Mavenjava\\src\\test\\java\\yeah.properties");
    	
    	Properties p=new Properties();
    	p.load(fis);
    	
    	System.out.println(p.getProperty("username"));
    	System.out.println(p.getProperty("integer"));
    	
    	p.list(System.out);
    	
    	
    	
    }
}
