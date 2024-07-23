package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AnnotationandPriority {
WebDriver driver;
@Test(priority=1)
void OpenApp() {
	driver=new EdgeDriver();
	driver.get("https://www.saucedemo.com/");
    driver.manage().window().maximize();
}
@Test(priority=2)
void Login() throws InterruptedException {
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	Thread.sleep(3000);
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	Thread.sleep(3000);
	driver.findElement(By.name("login-button")).click();
	
}
@Test(priority=3)
void Search() {
	System.out.println("This is Search");
}
@Test(priority=4)
void CloseApp() {
	driver.close();
}
}
