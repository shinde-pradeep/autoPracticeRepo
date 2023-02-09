package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.OpenBrowser;
import POM.TutorialsninjaSite;

public class TutorialsninjaSiteTest {

	WebDriver driver;
		
		@BeforeTest
		public void openBrowser () {
			
			driver=OpenBrowser.launchBrowser("http://tutorialsninja.com/demo");
		}
		
		@Test
		public void signInToSite() throws InterruptedException {
			
		TutorialsninjaSite tutorialsninjaSite=new TutorialsninjaSite(driver);
		
		Thread.sleep(2000);
		tutorialsninjaSite.clickOnSignInTab();
		Thread.sleep(2000);
		tutorialsninjaSite.clickOnLoginWordFromDropdown();
		Thread.sleep(2000);
		tutorialsninjaSite.enterEmailId("ershinde78@gmail.com");
		tutorialsninjaSite.enterPass("Shinde@7894");
		tutorialsninjaSite.clickOnLoginTab();
		Thread.sleep(2000);
		
		WebElement homeLogo = driver.findElement(By.xpath("//ul[@class='breadcrumb']//following-sibling::li//a//i"));

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", homeLogo);
		js.executeScript("arguments[0].click()",homeLogo);
		
		WebElement searchInputFild = driver.findElement(By.xpath("//input[@name='search']"));
		searchInputFild.sendKeys("ok boss");
		
		System.out.println("page title is "+driver.getTitle());
		
		
		
	
		}		
		
		
		
		
		
}
