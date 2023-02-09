package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TutorialsninjaSite {

	@FindBy(xpath="//span[@class='caret']") private WebElement  myAccountIcon;
	@FindBy(xpath="//a[text()='Login']") private WebElement  loginWordFromDropdown;
	@FindBy(xpath="//input[@id='input-email']") private WebElement  emailAddress;
	@FindBy(xpath="//input[@id='input-password']") private WebElement  pass;
	@FindBy(xpath="//input[@value='Login']") private WebElement  loginTab;

	@FindBy(xpath="//i[@class='fa fa-home']") private WebElement  homeIcon;
	
	
	//ul[@class='breadcrumb']//following-sibling::li//a//i
	public TutorialsninjaSite (WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickOnSignInTab () {
		myAccountIcon.click();
	}
	public void clickOnLoginWordFromDropdown () {
		loginWordFromDropdown.click();
	}
	public void enterEmailId (String mail) {
		emailAddress.sendKeys(mail);
	}
	public void enterPass (String password) {
		pass.sendKeys(password);
	}
	public void clickOnLoginTab () {
		loginTab.click();                          //2
	}
	
	public void clickOnHomeIcon () {
		homeIcon.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}