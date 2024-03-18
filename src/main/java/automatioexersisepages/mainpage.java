package automatioexersisepages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainpage {

	
	@FindBy (xpath="//a[@href='/products']")private WebElement product;
	@FindBy (xpath="//a[@href='/view_cart']")private WebElement cart;
	@FindBy (xpath="//a[@href='/login']")private WebElement signuplogin;
	@FindBy (xpath="//a[@href='/test_cases']")private WebElement testcase;
	@FindBy (xpath="//a[@href='/login']")private WebElement apitesting;
	@FindBy (xpath="//a[@href='/products']")private WebElement vediotutorial;
	@FindBy (xpath="//a[@href='/contact_us']")private WebElement contactus;
	@FindBy (xpath="//a[@href='/products']")private WebElement home;
	@FindBy(xpath="//h2[text()='Subscription']")private WebElement subscriptiontxt;
	@FindBy(xpath="//input[@id='susbscribe_email']")private WebElement subscriptionemailid;
	@FindBy(xpath="//button[@id='subscribe']")private WebElement arrowbtn;
	@FindBy(xpath="//div[text()='You have been successfully subscribed!']")private WebElement subscrebsuccessfullymsg;
				
	

public mainpage(WebDriver driver) {
	
	PageFactory.initElements(driver, this);
}


public void clickProductBtn() {
	product.click();
}

public void clickCartBtn() {
	cart.click();
}

public void clickSignuplogintBtn() {
		
//	boolean signuploginbutton = signuplogin.isDisplayed();
//	System.out.println(signuploginbutton);
	signuplogin.click();
}

public void clickTestCasetBtn() {
	testcase.click();
}

public void clickAapiTestingBtn() {
	apitesting.click();
}

public void clickVedioTutorialBtn() {
	vediotutorial.click();
}

public void clickContactUsBtn() {
	contactus.click();
}

public void clickHomeBtn() {
	home.click();
}

public void verifysubscriptiontxt() {
	
	boolean subscription = subscriptiontxt.isDisplayed();
	System.out.println("subscription text is visible"  +subscription);
	
	subscriptionemailid.sendKeys("abhi@54124");
	arrowbtn.click();
	
	
	boolean subscribesuccessmessage = subscrebsuccessfullymsg.isDisplayed();
	System.out.println("You have been successfully subscribed!"  +subscribesuccessmessage);
	
}




}