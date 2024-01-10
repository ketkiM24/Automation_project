package window_childSwitch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class001;

public class Window_handles001 extends Base_class001 {

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/");

		//click on the link
		driver.findElement(By.linkText("Start free trial")).click();
		
		
	}

}
