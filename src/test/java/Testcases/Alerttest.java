package Testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.Baseclass;

public class Alerttest extends Baseclass{
	@Test
	public void acceptAlert() throws InterruptedException {
		WebElement alertbtn=driver.findElement(By.id("alert"));
		alertbtn.click();
		Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(2000);
	}
	

}
