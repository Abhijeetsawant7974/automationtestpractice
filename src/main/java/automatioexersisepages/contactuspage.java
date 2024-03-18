package automatioexersisepages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class contactuspage {

	@FindBy(xpath="//h2[text()='Get In Touch']")private WebElement getintouchtxt;
	@FindBy(xpath="//input[@name='name']")private WebElement name;
	@FindBy(xpath="//input[@name='email']")private WebElement email;
	@FindBy(xpath="//input[@name='subject']")private WebElement subject;
	@FindBy(xpath="//textarea[@name='message']")private WebElement yourmessagehere;
	@FindBy(xpath="//input[@name='upload_file']")private WebElement uploadfile;
	@FindBy(xpath="//input[@name='submit']")private WebElement submit;
	@FindBy(xpath="//div[text()='Success! Your details have been submitted successfully.']")private WebElement submitsuccessfully;
	@FindBy(xpath="//span[text()=' Home']") private WebElement homebtn;

	public contactuspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifygetintouchtxt() {
		boolean getintouch = getintouchtxt.isDisplayed();
		System.out.println("get in touch is visible" +getintouch);
	}
	
	public void setcontactuspagename() {
		name.sendKeys("abhi");
	}
public void setcontactuspageemail() {
	email.sendKeys("abhi@123");
}

public void setcontactuspageyourmsghere() {
	yourmessagehere.sendKeys("i love india");
}

public void clickcontactuspageuploadfile() {
	uploadfile.click();
}

public void clickcontactuspagesubmit() {
	submit.click();
	
}

public void verifysubmitmessage() {
	boolean submitmsg = submitsuccessfully.isDisplayed();
	System.out.println("Success! Your details have been submitted successfully." +submitmsg);
}

public void clickhomebtn() {
	homebtn.click();
	
}
}
