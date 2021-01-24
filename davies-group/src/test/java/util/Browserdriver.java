package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserdriver {
	
	public static WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aka_s\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://davies-group.com/");
		driver.manage().window().maximize();
		
		return driver;
	}
	
	
	 public static void quitDriver(WebDriver driver) {
	
	 driver.quit();
	 }
	 
}
