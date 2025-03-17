package Testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Logout;

public class Logouttest extends Baseclass {
	
@Test
public void Logout() throws IOException {
	Logout lo=new Logout(driver);
	lo.getLogout();
	takeScreenshot("Logout");
}

}
