package screenShot;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_class.Base_class001;

public class Screen_shot002 extends Base_class001 {

	public static void main(String[] args) throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
		
		//Capture screenshot
		Base_class001.takescreenshot("Redbus");

	}
}
