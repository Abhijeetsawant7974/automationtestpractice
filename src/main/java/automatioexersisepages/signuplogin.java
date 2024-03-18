package automatioexersisepages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuplogin {
	


	@FindBy (xpath="//h2[text()='New User Signup!']") private WebElement neusersignuptext;
	@FindBy (xpath="//input[@name='name']") private WebElement name;
	@FindBy (xpath="//input[@data-qa='signup-email']") private WebElement emailaddresssignup;
	@FindBy (xpath="//button[@data-qa='signup-button']") private WebElement signupbtn;
	@FindBy(xpath="//p[text()='Email Address already exist!']")private WebElement emailalreadyexist;
	
	public signuplogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public void verifyNewUserSignUP()
	{
		boolean disply = neusersignuptext.isDisplayed();
		System.out.println(disply);
	}
	
	public void setName() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String namee = WorkbookFactory.create(f1).getSheet("nameandemail").getRow(1).getCell(0).getStringCellValue();
		name.clear();
		name.sendKeys(namee);		
	}
	
	public void SetemailAddress() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String email = WorkbookFactory.create(f1).getSheet("nameandemail").getRow(1).getCell(1).getStringCellValue();
		System.out.println(email);
		emailaddresssignup.clear();
		emailaddresssignup.sendKeys(email);
	}
	
	public void clickSignupBtn() {
		signupbtn.click();
	}
	
	public void verifyemailallreadyexist() {
		boolean emailalready = emailalreadyexist.isDisplayed();
		System.out.println("email allready exist mesage shown" +emailalready);
		
	}
	
	
}
