package test_001;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class001;

public class Test_001 extends Base_class001 {

	public static void main(String[] args) {
	
		//1.Verify if user is able to capture Title and Url of Netmeds WebPage.
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("");

	}

}
