package automatioexersisepages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class signuppage {

	@FindBy (xpath="//b[text()='Enter Account Information']")private WebElement enteraccountinfotext;
	@FindBy (xpath="//input[@id='id_gender1']") private WebElement titleMrMs;
	@FindBy (xpath="//input[@id='name']") private WebElement name;
	@FindBy (xpath="//input[@id='email']") private WebElement email;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//select[@id='days']") private WebElement birthday;
	@FindBy (xpath="//select[@id='months']") private WebElement months;
	@FindBy (xpath="//select[@id='years']") private WebElement years;
	@FindBy (xpath="//input[@id='newsletter']") private WebElement newsletter;
	@FindBy (xpath="//input[@id='optin']") private WebElement optin;
	@FindBy (xpath="//input[@id='first_name']") private WebElement firstname;
	@FindBy (xpath="//input[@id='last_name']") private WebElement last_name;
	@FindBy (xpath="//input[@id='company']") private WebElement company;
	@FindBy (xpath="//input[@id='address1']") private WebElement address1;
	@FindBy (xpath="//input[@id='address2']") private WebElement address2;
	@FindBy (xpath="//select[@id='country']") private WebElement country;
	@FindBy (xpath="//input[@id='state']") private WebElement state;
	@FindBy (xpath="//input[@id='city']") private WebElement city;
	@FindBy (xpath="//input[@id='zipcode']") private WebElement zipcode;
	@FindBy (xpath="//input[@id='mobile_number']") private WebElement mobile_number;
	@FindBy (xpath="//button[@data-qa='create-account']") private WebElement createaccount;
	@FindBy (xpath="//h2[@data-qa='account-created']/b") private WebElement accountcreatedmsg;
	@FindBy (xpath="//a[@data-qa='continue-button']") private WebElement continuebutton;
	@FindBy (xpath="//a[@href='/delete_account']") private WebElement deleteaccount;
	@FindBy (xpath="//h2[@data-qa='account-deleted']") private WebElement accountdeletedmsg;
	@FindBy (xpath="//a[@data-qa='continue-button']") private WebElement accountdeletedcontinuebtn;
	@FindBy(xpath="//a[@href='/logout']")private WebElement logoutbtn;
	
	
	
	public signuppage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public void verifyEnterAccountInfotext() {
		boolean enteraccountinfotextvr = enteraccountinfotext.isDisplayed();
		System.out.println("enter account info text is available"+ enteraccountinfotextvr);
	}
	
	public void setSignuppagetitle(){
		titleMrMs.click();
	}
	
	public void setSignuppagename(){
		name.getAttribute("value");
	}
	
	public void setSignuppageemail(){
		email.getAttribute("value");
	}
	
	
	public void setSignuppagepassord() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String passwords = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(0).getStringCellValue();
		password.sendKeys(passwords);
	}
	
	public void setSignuppagebirthday() throws EncryptedDocumentException, IOException{
		Select day=new Select(birthday);
//		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
//		String birthdays = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(1).getStringCellValue();
		day.selectByValue("10");
	
	}
	
	public void setSignuppagebirthmonth() throws EncryptedDocumentException, IOException{
		Select month=new Select(months);
//		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
//		String birthmonth = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(2).getStringCellValue();
		month.selectByValue("10");
	}
	
	public void setSignuppagebirthyear() throws EncryptedDocumentException, IOException{
		Select year=new Select(years);
//		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
//		String birthyear = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(3).getStringCellValue();
		year.selectByValue("1995");
	}
	
	public void setSignuppageSignupforournewsletter(){
		newsletter.click();
	}
	
	public void clicksignuppageSignupReceivespecialoffers(){
		optin.click();
	}
	
	public void setSignuppageSignuppageFirstName() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String firstnames = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(4).getStringCellValue();
		firstname.sendKeys(firstnames);
	}
	
	public void setSignuppageSignuppageLastName() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String lastnames = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(5).getStringCellValue();
		last_name.sendKeys(lastnames);
	}
	
	public void setSignuppageSignuppageCompany() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String companyname = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(6).getStringCellValue();
		company.sendKeys(companyname);
	}
	
	public void setSignuppageSignuppageAddress1() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String addressline1 = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(7).getStringCellValue();
		address1.sendKeys(addressline1);
		}
	
	public void setSignuppageSignuppageAddress2() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String addressline2 = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(8).getStringCellValue();
		address2.sendKeys(addressline2);
	}
	
	public void setSignuppageSignuppageCountry() throws EncryptedDocumentException, IOException{
		Select countrys=new Select(country);
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String contry = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(9).getStringCellValue();
		countrys.selectByVisibleText(contry);
	}
	
	public void setSignuppageSignuppagestate() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String statename = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(10).getStringCellValue();
		state.sendKeys(statename);
	}
	
	public void setSignuppagecity() throws EncryptedDocumentException, IOException{
		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
		String cityname = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(11).getStringCellValue();
		city.sendKeys(cityname);
	}
	
	
	public void setSignuppageSignuppageZipcode() throws EncryptedDocumentException, IOException{
//		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
//		String zipcodee = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(12).getStringCellValue();
		zipcode.sendKeys("411014");
	}
	
	public void setSignuppageSignuppageMobileNumber() throws EncryptedDocumentException, IOException{
//		FileInputStream f1=new FileInputStream("C:\\Users\\Abhijeet\\Desktop\\user.xlsx");
//		String mobile = WorkbookFactory.create(f1).getSheet("registerdata").getRow(1).getCell(11).getStringCellValue();
		mobile_number.sendKeys("8952145210");
	}
	
	public void clicksignuppageCreateAccountBtn() {
		createaccount.click();
	}
	
	public void verifysignuppageaccountcreatedmsg() {
		boolean accountcreatedmessage = accountcreatedmsg.isDisplayed();
		System.out.println("accountcreatedmessage"+accountcreatedmessage);
	}
	
	public void clicksignuppageContinueButton() {
		continuebutton.click();
	}
	
	public void clicksignuppageDeleteAccount() {
		deleteaccount.click();
	}
	
	public void verifySignupPageAccountDeletedTXT() {
		boolean accountdemsg = accountdeletedmsg.isDisplayed();
		System.out.println("account deleted msg is displayed" + accountdemsg);
	}
	
	public void clickSignupPageAccountDeletedContinueBtn() {
		accountdeletedcontinuebtn.click();
	}
	
	public void logout() {
		logoutbtn.click();
	}

	
}
