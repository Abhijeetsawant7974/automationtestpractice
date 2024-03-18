package automatioexersisepages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logintoyouraccount {
	
	@FindBy(xpath="//h2[text()='Login to your account']")private WebElement LogintoyouraccountTxt;
	@FindBy(name="email") private WebElement emailaddress;
	@FindBy(name="password") private WebElement password;
	@FindBy(xpath="//button[@data-qa='login-button']") private WebElement login;
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/text()")private WebElement logedinusername;
	@FindBy(xpath="//b[text()='nimish']")private WebElement usernameisvisibale; 	
	@FindBy(xpath="//a[@href='/logout']")private WebElement logoutbtn;

	

	
	
	public logintoyouraccount(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}
	
	public void verifyLoginToYourAccount() {
		boolean Logintoyouraccount = LogintoyouraccountTxt.isDisplayed();
		System.out.println("Login to your account text is available =" +Logintoyouraccount);
	}
	
	public void setLoginpageEmail() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String email = WorkbookFactory.create(f1).getSheet("validemailpassword").getRow(1).getCell(0).getStringCellValue();
		emailaddress.sendKeys(email);
		FileInputStream f2=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");

		String pass = WorkbookFactory.create(f2).getSheet("validemailpassword").getRow(1).getCell(1).getStringCellValue();
		password.sendKeys(pass);
		login.click();

	}
	
//	public void setLoginpagepassword() {
//		
//		WorkbookFactory.create(f1).getSheet("validemailpassword").getRow(1).getCell(1).getStringCellValue();
//
//		password.sendKeys("abhi123");
//	}
	
	
	public void verifyloggedinusername() {
		//boolean logininuser = logedinusername.isDisplayed();
		boolean usernamevisibletx = usernameisvisibale.isDisplayed();
		System.out.println("Logged in as username' is not visible"+usernamevisibletx);
//		if(logininuser==usernamevisibletx) {
//			System.out.println("Logged in as username' is visible");
//		}
//		else{
//			System.out.println("Logged in as username' is not visible");
//
//		}
		
	}
	public void clickloginpagelogoutbtn() {
		logoutbtn.click();
	}
}
