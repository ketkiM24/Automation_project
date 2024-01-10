package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_element003 {

	public static void main(String[] args) {
		
		//open web browser
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.railyatri.in/");
		
		//search on the search bar
		WebElement searchbox = driver.findElement(By.xpath("//input[@placeholder='Enter train no. or name']"));
		searchbox.click();
		
		//to get x coordinate
		System.out.println(searchbox.getLocation().x);
		
		//to get y coordinate 
		System.out.println(searchbox.getLocation().y);
		
		//to get size
		System.out.println(searchbox.getSize());
		
		//to check web element is anable
		System.out.println(searchbox.isEnabled());
		
		

	}

}
