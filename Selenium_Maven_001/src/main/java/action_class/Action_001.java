package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_001 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		//Action class object
		Actions act = new Actions(driver);
		
		//click on create account
		WebElement createacc = driver.findElement(By.linkText("Create new account"));
		
		//capture name of the web element
		System.out.println("Name of the web element - " + createacc.getText());
		
		//move to element
		//act.moveToElement(createacc).click().build().perform();
		
		//perform right click
		act.contextClick().build().perform();
		
		
		
		
		

	}

}
