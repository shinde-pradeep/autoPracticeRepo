package practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitsInJava {

	static WebDriver driver;
	
	
	public static void main(String[] args) {
		
	
 // Explicit wait.....................
		
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		
		
 // Explicit wait.....................
	
	    WebElement usernameField= driver.findElement(By.xpath("//input[@id='loginusername']")); 
	    
	    WebDriverWait wait= new WebDriverWait (driver,Duration.ofMillis(3000));
	    wait.until(ExpectedConditions.visibilityOf(usernameField));
	
	
// Fluent wait..........................
	
	    FluentWait <WebDriver> wait2= new FluentWait <WebDriver>(driver); 
	    wait2.withTimeout(Duration.ofMillis(2000));
	    wait2.pollingEvery(Duration.ofMillis(500));
	    wait2.ignoring(Exception.class);
	    wait2.until(ExpectedConditions.visibilityOf(usernameField)); 
	
}
}