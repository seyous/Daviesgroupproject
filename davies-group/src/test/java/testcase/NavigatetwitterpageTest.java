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
import pageobject.Solutionpage;
import util.Browserdriver;
import util.Waitforelement;

public class NavigatetwitterpageTest {

	@Test
	public void navigatetwitter() throws InterruptedException {

		// Navigate to the browser
		WebDriver driver = Browserdriver.getDriver();
		Homepage homepage = PageFactory.initElements(driver, Homepage.class);
		Waitforelement.wait(driver);

		// scroll to the twitter icon on the page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");

		// click the twitter icon
		homepage.clicktwitter();
		Waitforelement.wait(driver);

		String originalwindow = driver.getWindowHandle();

		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}

		String url = driver.getCurrentUrl();
		Waitforelement.Driverwait(driver);
		assertEquals("https://twitter.com/Davies_Group", url);

		// Close the browser
		Browserdriver.quitDriver(driver);

	}

}
