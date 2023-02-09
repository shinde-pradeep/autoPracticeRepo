package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowser {

 public static WebDriver driver;
 
 
	public static WebDriver launchBrowser(String url) {
	
		System.setProperty("webdriver.chrome.driver","D:\\1.old files\\100.automation\\my.mavan.1\\src\\main\\resources\\chromedriver.exe");
	

		ChromeOptions option = new ChromeOptions ();    
        option.addArguments("--disable-notifications");
        
        WebDriver driver = new ChromeDriver (option);    
        driver.get(url);
        driver.manage().window().maximize();
        return driver;
	}
	
	public static WebDriver launchEdgeDriver (String url) {
		
		System.setProperty("webdriver.edge.driver","D:\\4.autoPractice\\my.mavan.1\\src\\main\\resources\\edgedriver_win64\\msedgedriver.exe");
		 
		WebDriver driver= new EdgeDriver();
		
		 driver.get(url);
		 driver.manage().window().maximize();
		 return driver;
	}

/*
	@BeforeTest
	@Parameters({"browser"})
	
	public void launchBrowserParaller (String browsero) {
		
		if(browsero.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\4.autoPractice\\my.mavan.1\\src\\main\\resources\\chromedriver.exe");
	         driver = new ChromeDriver ();    
		}
		else if (browsero.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver","D:\\4.autoPractice\\my.mavan.1\\src\\main\\resources\\edgedriver_win64\\msedgedriver.exe");
			 driver= new EdgeDriver();
		}
		else
		{
			 driver= new FirefoxDriver();
		}
			
		 driver.get("https://demoblaze.com/index.html");
		 driver.manage().window().maximize();	
	}
	
*/
	
}
