package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_element002 {

	public static void main(String[] args) {
		
		//open web browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//get title
		System.out.println("The title of this webpage is - " + driver.getTitle());
		
		//
		WebElement link = driver.findElement(By.linkText("Today's Deals"));
		
		//capture text of link
		System.out.println(link.getText());
		
		//to get attribute of a web element
		System.out.println(link.getAttribute("class"));
		
		//to get tag name
		System.out.println(link.getTagName());
		
		//to check web element is hidden or visible
		System.out.println(link.isDisplayed());
		
		//click on the link
		link.click();
		
	}

}
