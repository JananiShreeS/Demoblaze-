package base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.IOException;
import utilities.utilities;

public class Baseclass extends utilities{
	
		@BeforeMethod
		public void Startup() throws IOException {
			browsercofigchrome();
			readfrompropfile();
			takeScreenshot("Website Launch");
		}
		
		
		
		@AfterMethod
		public void afterclass() {
			driver.quit();
		}
		
}
