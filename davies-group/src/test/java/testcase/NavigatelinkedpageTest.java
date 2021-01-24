package testcase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobject.Homepage;
import util.Browserdriver;
import util.Waitforelement;

public class NavigatelinkedpageTest {

	@Test
	public void navigatelinked() throws Exception {

		WebDriver driver = Browserdriver.getDriver();
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		Waitforelement.wait(driver);
		
		//script to scroll down the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");

		// click on the linked icon on the page
		homepage.clicklinked();
		Waitforelement.wait(driver);

		String originalwindow = driver.getWindowHandle();

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}

		String element = driver.getCurrentUrl();
		Waitforelement.Driverwait(driver);
		assertEquals("https://www.linkedin.com/company/daviesgroup/", element);

		// Close the browser
		Browserdriver.quitDriver(driver);

	}

}
