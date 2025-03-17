package Testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import base.Baseclass;
import pageobjects.Selectionpage;

public class Selection extends Baseclass {
    Selectionpage sp;

	@Test
    public void Selectiontest() throws IOException, InterruptedException {
		
		
		 sp = new Selectionpage(driver);
        // Navigate to Phones
        sp.getPhones();
        sp.selectPhoneCategory();
       click(sp.getAddtocartbtnphone());

     /*   // Navigate to Laptops
        sp.getLaptops();
        sp.selectLaptopCategory();
        click(sp.getAddtocartlaptop());

        // Navigate to Monitors
        sp.getMonitors();
        sp.selectMonitorCategory();
       click(sp.getAddtocartmonitor());
       */

        // Capture Screenshot
        takeScreenshot("Selection");
        
        
		//Alert al=driver.switchTo().alert();
		//al.accept();
		
	}
        
    

	@BeforeTest
	public void Setup() throws IOException {
			readfrompropfile();
	}
}

	


