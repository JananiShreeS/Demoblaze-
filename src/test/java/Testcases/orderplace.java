package Testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Orderplacingpage;
import pageobjects.Selectionpage;

public class orderplace extends Baseclass {
	@BeforeTest
	public void Setup() throws IOException {
			readfrompropfile();
		
	}
	@Test
	public void Orderplace() throws IOException {
		
		
		
		Orderplacingpage op = new Orderplacingpage(driver);
		
		Selectionpage sp = new Selectionpage(driver);
	      //Navigate to Phones
	       sp.getPhones();
	        sp.selectPhoneCategory();
	       click(sp.getAddtocartbtnphone());
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		op.enterName(prop.getProperty("name"));
		op.enterCountry(prop.getProperty("country"));
		op.enterCity(prop.getProperty("city"));
		op.enterCreditCard(prop.getProperty("creditcard"));
		op.enterMonth(prop.getProperty("month"));
		op.enterYear(prop.getProperty("year"));
		op.getPurchaseOrder();
		takeScreenshot("Order Place");
	}
	
	
	}

