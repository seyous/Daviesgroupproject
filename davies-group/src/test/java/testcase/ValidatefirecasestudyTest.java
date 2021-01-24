package testcase;

import static org.junit.Assert.assertEquals;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

import pageobject.Solutionpage;
import util.Browserdriver;
import util.Executescript;
import util.Waitforelement;

public class ValidatefirecasestudyTest {

	@Test
	public void validatefirecase() throws Exception {

		// Navigate to the browser
		WebDriver driver = Browserdriver.getDriver();
		Solutionpage solutionpage = PageFactory.initElements(driver, Solutionpage.class);
		Waitforelement.Driverwait(driver);

		solutionpage.clickSolutionMenu();

		solutionpage.clickViewAll();

		solutionpage.clickviewMore();
		solutionpage.ClickloadMore();

		solutionpage.Clickfireinvestigation();

		String fireInvestigationurl = driver.getCurrentUrl();
		assertEquals("https://davies-group.com/case-study/fire-investigation/", fireInvestigationurl);

		Executescript.JavascriptexecutorCoordinate(driver);
		WebElement fireresult = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div[1]/div/div/h2[2]")); 
		
		// Get entire page screenshot
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		BufferedImage  fullImg = ImageIO.read(screenshot);

		// Get the location of element on the page
		Point point = fireresult.getLocation();

		// Get width and height of the element
		int eleWidth = fireresult.getSize().getWidth();
		int eleHeight = fireresult.getSize().getHeight();

		// Crop the entire page screenshot to get only element screenshot
		BufferedImage eleScreenshot= fullImg.getSubimage(point.getX(), point.getY(),eleWidth, eleHeight);
		ImageIO.write(eleScreenshot, "png", screenshot);

		// Copy the element screenshot to disk
		File screenshotLocation = new File("C:\\Users\\aka_s\\git\\Daviesgroupproject\\davies-group\\screenshot\\screenshot.png");
		FileUtils.copyFile(screenshot, screenshotLocation);
		
		//close the browser
		Browserdriver.quitDriver(driver);

	}
		
	
}