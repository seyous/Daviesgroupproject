package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitforelement {
	
	public static void Driverwait(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		
	}
	
	
	public static void wait(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
}
	
}
