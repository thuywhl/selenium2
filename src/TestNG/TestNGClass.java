package TestNG;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGClass {
	WebDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void LaunchSite()
	{
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://test-ua.urbanadventures.com";
	 	driver.get(url);
	//	driver.navigate().to("http://test-ua.urbanadventures.com");
		driver.manage().window().maximize();
		
		
	}
	
	
  @Test
  public void SearchTour() 
  {
	//  driver.findElement(By.id(id))

      System.out.println(" Searched tour");	
      String title = driver.getTitle();
      int titleLength = driver.getTitle().length();
      System.out.println("title of website is: " + title);
      System.out.println("Length of titile is: " + titleLength);
      String pagesource = driver.getPageSource();
      
      
      
  
  }
  
  @Test
  public void CreateBooking()
  {
	  System.out.println("Create booking");
	  //driver.findElement(By.xpath(".//*[@class='tour-tile']/div")).click();
//	  driver.findElement(By.xpath("//*[@class='tour-tile']")).click();
	  
	
  }
  @AfterTest
  public void CloseBrowser()
  {
	  driver.close();
  }
}
