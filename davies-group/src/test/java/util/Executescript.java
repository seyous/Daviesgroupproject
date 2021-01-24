package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Executescript {
	WebDriver driver;
	public static void Javascriptexecutor(WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1600)");
	}
	
	public static void JavascriptexecutorScale(WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 2400)");
	}
	
	public static void JavascriptexecutorCoordinate(WebDriver driver) {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 600)");
	}

}
