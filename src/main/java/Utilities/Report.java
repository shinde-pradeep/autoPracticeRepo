package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {

	public static ExtentReports addReport() {
		
		String dt=Screenshot.printDateAndTime();
		
		ExtentSparkReporter htmlReport= new ExtentSparkReporter("D:\\1.old files\\100.automation\\my.mavan.1\\myHtmlReports\\reportName"+dt+".html");
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(htmlReport);
		
		reports.setSystemInfo("env", "testing");
		reports.setSystemInfo("testing", "regression");
		reports.setSystemInfo("testing by", "shinde");

		return reports;
		
	}
	
}
