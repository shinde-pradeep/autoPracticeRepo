package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class practiceHere {
	
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","D:\\1.old files\\100.automation\\my.mavan.1\\src\\main\\resources\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://demoblaze.com/index.html");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    WebElement loginWord= driver.findElement(By.xpath("//a[text()='Log in']"));
	    loginWord.click();
	    
	    Thread.sleep(2000);

	    WebElement userName= driver.findElement(By.xpath("//input[@id='loginusername']"));
	    userName.sendKeys("shinde12345");
	    WebElement pass= driver.findElement(By.xpath("//input[@id='loginpassword']"));
        pass.sendKeys("shinde12345");
	    WebElement loginButton= driver.findElement(By.xpath("//button[text()='Log in']"));
	    loginButton.click();

	    Thread.sleep(5000);

	    WebElement nokiaMob= driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']"));
	    
 WebDriverWait wait= new WebDriverWait(driver,Duration.ofMillis(2000));
 wait.until(ExpectedConditions.visibilityOf(nokiaMob));
	    nokiaMob.click();

	    Thread.sleep(2000);

	    WebElement addToCartButton= driver.findElement(By.xpath("//a[text()='Add to cart']"));
	    addToCartButton.click();
	    Thread.sleep(1000);
	    Alert a=driver.switchTo().alert();
	    a.accept();
	    Thread.sleep(1000);
	    WebElement homeButton= driver.findElement(By.xpath("//a[@class='nav-link'][@href='index.html']"));
	    homeButton.click();
	    Thread.sleep(1000);
	    
	    WebElement laptopWord= driver.findElement(By.xpath("//a[text()='Laptops']"));
	    laptopWord.click();
	    
	    
	    Thread.sleep(2000);
	    WebElement mackbookProLaptop= driver.findElement(By.xpath("//a[text()='MacBook Pro']"));
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].scrollIntoView(true)",mackbookProLaptop);

        mackbookProLaptop.click();
        
	    Thread.sleep(2000);
	    WebElement addToCartButton2= driver.findElement(By.xpath("//a[text()='Add to cart']"));
	    addToCartButton2.click();
	    Thread.sleep(1000);
	    a.accept();
	    Thread.sleep(1000);
	    
	    WebElement homeButton2= driver.findElement(By.xpath("//a[@class='nav-link'][@href='index.html']"));

js.executeScript("arguments[0].click()",homeButton2);	    
	    
        Thread.sleep(2000);
        WebElement cartWord= driver.findElement(By.xpath("//a[text()='Cart']"));
        cartWord.click();  
	
        Thread.sleep(5000);

	    List<WebElement> price= driver.findElements(By.xpath("//table//tbody//td[3]"));
	
	    int [] priceA = new int[price.size()];
	
	    for(int pr=0;pr<=price.size()-1;pr++)
	    {
	    	
	    	priceA[pr]=Integer.parseInt(price.get(pr).getText());
	    	
	    }
	
	    System.out.println("all values from the table are -"+Arrays.toString(priceA));
	
	     Arrays.sort(priceA);
		 System.out.println("all values from the table after sort ASC. are -"+Arrays.toString(priceA));

	     int Price=0;
	     int totalPrice=0;
	
	     for(int pr=0;pr<=price.size()-1;pr++)
		    {
		    	
	    	 Price=Integer.parseInt(price.get(pr).getText());
	    	 totalPrice=totalPrice+Price;
		    	
		    }
	    System.out.println("total price of all items in chart is = "+totalPrice);
	
	
	    int totalBySystemInt=0;
	    WebElement totalBySystem= driver.findElement(By.xpath("//h3[@id='totalp']"));

	    totalBySystemInt=Integer.parseInt(totalBySystem.getText());

	    SoftAssert sa= new SoftAssert ();
	    
	    sa.assertEquals(totalPrice, totalBySystemInt,"total price is not same ");
	    
	    sa.assertAll();
	
	    
	    
	
	}
	
}

