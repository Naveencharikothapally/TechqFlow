package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethod1 {
	WebDriver driver;
	@Test(priority=1)
	void OpenApp() {
	driver=new EdgeDriver();
	driver.get("https://demo.guru99.com/V4/");
	driver.manage().window().maximize();
	}
	@Test(priority=2)
	void Login () {
		driver.findElement(By.name("uid")).sendKeys("mngr578946");
	    driver.findElement(By.name("password")).sendKeys("bysYmub");
	    driver.findElement(By.name("btnLogin")).click();
	}
	@Test(priority=3)
	void Search() {
		System.out.println("This is search page");
	}
	@AfterMethod
	void Close() {
		driver.close();

	}


}
