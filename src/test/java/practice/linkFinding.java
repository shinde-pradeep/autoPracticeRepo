package practice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class linkFinding {

	
	public static void main (String [] args) {
		
		String url; // local Variable....................................

	System.setProperty("webdriver.chrome.driver","D:\\4.autoPractice\\my.mavan.1\\src\\main\\resources\\chromedriver_win32\\chromedriver.exe");	

	ChromeOptions opt= new ChromeOptions();
	opt.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php");
	driver.manage().window().maximize();
	
	
	List <WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println(link.size());
	
	Iterator <WebElement> i = link.iterator();
	
	while (i.hasNext()) 
	{
		
		url=i.next().getAttribute("href");
		
		if(url==null || url.isEmpty()) 
		{
			
			System.out.println(url + " is empty");
			continue;
			
		}
		
		try 
		{
			HttpURLConnection con = (HttpURLConnection)(new URL(url).openConnection());
			
			con.setRequestMethod("HEAD");
			con.connect();
			
			int respCode=con.getResponseCode();
			
			if(respCode>400) 
			{
				System.out.println(url + " link is invalid");	
			}
			else 
			{
				System.out.println(url+ " link is valid");
			}
		}
		catch (Exception e)
		{System.out.println(e);}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	}


}
