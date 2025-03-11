package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectionpage {
    public WebDriver driver;

    public Selectionpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Phone category
    @FindBy(linkText = "Phones")
    WebElement Phones;

    @FindBy(xpath = "//a[@href='prod.html?idp_=1']")
    WebElement phonecategory;
    
    @FindBy(xpath="//a[@onclick='addToCart(1)']")
    WebElement Addtocartbtnphone;

    // Laptop category
    @FindBy(linkText = "Laptops")
    WebElement Laptops;

    @FindBy(xpath = "//a[@href='prod.html?idp_=8']")
    WebElement laptopcategory;
    
    @FindBy(xpath="//a[@onclick='addToCart(8)']")
    WebElement Addtocartlaptop;

    // Monitor category
    @FindBy(linkText = "Monitors")
    WebElement Monitors;

    @FindBy(xpath = "//a[@href='prod.html?idp_=10']")
    WebElement monitorcategory;
    
    @FindBy(xpath="//a[@onclick='addToCart(10)']")
    WebElement Addtocartmonitor;

    public WebDriver getDriver() {
        return driver;
    }

   //Phone
    public void getPhones() {
	
		 Phones.click();
	}
    // Select a phone
       	public void selectPhoneCategory() {
   		 phonecategory.click();
   	}
    	public WebElement getAddtocartbtnphone() {
    		return Addtocartbtnphone;
    	}

    // Click on Laptops 
    public void getLaptops() {
        Laptops.click();
    }

    // Select a laptop
   	public void selectLaptopCategory() {
   		 laptopcategory.click();
   	}
    	public WebElement getAddtocartlaptop() {
    		return Addtocartlaptop;
    	}

    // Click on Monitors 
    public void getMonitors() {
        Monitors.click();
    }

    // Select a monitor 
	public void selectMonitorCategory() {
		 monitorcategory.click();
		
	}
	public WebElement getAddtocartmonitor() {
		return Addtocartmonitor;
	}

	
}
