package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderplacingpage {
	public WebDriver driver;

	public Orderplacingpage(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement PlaceOrderbtn;
	
	@FindBy(xpath="//input[@id='name']")
	private WebElement Name;
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement Country;
	
	@FindBy(xpath="//input[@id='city']")
	private WebElement City;
	
	@FindBy(xpath="//input[@id='card']")
	private WebElement CreditCard;
	
	@FindBy(xpath="//input[@id='month']")
	private WebElement Month;
	
	@FindBy(xpath="//input[@id='year']")
	private WebElement Year;
	
	@FindBy(xpath="//button[@onclick='purchaseOrder()']")
	private WebElement Purchasebtn;

	

	public WebElement getPlaceOrderbtn() {
		return PlaceOrderbtn;
		
	}

	public void  enterName(String name) {
		 Name.sendKeys(name);
		
	}

	public void enterCountry(String country) {
		Country.sendKeys(country);
	}

	public void enterCity(String city) {
		City.sendKeys(city);
	}

	public void enterCreditCard(String creditcard) {
		CreditCard.sendKeys(creditcard);
	}

	public void enterMonth(String month) {
		 Month.sendKeys(month);
	}

	public void enterYear(String year) {
	 Year.sendKeys(year);
	}

	public void getPurchaseOrder() {
		Purchasebtn.click();
		
	}
}
