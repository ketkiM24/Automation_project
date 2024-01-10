package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_001 {

	public static void main(String[] args) {
		
		//Invoke Browser- Web driver reference variable can hold driver class.
		WebDriver driver = new ChromeDriver();
		
		//Maximize browser window
		driver.manage().window().maximize();
		
		//Use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Use Method to navigate to URL
		driver.get("https://www.facebook.com/");
		
		//Requirement - to click on the search box (using id locator)
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		
		//Requirement - to click on All besides search (using name locator)
		//driver.findElement(By.name("url")).click();
		
		//Requirement - to click on the search box (using className locator)
		WebElement searchbox = driver.findElement(By.className("inputtext _55r1 _6luy"));
		searchbox.click();
	}

}
