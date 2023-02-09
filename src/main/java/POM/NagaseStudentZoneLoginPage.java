package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NagaseStudentZoneLoginPage {

	@FindBy (xpath="//input[@id='userId']") private WebElement userid;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']") private WebElement loginButton;

	@FindBy (xpath="//span[@class='icon-my-courses']") private WebElement myCoursesTab;
	@FindBy (xpath="//a[@data-pssid='1305'][3]") private WebElement QAndATab;
	
	@FindBy (xpath="//a[@class='pmd-floating-action-btn btn pmd-btn-fab pmd-btn-raised pmd-ripple-effect']") private WebElement plusTabAtRightBottom;
	@FindBy (xpath="//select[@id='facultyId']") private WebElement dropDownTab;
	                
	@FindBy (xpath="//textarea[@id='query']") private WebElement enterQuerryText;
	@FindBy (xpath="//button[@id='submit']") private WebElement clickOnSubmit;

	
	
		public NagaseStudentZoneLoginPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
			
		public void enterUserId(String userID )  {
				userid.sendKeys(userID);
		}
		
		public void enterPassword(String pass) {
			password.sendKeys(pass);
		}
		public void clickLoginTab() {
			loginButton.click();
		}
	
		public void clickMyCourseTab() {
			myCoursesTab.click();
        }
		public void clickQAndAnsTab() {
			QAndATab.click();
        }
		public void clickOnPlusSign() {
			plusTabAtRightBottom.click();
        }
		public void selectDropDownTab() {
			dropDownTab.click();
		
        }
		public void enterQuerry(String querry) {
			enterQuerryText.sendKeys(querry);
        }
		
		public void clickOnSubmitQuerry() {
			clickOnSubmit.click();
        }
				
}