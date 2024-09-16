package com.crm.Listeners;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.thepric.Genric.BaseCLass;


public class View_List extends BaseCLass implements ITestListener{
	 
		ExtentReports report;
		ExtentSparkReporter spark;
		ExtentTest test;
		 
		public void onTestStart(ITestResult result) {
			String t_name = result.getMethod().getMethodName();
			Reporter.log(t_name+"�s Executed");
			test=report.createTest(t_name);
			
		}

		 
		public void onTestSuccess(ITestResult result) {
			String t_name = result.getMethod().getMethodName();
			test.log(Status.PASS, t_name+"is success");
		}

		 
		public void onTestFailure(ITestResult result) {
			String t_name = result.getMethod().getMethodName();
			test.log(Status.FAIL, t_name+"is failed");
	        TakesScreenshot ts=(TakesScreenshot)driver;
		    String screenshot = ts.getScreenshotAs(OutputType.BASE64);
		   	test.addScreenCaptureFromBase64String(screenshot);
			
		}

		 
		public void onTestSkipped(ITestResult result) {
			String t_name = result.getMethod().getMethodName();
			test.log(Status.SKIP, t_name+"is skipped");
		}

		 
		public void onStart(ITestContext context) {
			spark=new ExtentSparkReporter("./Extent_Report/View_List Report.html");
			//configure the spark reporter
			spark.config().setDocumentTitle("View_List Report");
			spark.config().setReportName("List_View");
			spark.config().setTheme(Theme.DARK);
			//create the extent report
			report=new ExtentReports();
			//configure extent report
			report.setSystemInfo("Os", "Window-10");
			report.setSystemInfo("Browser","Chrome-100");
			//attach the spark reporter
			report.attachReporter(spark);
		}

		 
		public void onFinish(ITestContext context) {
			report.flush();
		}
		
}
