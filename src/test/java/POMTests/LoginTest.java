package POMTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import POM.LoginPage;

public class LoginTest {
	WebDriver driver;
    LoginPage OBJLoginPage;
    @BeforeClass
    void Setup()
    {
    	driver=new EdgeDriver();
    	OBJLoginPage= new LoginPage(driver);
    	
    	OBJLoginPage.URL();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  	
    }
    @Test(priority=1)
    void Header() 
    {
        OBJLoginPage.VerifyHeader();
        
    }   
    @Test(priority=2)
    void Login()
    {
    	OBJLoginPage.VerifyLogin();
    }
    @AfterClass
    void CloseApp()
    {
         driver.close();
    }
	

}
