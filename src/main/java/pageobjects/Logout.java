package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public WebDriver driver;


	public Logout(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(id="logout2") 
	private WebElement logout;


	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getLogout() {
		logout.click();
		return logout;
	}


}
