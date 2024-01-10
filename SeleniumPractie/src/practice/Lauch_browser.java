  package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch_browser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); //Server grid technique
		
		driver.manage().window().maximize();  // Maximize Window
		
		//Driver Methods
		driver.get("http://www.facebook.com"); //To Navigate url
		Thread.sleep(3000);  //For delay purpose
		
		driver.navigate().to("https://www.google.com"); //TO navigate url
		Thread.sleep(3000);
		
		driver.navigate().back(); // To Facebook.com
		Thread.sleep(3000); //For delay Purpose
		
		driver.navigate().forward();  //To Google.com
		Thread.sleep(3000);
		
		driver.navigate().refresh();  //Refresh the web page
		Thread.sleep(6000);
		
		driver.quit();  // it will quit the whole browser.
	}
}
