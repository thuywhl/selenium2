package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class GenerateHTML {
	WebDriver driver = new FirefoxDriver();
	
  @Test
  public void f() {
  }
  
  
  @BeforeTest
  public void beforeTest() 
  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "https://test-manage.urbanadventures.com";
	 	driver.get(url);
	 	driver.manage().window().maximize();
	 	driver.findElement(By.id("uxUserId")).sendKeys("uaadmin");
	 	driver.findElement(By.id("uxPassword")).sendKeys("abc123");
	 	driver.findElement(By.id("uxLogin")).click();
	 	driver.findElement(By.className("ui-dialog ui-widget ui-widget-content ui-corner-all ui-front ui-dialog-buttons ui-draggable")).findElement(Byclass)
		
  }

  @AfterTest
  public void afterTest() {
  }

}
