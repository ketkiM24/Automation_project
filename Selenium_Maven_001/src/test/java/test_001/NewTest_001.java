package test_001;

import org.testng.annotations.Test;

import Base_class.Base_class001;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTest_001 extends Base_class001 {
	@BeforeClass
	  public void Lauch_Browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.netmeds.com/");
	  }
  @Test(priority = 1)
  public void Test_url() throws Throwable {
	  //1.Verify if user is able to capture Title and Url of Netmeds WebPage.
	  System.out.println("Title of the web page - " + driver.getTitle());
	  System.out.println("Url of the web page - " + driver.getCurrentUrl());
	 
	  //2.Verify if user is able to mouse Hover on Wellness or Beauty lie below Search Box.
	  WebElement mouse_hower = driver.findElement(By.xpath("(//a[text()='Wellness'])[1]"));
	  Actions act = new Actions(driver);
	  act.moveToElement(mouse_hower).build().perform();
	  takescreenshot("mouse hover to wellness");
	  
	  //3.Verify if user is able to search any one medicine in search and capture name of Medicine.
	   WebElement search = driver.findElement(By.xpath("//input [@id='search']"));
	   search.sendKeys("dolo");
	   act.keyDown(Keys.ENTER).build().perform();
	   //scroll
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBY(0,400)");
	   //driver.findElement(By.xpath("(//form[@class='cart-form']/button)[1]")).click();
	  //driver.findElement(By.xpath("(//div[@class='text'])[1]")).click();
	
}
@AfterMethod
  public void afterMethod() {
  }

  

}
