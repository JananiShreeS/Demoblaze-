package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categorypage {
	public WebDriver driver;


	public Categorypage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[@class='list-group-item']")
	private WebElement Category;
	@FindBy(linkText="Phones")
	private WebElement Phones;
	
	@FindBy(linkText="Laptops")
	private WebElement Laptops;
	
	@FindBy(linkText="Monitors")
	private WebElement Monitors;


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCategory() {
		return Category;
	}

	public WebElement getPhones() {
		return Phones;
	}

	public WebElement getLaptops() {
		return Laptops;
	}

	public WebElement getMonitors() {
		return Monitors;
	}
	
}
