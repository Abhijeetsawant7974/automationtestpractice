package automatioexersisepages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class loginwithincorrectusernamepassword {

	@FindBy(xpath = "//h2[text()='Login to your account']")
	private WebElement LogintoyouraccountTxt;
	@FindBy(name = "email")
	private WebElement emailaddress;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement login;
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/text()")
	private WebElement logedinusername;
	@FindBy(xpath = "//b[text()='nimish']")
	private WebElement usernameisvisibale;
	@FindBy(xpath = "//p[text()='Your email or password is incorrect!']")
	private WebElement emailorpasswordincorrect;

	public loginwithincorrectusernamepassword(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginToYourAccount() {
		boolean Logintoyouraccount = LogintoyouraccountTxt.isDisplayed();
		System.out.println("Login to your account text is available =" + Logintoyouraccount);
	}

	public void setLoginpageEmail() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String email = WorkbookFactory.create(f1).getSheet("invalidmailandpass").getRow(1).getCell(0).getStringCellValue();
		emailaddress.sendKeys(email);
	}

	public void setLoginpagepassword() throws EncryptedDocumentException, IOException {
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String pass = WorkbookFactory.create(f1).getSheet("invalidmailandpass").getRow(1).getCell(1).getStringCellValue();
		emailaddress.sendKeys(pass);
	}

	public void clickLoginPageLoginBtn() {
		login.click();

	}

	public void verifyYourerrormsg() {
		boolean incorrectemailmsg = emailorpasswordincorrect.isDisplayed();
		System.out.println("Your email or password is incorrect=" + incorrectemailmsg);
	}
}
