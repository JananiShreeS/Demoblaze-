package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id='login2']")
	WebElement loginbtn;
		
	@FindBy(xpath="//input[@id='loginusername']")	
	 WebElement Username;
		
	@FindBy(xpath="//input[@id='loginpassword']")
	WebElement Password;

	@FindBy(xpath="//button[@onclick='logIn()']")
	 WebElement logInbtn;


	public void getLoginbtn() {
		 loginbtn.click();
	}

	public void enterUsername(String username) {
	    Username.sendKeys(username);
	}

	public void enterPassword(String password) {
	    Password.sendKeys(password);
	}

	public void getLogInbtn() {
		 logInbtn.click();
	}

	


	
	
	
	
}
