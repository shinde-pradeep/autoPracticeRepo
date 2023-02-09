package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {

	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)","webElement");
		js.executeScript("window.scrollBy(100,200)");
		
		js.executeScript("arguments[0].click()", "we");
		js.executeScript("arguments[0].value='11111'","we");
		
		js.executeScript("arguments[0].style.border='3px solid red'","we");
		js.executeScript("arguments[0].backgroundcolor='ok'","we");
		
		js.executeScript("alert('...alert is created...')");
		js.executeScript("hostory.go[0]");
				
		js.executeScript("return document.title").toString();		
		js.executeScript("return document.domain").toString();		
		js.executeScript("return document.URL").toString();		
		js.executeScript("return document.documentElement.innerText").toString(); //...............		
		
		
		
		
		
		
		
		
		
		
		
	}
}
