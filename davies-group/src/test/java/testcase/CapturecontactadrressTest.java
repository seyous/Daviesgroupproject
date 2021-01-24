package testcase;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pageobject.Contactpage;
import pageobject.Homepage;
import util.Browserdriver;
import util.Waitforelement;

public class CapturecontactadrressTest {

	@Test
	public void capturecontactadd() throws Exception {

		WebDriver driver = Browserdriver.getDriver();
		Contactpage contactpage = PageFactory.initElements(driver, Contactpage.class);
		Waitforelement.wait(driver);

		// click on about menu
		contactpage.ClickaboutMenu();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 5000)");

		contactpage.Clicklocation();
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("window.scrollBy(0, 400)");

		WebElement addressImage = driver.findElement(By.id("desc0_0"));

		// Get entire page screenshot
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		BufferedImage fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page
		Point point = addressImage.getLocation();

		// Get width and height of the element
		int eleWidth = addressImage.getSize().getWidth();
		int eleHeight = addressImage.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot = fullImg.getSubimage(point.getX(), point.getY(), eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		File screenshotLocation = new File("C:\\Users\\aka_s\\git\\Daviesgroupproject\\davies-group\\Screenshot\\screenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);

		//close the browser
		Browserdriver.quitDriver(driver);

	}

}
