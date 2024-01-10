package locators;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link_locator {

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.amazon.in/");

		// Link text locator to locate Best Seller web element
		// driver.findElement(By.linkText("Best Sellers")).click();

		// partial link text locator to locate best seller web element
		//driver.findElement(By.partialLinkText("Sellers")).click();
		
		//CssSelector - Tagname and id
		//driver.findElement(By.cssSelector("a#nav-hamburger-menu")).click();
		
		//CssSelector - Tagname and attribute
		//driver.findElement(By.cssSelector("a.a-button-text")).click();
		
		//CssSelector - Tagname and attribute
		//driver.findElement(By.cssSelector("input[aria-label='Search Amazon.in']")).click();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/");
		driver.findElement(By.cssSelector(""))
		//PSEUDO classes - first-child
		driver.findElement(By.cssSelector("select[name='CompanyCountry'] :first-child")).click();
		
		//PSEUDO classes - last-child
		//driver.findElement(By.cssSelector(""))
		

	}
}
