package base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import java.io.IOException;
import utilities.utilities;

public class Baseclass extends utilities{
	
		@BeforeMethod
		public void beforeclass() throws IOException {
		
			browsercofigchrome();
			takeScreenshot("Website Launch");
		}
		@AfterMethod
		public void afterclass() {
			driver.quit();
		}
		
}
