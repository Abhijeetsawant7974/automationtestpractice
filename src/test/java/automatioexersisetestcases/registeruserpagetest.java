package automatioexersisetestcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import automatioexersisepages.signuplogin;
import automatioexersisepages.signuppage;

public class registeruserpagetest {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
public void browserlunch() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("http://automationexercise.com");
	driver.manage().window().maximize();
	Thread.sleep(10000);
	//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
}
	
	@Test(priority=1)
	public void loginpage() {

		
		mainpage main=new mainpage(driver);
		//WebDriverWait wait = new  WebDriverWait(this, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/login']")));	
		main.clickSignuplogintBtn();
	}
		
	@Test(priority=2)
		public void signuppages() throws EncryptedDocumentException, IOException {
		signuplogin signup=new signuplogin(driver);
		signup.verifyNewUserSignUP();
		signup.setName();
		signup.SetemailAddress();
		signup.clickSignupBtn();
		}
		
	@Test(priority=3)
		public void abc() throws InterruptedException, EncryptedDocumentException, IOException {
		
		signuppage signupmain=new signuppage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		signupmain.verifyEnterAccountInfotext();
		signupmain.setSignuppagetitle();
		signupmain.setSignuppagepassord();
		signupmain.setSignuppagebirthday();
		signupmain.setSignuppagebirthmonth();
		signupmain.setSignuppagebirthyear();
		signupmain.clicksignuppageSignupReceivespecialoffers();
		signupmain.setSignuppageSignupforournewsletter();
		signupmain.setSignuppageSignuppageFirstName();
		signupmain.setSignuppageSignuppageLastName();
		signupmain.setSignuppageSignuppageCompany();
		signupmain.setSignuppageSignuppageAddress1();
		signupmain.setSignuppageSignuppageAddress2();
		signupmain.setSignuppageSignuppageCountry();
		signupmain.setSignuppageSignuppagestate();
		signupmain.setSignuppagecity();		
		signupmain.setSignuppageSignuppageZipcode();
		signupmain.setSignuppageSignuppageMobileNumber();
		signupmain.clicksignuppageCreateAccountBtn();
		signupmain.verifysignuppageaccountcreatedmsg();
		signupmain.clicksignuppageContinueButton();
//		Thread.sleep(10000);
//		signupmain.clicksignuppageDeleteAccount();
//		signupmain.verifySignupPageAccountDeletedTXT();
//		signupmain.clickSignupPageAccountDeletedContinueBtn();
		
		
	}

}
