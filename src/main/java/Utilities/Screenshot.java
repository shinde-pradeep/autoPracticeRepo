package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
 public static WebDriver driver;
 
	public static String takeScreenshot (WebDriver driver,String SCname) throws IOException { 
		String dateAndTime =Screenshot.printDateAndTime();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String scPath=System.getProperty("user.dir")+"/myScreenshots/ " + SCname+" "+dateAndTime+".jpg";
		File dest = new File (scPath);

		FileHandler.copy(source, dest);
		
		return scPath;
		
	}
	
	public static String printDateAndTime () {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-mm-yyyy HH-mm-ss");
		LocalDateTime now = LocalDateTime.now();
		String dateTime = dtf.format(now);
		return dateTime;
	}
	
	
}
