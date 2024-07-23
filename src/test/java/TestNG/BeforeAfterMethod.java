package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod {
WebDriver driver;
@BeforeMethod
void OpenApp() {
driver=new EdgeDriver();
driver.get("https://demo.guru99.com/V4/");
driver.manage().window().maximize();
}
@Test(priority=1)
void Login () {
	driver.findElement(By.name("uid")).sendKeys("mngr578946");
    driver.findElement(By.name("password")).sendKeys("bysYmub");
    driver.findElement(By.name("btnLogin")).click();
}
@Test(priority=2)
void Search() {
	System.out.println("This is search page");
}
@Test(priority=3)
void Close() {
	driver.close();
}

}
