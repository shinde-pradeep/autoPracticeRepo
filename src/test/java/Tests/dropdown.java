package Tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import BaseClass.OpenBrowser;

public class dropdown {

	WebDriver driver;
	
	
	@Test 
	public void selectFromDropdown () {
		
		
		driver=OpenBrowser.launchEdgeDriver("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement productDropdown = driver.findElement(By.xpath("//select[@id='first']"));
	
		Select sel = new Select (productDropdown);
		 sel.selectByValue("Google");
		
	}
	
	@Test
public void childBrowserPopupByIteratorMethod () {
		
		
		driver=OpenBrowser.launchEdgeDriver("http://demo.guru99.com/popup.php");
		WebElement clickWord = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickWord.click();
		
        
		Set<String> pageAdress=driver.getWindowHandles();
		Iterator <String> i = pageAdress.iterator();
		
		while (i.hasNext())
		{
			driver.switchTo().window(i.next());
			String actualTitle=driver.getTitle();
			String expectedTitle="Guru99 Bank Home Page";
			
			if(actualTitle.equals(expectedTitle))
			{
				//				driver.switchTo().window(i.next());	
				WebElement mailBox=driver.findElement(By.xpath("//input[@name='emailid']"));
				mailBox.sendKeys("okboss@gmail.com");
//				WebElement submitTab=driver.findElement(By.xpath("//input[@name='btnLogin']"));
			}
     }
}
	
	@Test
		public void childBrowserPopupByArrayList () {
			
			
			driver=OpenBrowser.launchEdgeDriver("http://demo.guru99.com/popup.php");
			WebElement clickWord = driver.findElement(By.xpath("//a[text()='Click Here']"));
			clickWord.click();
			
	        
			Set<String> pageAdress=driver.getWindowHandles();
          
			ArrayList <String> address = new ArrayList<String>(pageAdress);			
			
			for (int a=0;a<=address.size();a++)
			{
				
				driver.switchTo().window(address.get(a));
				String actualTitle=driver.getTitle();
				String expectedTitle="Guru99 Bank Home Page";
				
				if(actualTitle.equals(expectedTitle))
				{

					//				driver.switchTo().window(i.next());
					
					WebElement mailBox=driver.findElement(By.xpath("//input[@name='emailid']"));
					
					mailBox.sendKeys("okboss@gmail.com");
					
//					WebElement submitTab=driver.findElement(By.xpath("//input[@name='btnLogin']"));
//					submitTab.click();
				}
					
		
			}
			

}

	@Test
public void actionClassPractice () throws InterruptedException {
	
		driver=OpenBrowser.launchEdgeDriver("https://demoqa.com/text-box");
	
		Thread.sleep(2000);
		WebElement emailIdTextBox = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailIdTextBox.sendKeys("shinde@gmail.com");
		Thread.sleep(2000);

		Actions act = new Actions(driver);

		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);

		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB);
		act.build().perform();
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		Thread.sleep(2000);
		
	
}


}