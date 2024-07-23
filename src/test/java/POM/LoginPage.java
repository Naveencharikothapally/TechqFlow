package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	WebDriver driver;
    By Header=By.xpath("//h2");
    By Username=By.xpath("//tr[1]/td[2]/input");
    By Password=By.xpath("//tr[2]/td[2]/input");
    By Submit=By.xpath("//tr[3]/td[2]/input[1]");
    String URL=("https://www.demo.guru99.com/v4/");
    public LoginPage(WebDriver driver) {
    	this.driver=driver;
    	
    }
    public void VerifyHeader() {
    	String GetHeaderText=driver.findElement(Header).getText();
    	Assert.assertEquals(GetHeaderText,"Guru99 Bank","NotMatching");
    }
    public void URL() {
    	driver.get(URL);
    }
    public void VerifyLogin() {
    	driver.findElement(Username).sendKeys("mngr564832");
    	driver.findElement(Password).sendKeys("panUrEj");
    	driver.findElement(Submit).click();

}
}