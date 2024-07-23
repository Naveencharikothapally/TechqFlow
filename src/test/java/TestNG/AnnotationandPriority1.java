package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnotationandPriority1 {
	WebDriver driver;
	@Test(priority=1)
	void OpenApp() {
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}
	@Test(priority=2,dependsOnMethods= {"OpenApp"})
	void Login() throws InterruptedException {
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(3000);
		driver.findElement(By.name("login-button")).click();
		
	}
	@Test(priority=3,dependsOnMethods= {"Login"})
	void Search() {
		System.out.println("This is Search");
	}
	@Test(priority=4,dependsOnMethods= {"OpenApp"})
	void CloseApp() {
		driver.close();
	}

}
