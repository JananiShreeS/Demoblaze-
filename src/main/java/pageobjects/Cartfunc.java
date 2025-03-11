package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartfunc {
	public WebDriver driver;

	public Cartfunc(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath= "//a[@href='cart.html']")
	private WebElement Cartbtn;
	@FindBy(id="Pic")
	private WebElement Pic;
	@FindBy(id="Title")
	private WebElement Title;
	@FindBy(id="Price")
	private WebElement Price;
	@FindBy(id="x")
	private WebElement Delete;
	@FindBy(id="totalp")
	private WebElement Total;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Placeorderbtn;

	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getCartbtn() {
		return  Cartbtn;
	}
	public WebElement getPic() {
		return Pic;
	}
	public WebElement getTitle() {
		return Title;
	}
	public WebElement getPrice() {
		return Price;
	}
	public WebElement getDelete() {
		return Delete;
	}
	public WebElement getTotal() {
		return Total;
	}
	public void getPlaceorderbtn() {
		 Placeorderbtn.click();
	}
	
}
