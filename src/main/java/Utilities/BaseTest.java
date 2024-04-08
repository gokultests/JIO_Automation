package Utilities;

import org.openqa.selenium.WebDriver;

public class BaseTest {
	public static WebDriver driver;
	public void urlLaunch() {
		
		driver.get("https://www.jio.com/");
		driver.manage().window().maximize();
		
	}
}
