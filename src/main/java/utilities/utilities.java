package utilities;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class utilities {
	public static WebDriver driver;
	public static Properties prop;
	
	public static void readfrompropfile() throws IOException {
		String proppath="C:\\Users\\wel come\\git\\repository2\\Demoblaze\\src\\main\\java\\resources\\data.properties";
		FileReader fis=new FileReader(proppath);
		  prop = new Properties();
		prop.load(fis);	
	}
		public static void browsercofigchrome() {	
           WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.demoblaze.com");
            driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
	}
	public static WebElement locateByXpath(String Xpath) {
		WebElement findElement = driver.findElement(By.xpath(Xpath));
		return findElement;
		}
	public static WebElement locateById(String id) {
		WebElement findElement = driver.findElement(By.id(id));
		return findElement;
	}
	public static void textInput (WebElement element, String Value) {
		element.sendKeys(Value);
	}
	public static void click(WebElement element) {
		element.click();
	}
public static void refresh()
{
	driver.navigate().refresh();
}
	public static void takeScreenshot(String name) throws IOException {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\wel come\\eclipse-workspace\\Demoblaze\\Screenshot"+name+".jpg");
		FileUtils.copyFile(src, dest);
			
	}
}

