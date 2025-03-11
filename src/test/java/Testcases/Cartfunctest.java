package Testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import  org.testng.annotations.AfterMethod;

import base.Baseclass;
import pageobjects.Cartfunc;

public class Cartfunctest extends Baseclass {
@Test
public void Cartfunc() throws IOException {
	Cartfunc cf = new Cartfunc(driver);
	cf.getCartbtn();
	cf.getPic();
	cf.getTitle();
	cf.getPrice();
	cf.getTotal();
	takeScreenshot("Cart Function");
}
	
	@AfterMethod
	public void Cancel() {
		Cartfunc cf = new Cartfunc(driver);
		cf.getCartbtn();
		cf.getPic();
		cf.getTitle();
		cf.getPrice();
		cf.getDelete();
		cf.getTotal();
	}
	


}
