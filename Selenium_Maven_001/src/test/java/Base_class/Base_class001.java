package Base_class;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Base_class001 {
	
	//public static variable web driver interface 
	public static WebDriver driver;
	
	//Dynamic code used for screenshot
	public static void takescreenshot (String screenshot) throws Throwable {
		
		//cast driver with takescreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File ("../Selenium_Maven_001/Screenshot/"+screenshot+".png");
		FileHandler.copy(src, target);
		
	}	

	}

