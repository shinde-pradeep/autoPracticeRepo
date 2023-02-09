package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class DemoblazeBySpringCT {

	@FindBy (xpath="//a[text()='Log in']") private WebElement logInWord;
	
	@FindBy (xpath="//input[@id='loginusername']") private WebElement usernameField;
	@FindBy (xpath="//input[@id='loginpassword']") private WebElement passwordField;
	@FindBy (xpath="//button[text()='Log in']") private WebElement loginTab;
	
	@FindBy (xpath="//a[text()='Samsung galaxy s6']") private WebElement samsungMobile;
	@FindBy (xpath="//a[text()='Add to cart']") private WebElement addToCart;
	@FindBy (xpath="//a[@class='nav-link'][@href='index.html']") private WebElement homeWord;
	@FindBy (xpath="//a[text()='Laptops']") private WebElement laptops;
	@FindBy (xpath="//a[text()='Dell i7 8gb']") private WebElement dellI7Laptop;
	@FindBy (xpath="//a[text()='Monitors']") private WebElement monitors;
	@FindBy (xpath="//a[text()='ASUS Full HD']") private WebElement asusMonitor;
	@FindBy (xpath="//a[text()='Cart']") private WebElement goToCart;
	
	@FindBy (xpath=("//button[text()='Place Order']")) private WebElement placeOrderTab;
	@FindBy (xpath=("//input[@id='name']")) private WebElement name;
	@FindBy (xpath=("//input[@id='country']")) private WebElement country;
	@FindBy (xpath=("//input[@id='city']")) private WebElement city;
	@FindBy (xpath=("//input[@id='card']")) private WebElement creditCard;
	@FindBy (xpath=("//input[@id='month']")) private WebElement month;
	@FindBy (xpath=("//input[@id='year']")) private WebElement year;
	@FindBy (xpath=("//button[text()='Purchase']")) private WebElement purchaseTab;
	
	@FindBy (xpath="//p[@class='lead text-muted ']") private WebElement getPurcgaseDetails;
	
	

	public DemoblazeBySpringCT(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	public void clickOnLogInWord () {
		logInWord.click();
	}
	public void enterUsername (String userName,WebDriver driver) {
		
		FluentWait <WebDriver> wait= new FluentWait <WebDriver>(driver); // Fluent wait................
		wait.withTimeout(Duration.ofMillis(2000));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(usernameField)); 
		
		usernameField.sendKeys(userName);
	}
	public void enterPassword (String pass) {
		passwordField.sendKeys(pass);
	}
	public void clickOnLogInTab () {
		loginTab.click();
	}
	
	public void clickOnSamsungMobile () {
		samsungMobile.click();
	}
	public void clickOnAddToCartTab () {
		addToCart.click();
	}
	public void clickOnHomeWord () {
		homeWord.click();
	}
	public void clickOnLaptops () {
		laptops.click();
	}
	public void clickOnDellLaptop8gbI7 () {
		dellI7Laptop.click();
	}
	public void clickOnMonitors () {
		monitors.click();
	}
	public void clickOnAssusMonitor () {
		asusMonitor.click();
	}
	public void clickOnGoToCartWord () {
		goToCart.click();
	}
	
	public void clickOnPlaceOrderTab () {
		placeOrderTab.click();
	}
	public void enterName (String buyerName) {
		name.sendKeys(buyerName);
	}
	public void enterCountry (String countryName) {
		country.sendKeys(countryName);
	}
	public void enterCity (String cityName) {
		city.sendKeys(cityName);
	}
	public void enterCreditCard (String cardDetails) {
		creditCard.sendKeys(cardDetails);
	}
	public void enterMonth (String monthName) {
		month.sendKeys(monthName);
	}
	public void enterYear (String currentYear) {
		year.sendKeys(currentYear);
	}
	public void clickOnPurchase () {
		purchaseTab.click();
	}

	public String getOrderDetails () {
		String data=getPurcgaseDetails.getText();
		return data;
	}
	
	
	
}
