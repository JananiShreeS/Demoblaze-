package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Orderplacingpage;

public class orderplace extends Baseclass {
	@Test
	public void Orderplace() throws IOException {
		Orderplacingpage op = new Orderplacingpage(driver);
		op.getPlaceOrderbtn();
		op.enterName(prop.getProperty("Name"));
		op.enterCountry(prop.getProperty("Country"));
		op.enterCity(prop.getProperty("City"));
		op.enterCreditCard(prop.getProperty("Creditcard"));
		op.enterMonth(prop.getProperty("Month"));
		op.enterYear(prop.getProperty("Year"));
		op.getPurchaseOrder();
		takeScreenshot("Order Place");
	}
	@BeforeTest
	public void Setup() throws IOException {
			readfrompropfile();
		
	}
	
	}

