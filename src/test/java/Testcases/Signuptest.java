package Testcases;
import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.Baseclass;
import pageobjects.Signup;

public class Signuptest extends Baseclass {
	
	@Test
	public void Signup() throws IOException {
		Signup su = new Signup(driver);
		su.getSignup();
		su.getSignusername(prop.getProperty("USERNAME"));
		su.getSignpassword(prop.getProperty("Password"));
		takeScreenshot("Signup");	
	}
	@BeforeTest
	public void Setup() throws IOException {
			readfrompropfile();
		
	}
}
	
