package base;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class Extentreport {
	

		public static ExtentReports getreport() {
			String path="C:\\Users\\wel come\\git\\repository2\\Demoblaze\\Report\\Report.html";
			ExtentSparkReporter reporter=new ExtentSparkReporter(path);
			reporter.config().setReportName("Report");
			ExtentReports extent=new ExtentReports();
			extent.attachReporter(reporter);
			return extent;
			
		}

	}


