package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.Executescript;
import util.Waitforelement;

public class Solutionpage {

	WebDriver driver;

	
	public Solutionpage(WebDriver driver) {
		this.driver = driver;
	}

	//Collection of web element
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[1]/div[2]/div/div[4]/button/p")
	private WebElement viewMore;

	@FindBy(how = How.CSS, using = "#menu-item-18257 > a")
	private WebElement solutionMenu;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[3]/div/div/a/p")
	private WebElement viewAllSolution;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[1]/div[2]/div/div[4]/button/p")
	private WebElement loadMore;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/section[1]/div[2]/div/div[3]/ul[3]/li[1]/a/div[1]")
	private WebElement fireinvestigation;

	//Method to perform operation on the solution Menu
	public void clickSolutionMenu() throws Exception {
		Waitforelement.wait(driver);
		solutionMenu.click();
		Waitforelement.wait(driver);
	}

	public void clickViewAll() throws Exception {
		Executescript.Javascriptexecutor(driver); 
		Waitforelement.wait(driver);
		viewAllSolution.click();
		Waitforelement.wait(driver);
	}

	public void clickviewMore() throws Exception {
		Executescript.JavascriptexecutorScale(driver);
		Waitforelement.wait(driver);
		viewMore.click();
		Waitforelement.wait(driver);
	}

	public void ClickloadMore() throws Exception {
		Executescript.Javascriptexecutor(driver);
		Waitforelement.wait(driver);
		loadMore.click();
		Waitforelement.wait(driver);
	}

	public void Clickfireinvestigation() throws Exception {
		Executescript.JavascriptexecutorCoordinate(driver);
		Waitforelement.wait(driver);
		fireinvestigation.click();

	}
}
