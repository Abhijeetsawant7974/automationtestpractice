package automatioexersisepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class cartpage {

	@FindBy(xpath="//h2[text()='Address Details']")private WebElement addressdetails;
	@FindBy(xpath="//h2[text()='Review Your Order']")private WebElement revieworder;
	@FindBy(name="message")private WebElement comment;
	@FindBy(xpath="//a[@href='/payment']")private WebElement placeorder;
	@FindBy(xpath="//input[@name='name_on_card']")private WebElement nameoncard;
	@FindBy(xpath="//input[@name='card_number']")private WebElement cardno;
	@FindBy(xpath="//input[@name='cvc']")private WebElement cvv;
	@FindBy(xpath="//input[@name='expiry_month']")private WebElement expeitionmonth;
	@FindBy(xpath="//input[@name='expiry_year']")private WebElement expiryyear;
	@FindBy(xpath="//button[@id='submit']")private WebElement payandconfirmorder;
	@FindBy(xpath="//b[text()='Order Placed!']")private WebElement orderplacedmsg;
	@FindBy(xpath="//a[@data-qa='continue-button']")private WebElement continuebtn;


public cartpage(WebDriver driver) {

PageFactory.initElements(driver, this);

}

public void placeorderbtn() {
	boolean address = addressdetails.isDisplayed();
	System.out.println("Address Details section is visible" +address);
	
	boolean review = revieworder.isDisplayed();
	System.out.println("revieworder section is visible" +review);
	
	comment.sendKeys("fhdsjgfdshfhdshgfdsjk");
	
	placeorder.click();
	
	nameoncard.sendKeys("amit");
	cardno.sendKeys("56445646455");
	cvv.sendKeys("654");
	expeitionmonth.sendKeys("05");
	expiryyear.sendKeys("2025");
	payandconfirmorder.click();
	boolean order = orderplacedmsg.isDisplayed();
	System.out.println("order placed msg is visible= " +order);
	continuebtn.click();
	
}


}