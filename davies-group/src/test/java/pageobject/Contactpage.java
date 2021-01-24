package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.Waitforelement;

public class Contactpage {

	WebDriver driver;

	//Constructor for the webdriver
	public Contactpage(WebDriver driver) {
		this.driver = driver;
	}

	//Collection of web element
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu-item-18261\"]")
	private WebElement aboutus;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/footer/div/div[1]/ul/li[4]/ul/li[2]/a")
	private WebElement location;

	public void ClickaboutMenu() throws Exception {
		aboutus.click();
		Waitforelement.wait(driver);
	}

	public void Clicklocation() {
		location.click();
	}

}
