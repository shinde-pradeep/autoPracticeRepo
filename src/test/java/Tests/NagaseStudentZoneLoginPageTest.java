package Tests;

	import java.io.IOException;

	import org.apache.poi.EncryptedDocumentException;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.ITestResult;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.Status;

	import BaseClass.OpenBrowser;
	import POM.NagaseStudentZoneLoginPage;
	import Utilities.Report;

	public class NagaseStudentZoneLoginPageTest extends OpenBrowser {
		
		ExtentReports report;
		ExtentTest test;
		
		@BeforeClass
		public void getExtentReport ()
		{
			report=Report.addReport();
		}
		
		
		
		  @BeforeMethod
			public void openBrowser() throws InterruptedException 
		  {
				driver=OpenBrowser.launchBrowser("https://studentzone-ngasce.nmims.edu/");
				Thread.sleep(3000);
          	}
		
			
		  
		  @Test
		  public void logInWithValidCredentials () throws EncryptedDocumentException, IOException, InterruptedException {
			 test=report.createTest("logInWithValidCredentials");
			  
			  NagaseStudentZoneLoginPage nagasestudentzoneloginpage = new NagaseStudentZoneLoginPage(driver);
			
			  nagasestudentzoneloginpage.enterUserId("77777777771");	  
			  nagasestudentzoneloginpage.enterPassword("Pass@2014");
			  nagasestudentzoneloginpage.clickLoginTab();
			  
			  Thread.sleep(3000);
			  nagasestudentzoneloginpage.clickMyCourseTab();
			  nagasestudentzoneloginpage.clickQAndAnsTab();
			  Thread.sleep(3000);
			  nagasestudentzoneloginpage.clickOnPlusSign();
			  Thread.sleep(3000);
			  
			  WebElement dropDown = driver.findElement(By.xpath("//select[@id='facultyId']"));

			  Select s = new Select (dropDown);
			  s.selectByValue("NGASCE0582");
			  
			  nagasestudentzoneloginpage.enterQuerry("practice");
//			  nagasestudentzoneloginpage.clickOnSubmitQuerry();
			  
			  Alert a= driver.switchTo().alert();
			  a.accept();
			 
		 }
		  
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


