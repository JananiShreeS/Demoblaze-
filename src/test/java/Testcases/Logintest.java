package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Login;

public class Logintest extends Baseclass {
	@Test
	public void Login() throws IOException {
		Login lu=new Login(driver);
		lu.getLoginbtn();
		lu.enterUsername(prop.getProperty("USERNAME"));
		lu.enterPassword(prop.getProperty("Password"));
		lu.getLogInbtn();
		takeScreenshot("Login");
}

	@BeforeTest
	public void Setup() throws IOException {
		readfrompropfile();

	} 

}
