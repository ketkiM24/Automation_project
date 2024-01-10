package select_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Base_class.Base_class001;

public class Select_class001 extends Base_class001 {

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jeevansathi.com/m0/register/customreg/15?source=SH_Bra_ROC&sh1=Trusted%20Marriage%20Site&sh2=Over%2010%20Lakhs%20Profiles&utm_source=google&utm_medium=cpc&utm_campaign=Search_Brand_Exact_Campaigns_Desktop_Ethinos&utm_adgroup=Brand&utm_term=jeevansathi&gad_source=1&gclid=CjwKCAiAmsurBhBvEiwA6e-WPH_osEJqlFH7lDp7TmBhUdLAP564pa6WQsyLD6UXvJST8ZD86qDQjxoC1AkQAvD_BwE");
		
		//Capture title of the web page
		System.out.println("Title of the Web page -" +driver.getTitle());
		//Capture the current url of the web page
		System.out.println("Url of the page - " +driver.getCurrentUrl());
		
		//create class object
		Select s = new Select(driver.findElement(By.cssSelector("select#reg_relationship")));
		
		//select the visible text
		//s.selectByVisibleText("Daughter");
		//deselect the visible text
		//s.selectByVisibleText("Please Select");
		
		//Select by value
		//s.selectByValue("4");
		
		//Select by index
		s.selectByIndex(1);
		
		//to check if drop-down is multi-selected
		System.out.println(s.isMultiple());
		takescreenshot("After select self option");
		
		
		

	}

}
