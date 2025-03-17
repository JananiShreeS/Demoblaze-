package Testcases;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Baseclass;
import base.Extentreport;

public class Listener extends Baseclass implements ITestListener{
	 ExtentTest test;
	ExtentReports extent = Extentreport.getreport();
	
	public void onTestSucess(ITestResult result) {
		test.log(Status.PASS, "Test Passed");
	}
		
		public void onTestFailure(ITestResult result) {
			test.fail(result.getThrowable());
			String filepath=null;
			try {
				filepath= takeScreenshot(result.getMethod().getMethodName());
			} catch(IOException e) {
				e.printStackTrace();
			}
			test.addScreenCaptureFromPath(filepath,result.getMethod().getMethodName());
		}
		public void onTestSkipped(ITestResult result) {
			System.out.println("Test Skipped");
		}
		public void OnFinish(ITestContext context) {
			extent.flush();
		}
	}
	


