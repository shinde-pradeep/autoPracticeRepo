package Tests;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import BaseClass.OpenBrowser;
import POM.DemoblazeBySpringCT;
import Utilities.Report;
import Utilities.Screenshot;

public class DemoblazeBySpringCTTest {
   
	
	WebDriver driver;
	
	int productPrice2;
	int productPriceInInt;
	
	ExtentReports reports;
	ExtentTest test;
	
	SoftAssert softAssert;
	
	
	@BeforeClass 
	public void setReports () {
		
		reports=Report.addReport();
		
	}
	
	
    @BeforeTest
	public void openBrowserAndLogin () {
		driver=OpenBrowser.launchBrowser("https://demoblaze.com/index.html");
		
	}
	
	@Test (priority=1)
	public void placeOrder () throws InterruptedException {
	test=reports.createTest("placeOrder");
		
						
		DemoblazeBySpringCT demoblazeBySpringCT = new DemoblazeBySpringCT (driver);
	test.log(Status.INFO, "this is logging using extent trports...obj is created...line no.61");

		Thread.sleep(2000);
		
		demoblazeBySpringCT.clickOnLogInWord();
		
		Thread.sleep(2000);
		

		demoblazeBySpringCT.enterUsername("shinde12345",driver); // login
		demoblazeBySpringCT.enterPassword("shinde12345");
		demoblazeBySpringCT.clickOnLogInTab();             
	test.log(Status.INFO, "successfully login");

		Thread.sleep(5000);

		demoblazeBySpringCT.clickOnSamsungMobile();  // add mobile
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnAddToCartTab();
		Thread.sleep(2000);
	test.log(Status.INFO, "mobile added to cart");

		Alert a=driver.switchTo().alert();  //alert handle.................
		a.accept();
	test.log(Status.INFO, "alert handled after adding mob. to cart");

		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnHomeWord();
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnMonitors();    // add monitor
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnAssusMonitor();
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnAddToCartTab();
		Thread.sleep(2000);
		
//		Alert a=driver.switchTo().alert();  //alert handle.................
		a.accept();
		
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnHomeWord();
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnLaptops(); //add laptop
		Thread.sleep(2000);

				
		WebElement dellI7Laptops = driver.findElement(By.xpath("//a[text()='Dell i7 8gb']")); // scroll down.................
				
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",dellI7Laptops);
		
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnDellLaptop8gbI7();
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnAddToCartTab();
		Thread.sleep(2000);

		
//		Alert a=driver.switchTo().alert();  //alert handle.................
		a.accept();
		
		
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnGoToCartWord(); // CART to see purchased items
		
		Thread.sleep(4000);
		
// web table handle..................................................................................................
		
		List <WebElement> priceRow = driver.findElements(By.xpath("//table//tbody//tr//td[3]"));
		int [] ProductPrice = new int[priceRow.size()];
		
		for(int i=0;i<=priceRow.size()-1;i++) {
			
			ProductPrice[i]=Integer.parseInt(priceRow.get(i).getText().trim());
			
		}
		
        System.out.println("array size is - "+ProductPrice.length);  
        
		System.out.println("after using printing statement array is "+Arrays.toString(ProductPrice));	
		System.out.println("after using printing METHOD ...");	//print array by creating method
     	print(ProductPrice);
		
		Arrays.sort(ProductPrice);    // sort array ACENDING............................................
		
		System.out.println("after sorting array is " +(Arrays.toString(ProductPrice)));	
		
		System.out.println("after using printing METHOD array after sorting...");	//print array by creating method
		print(ProductPrice);


		Integer sampleArray []= {1,2,3,4,5};                 // to print array in DCENDING order.................
		Arrays.sort(sampleArray,Collections.reverseOrder());
	    System.out.println("sample array is" +Arrays.toString(sampleArray));
		
// add price..............................................................................................................
	
		int arraySum=0;
      for(int aaa=0;aaa<=ProductPrice.length-1;aaa++)
      {
    	  arraySum= arraySum +ProductPrice[aaa];
      }
      System.out.println("sum1 of items in chart is  - "+ arraySum);

 // add price approach 2.....................
      
		for(int aa=1;aa<=priceRow.size();aa++) {
	
			WebElement productPrice=driver.findElement(By.xpath("//table//tbody//tr["+aa+"]//td[3]"));
			productPriceInInt=(Integer.parseInt(productPrice.getText()));
			productPrice2=productPrice2+productPriceInInt;
			System.out.println("price by loop are - "+productPrice2);
		}
	System.out.println("sum2 of items in chart is - "+ productPrice2); // sum of items in carts................

	// find total calculated by system
	
	WebElement totalPriceCalcBySystem=driver.findElement(By.xpath("//h3[@id=\'totalp\']"));

	int totalAmount=Integer.parseInt((totalPriceCalcBySystem.getText()));
	System.out.println("total amount of items in chart calculated by system is - "+totalAmount);
test.log(Status.INFO, "total amount is collected from system");

	SoftAssert softAssert = new SoftAssert ();
	softAssert.assertEquals(totalAmount, productPrice2, "calculated amount is not matching");
	softAssert.assertAll();
test.log(Status.INFO, "assert applied after camparing total price by system and by calculating");
	
// place order................................................................................................
		
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnPlaceOrderTab();
		Thread.sleep(2000);

		demoblazeBySpringCT.enterName("one");
		demoblazeBySpringCT.enterCountry("india");
		demoblazeBySpringCT.enterCity("pune");
		demoblazeBySpringCT.enterCreditCard("123456 789");
		demoblazeBySpringCT.enterMonth("jan");
		demoblazeBySpringCT.enterYear("2020");
		Thread.sleep(2000);

		demoblazeBySpringCT.clickOnPurchase();
		Thread.sleep(2000);
		
// purchase details..........................................................................		
		
		String orderData=demoblazeBySpringCT.getOrderDetails();
		
		System.out.println(orderData);
	}
	
	@Test (priority=2)
	public void testToFail () {
		
		test=reports.createTest("testToFail");
		
		int a=11;
		int b=111;
		
		softAssert.assertEquals(a, b, " numbers are not matching");
		softAssert.assertAll();		
		
	}
	
	@Test (enabled=false)
	public void testToSkip () {
		
	test=reports.createTest("testToSkip");

	String s1="ok";
	String s2="no";
	
	softAssert.assertEquals(s1,s2,"both strings are not equals");
	softAssert.assertAll();
		
	}
	
	
	public static void print (int [] ar) // method to print....................
	{	
		for(int a=0;a<=ar.length-1;a++)
		{
			System.out.println(ar[a]);	
		}
		
	}
	
	
	@AfterMethod 
	public void collectResults (ITestResult result) throws IOException {
		
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS,"test pass/successed is - "+ result.getName());
		}
		else if(result.getStatus()==ITestResult.FAILURE) 
		{
			test.log(Status.FAIL, "test failed is - "+result.getName());           //to add failed method name
			test.log(Status.FAIL,"exception or error is - "+result.getThrowable());//to add error or exception
			
			String SCpath=Screenshot.takeScreenshot(driver, result.getName());    //to save screenshot path
			test.addScreenCaptureFromPath(SCpath);                               //to get screenshot of failed test case
		}
		else if (result.getStatus()== ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test skipped is - "+result.getName());
		}
		else
		{
			System.out.println("test result not created");
		}
	
		
	}

	
	@AfterClass
	public void flushResults () {
		
		reports.flush();
	}
	
	
}
