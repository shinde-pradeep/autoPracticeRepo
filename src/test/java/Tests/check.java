package Tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClass.OpenBrowser;
import Utilities.Report;
import Utilities.Screenshot;

public class check extends OpenBrowser {

	@Test
	public void launchBrowserAndLogin() throws EncryptedDocumentException, IOException {
		driver =OpenBrowser.launchBrowser("https://kite.zerodha.com/");
}
	
 @AfterMethod
 public void SC () throws IOException {
	 
	Screenshot.takeScreenshot(driver, "okkkk");
	
}
 //......................................................................................
 
	ExtentReports report;
	ExtentTest test;
	
	@BeforeClass
	public void getExtentReport ()
	{
		report=Report.addReport();
	}
	
	
//	 test=report.createTest("logInWithValidCredentials");
	 
	 
	 
 @AfterMethod
 public void captureResult(ITestResult result)
{
	  
	  if(result.getStatus()==ITestResult.SUCCESS)
	  {
	   test.log(Status.PASS, result.getName());
	  }
	  else if (result.getStatus()==ITestResult.FAILURE)
	  
	  {
		  test.log(Status.FAIL, result.getName());
	  }
	  else 
	  {
		  test.log(Status.SKIP, result.getName());
	  }
}
 
 @AfterClass
 
 public void flushReport() 
 {  
	  report.flush();
 }


}