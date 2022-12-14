package objectrepository;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class Guru99Login {

    /**

     * All WebElements are identified by @FindBy annotation

     */

    WebDriver driver;
    
    @FindBy(xpath="//*[@id='login1']")
	WebElement username;
	
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;

    

    

    public Guru99Login(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }

    //Set user name in textbox

    public void setUserName(String strUserName){

        username.sendKeys(strUserName);     
    }

    //Set password in password textbox

    public void setPassword(String strPassword){

    password.sendKeys(strPassword);

    }

    //Click on login button

    public void clickLogin(){

            go.click();

    }  

    //Get the title of Login Page

    
    /**

     * This POM method will be exposed in test case to login in the application

     * @param strUserName

     * @param strPasword

     * @return

     */

    public void loginToGuru99(String strUserName,String strPasword){

        //Fill user name

        setUserName(strUserName);

        //Fill password

        setPassword(strPasword);

        //Click Login button

        clickLogin();           

    }

}