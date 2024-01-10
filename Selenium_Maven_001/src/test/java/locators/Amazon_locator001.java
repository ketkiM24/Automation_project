package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_locator001 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//Locators - used to identify element uniquely within a web page.
		//1.id()- 
		//driver.findElement(By.id("twotabsearchtextbox")).click();
		
		//2.name()-
		driver.findElement(By.name("url")).click();
		
		//3.classname()-
		//driver.findElement(By.className(""))
		
		//4.linktext()- when we use complete link name
		//driver.findElement(By.linkText("Best Sellers")).click();
		
		//5.partiallinktext()-when we use partial /section of link name 
		//driver.findElement(By.partialLinkText("Best")).click();
		
		//6.tagname()-
		//driver.findElement(By.tagName(""))
		
		//7.CssSelector()-
		//a. tagname and id-separated by hashtag (#) 
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).click();
		
		//b. tagname and class-separated by dot(.)
		//driver.findElement(By.cssSelector("")).click();
		
		//c. tagname and attribute-"tagname[attribute='value of attribute']"
		//driver.findElement(By.cssSelector("input[type='text']")).click();
		
		//d.PSEUDO classes- first-child, last-child, nth-child(3), nth-last-child(3) 
		//1) first-child- Return first element from the group of sibling elements.
		//Syntax - parent tagname[parent Attribute='Attribute value'] :first-child
		driver.findElement(By.cssSelector("div[id='nav-flyout-anchor'] :first-child")).click();
		
		
		

	}

}
