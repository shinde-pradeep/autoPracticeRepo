package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAndCrossBrowserPractice {

	WebDriver driver;
	
	
	
		@Test
		@Parameters({"browser","link"})
		public void openFacebook (String browser,String pageLink) {
			
		if(browser.equalsIgnoreCase("chrome"))
		{
		    System.setProperty("webdriver.chrome.driver","D:\\1.old files\\100.automation\\my.mavan.1\\src\\main\\resources\\chromedriver.exe");
		    driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			 System.setProperty("webdriver.edge.driver","D:\\1.old files\\100.automation\\my.mavan.1\\src\\main\\resources\\msedgedriver.exe");
			 driver= new ChromeDriver();
		}
		else
		{
			System.out.println("please provide valid browser");
		}
		 
		driver.get(pageLink);
		
		}
		
			
		
		
}
