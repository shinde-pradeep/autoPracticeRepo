package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YahoLogin {

	@FindBy (xpath="") private WebElement candidateName;

		
	public YahoLogin (WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterCandidateName (String name) {
		
		candidateName.sendKeys(name);
	}
	
}
