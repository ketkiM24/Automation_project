package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Base_class.Base_class001;

public class Scroll_001 extends Base_class001 {

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/select-menu");
		
		//capture title of the web page
		System.out.println("Title of the web page - " +driver.getTitle());
		//capture current url of the web page 
		System.out.println("Url of the web page -" +driver.getCurrentUrl());
		
		//scroll the page
		Actions act =  new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		
		//Locate Dropdown
		 WebElement dropdown = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		 
		 //Use select class by creating object
		 Select s = new Select(dropdown);
		 s.selectByVisibleText("White");
		 System.out.println("Is dropdown multiselected -" + s.isMultiple());
		 //s.selectByValue("4");
		 //s.selectByIndex(2);
		 //s.deselectAll();
		 
		
	}

}
