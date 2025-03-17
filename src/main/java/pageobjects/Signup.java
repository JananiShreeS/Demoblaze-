package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	

		public WebDriver driver;
		public Signup(WebDriver driver) {
			this.driver=driver;
		PageFactory.initElements(driver,this);
		}
	@FindBy(xpath="//a[@id='signin2']")
	WebElement Signup;

	@FindBy(xpath="//input[@id='sign-username']")
	WebElement username;

	@FindBy(xpath="//input[@id='sign-password']")
	 WebElement password;

	@FindBy(xpath="//button[@onclick='register()']")
	WebElement Signupbtn;

	public WebDriver getDriver() {
		return driver;
	}

	public void getSignup() {
	Signup.click();
	}

	public void getSignusername(String Username) {
		username.sendKeys(Username);
	}

	public void getSignpassword(String Password) {
		password.sendKeys(Password);
	}

	public void getSignupbtn() {
		Signupbtn.click();
	}

	
	

	
}
 