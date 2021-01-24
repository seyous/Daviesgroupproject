package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {


	WebDriver driver;
	
	//Constructor for the webdriver
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	//Collection of web element
	@FindBy(how=How.XPATH, using="/html/body/div[1]/footer/div/div[1]/div[2]/ul/li[1]")
	private WebElement twitterhandle;
	
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/footer/div/div[1]/div[2]/ul/li[2]")
	private WebElement linkedhandle; 
	
	
	// Method call for twitter
	public void clicktwitter() {
		twitterhandle.click();
	}

	// Method call for twitter
	public void clicklinked() {
		linkedhandle.click();
	}

}