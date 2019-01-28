package testscripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {
	
	@Test
	public void loginTest()
	{
		ExtentHtmlReporter report = new ExtentHtmlReporter("./resource/report.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(report);
		ExtentTest act =extend.createTest("actitime date");
		act.log(Status.INFO,"login to actitime");
		act.log(Status.PASS,"date verified");
		extend.flush();
		System.out.println("checjk");
		
	}

}

