package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_element001 {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//Capture title of the web page
		System.out.println("The title of the webpage is - " + driver.getTitle());
		
		//send data on search box
		WebElement from = driver.findElement(By.cssSelector("input#src"));
		
		//sendkeys()
		from.sendKeys("Nagpur");
		
		//clear()
		Thread.sleep(3000);
		from.clear();
	}
}
