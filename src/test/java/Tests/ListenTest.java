package Tests;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.OpenBrowser;
import Utilities.Screenshot;

public class ListenTest extends OpenBrowser implements ITestListener {

	//TestngAnnotations...implemented in this class.....
	
	public void onTestSkipped (ITestResult result) {
		System.out.println("(ITestLisetner) this test is skipped" + result.getName());
		
	}
   public void onTestSuccess (ITestResult result) {
	   
	   System.out.println("(ITestListener) this test is successfull -" + result.getName());
	   
   } 
   
   public void onTestFailure (ITestResult result) {
	   System.out.println("(ITestListener)this test is failed "+ result.getName());
	   try {
		     Screenshot.takeScreenshot(driver, result.getName());
	       } 
	  catch (IOException e) 
	   {
		 e.printStackTrace();
	   }
	
 }
   public void onTestStart (ITestResult result) {
	   System.out.println("(ITestListner) this test is started - " + result.getName());
	   
 }
   public void onTestEnd (ITestResult result) {
	   System.out.println("(ITestListner) this test is ended - " + result.getName());
	   
 }
	
}
