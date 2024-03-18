package automatioexersisetestcases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automatioexersisepages.cartpage;
import automatioexersisepages.lunchbrowser;
import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;
import automatioexersisepages.signuplogin;
import automatioexersisepages.signuppage;

public class Pleaceorderregisterwhilecheckout {
	WebDriver driver;
	@BeforeClass
	public void browserlunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		String currenturl = driver.getCurrentUrl();
		String actualurl = "https://automationexercise.com/";
		Assert.assertEquals(currenturl, actualurl);
		mainpage main= new mainpage(driver);
		main.clickProductBtn();
		Thread.sleep(20000);
	}
	@Test(priority=1)
	public void registerwhilecheckout() throws InterruptedException {
		mainpage main=new mainpage(driver);
		main.clickProductBtn();
		productpage product=new productpage(driver);
		product.verifyproductpageproductlist();
		Thread.sleep(5000);
		product.addtocardproductview();
//		Alert al=driver.switchTo().alert();
//		al.accept();
		//product.clickcontinueshopping();
		driver.navigate().to("https://automationexercise.com/view_cart");
		//product.clickviewcartbtn();
		
		String cartpagecurrenturl = driver.getCurrentUrl();
		String cartpageexpectedurl="https://automationexercise.com/view_cart";
		Assert.assertEquals(cartpagecurrenturl, cartpageexpectedurl);
		driver.navigate().refresh();
		product.clickproceedtocheckout();
		//driver.switchTo().frame("aswift_0");
		driver.findElement(By.xpath("//u[normalize-space()='Register / Login']")).click();	
	}
	@Test(priority=2)
	public void setmailandemaill() throws EncryptedDocumentException, IOException, InterruptedException {
		signuplogin signup=new signuplogin(driver);
		signup.setName();
		signup.SetemailAddress();
		signup.clickSignupBtn();
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
		mainpage main=new mainpage(driver);
		main.clickCartBtn();
		productpage product1=new productpage(driver);
		product1.clickproceedtocheckout();
		
		cartpage cart=new cartpage(driver);
		cart.placeorderbtn();
		signuppage sign=new signuppage(driver);
		sign.clicksignuppageDeleteAccount();
		sign.verifySignupPageAccountDeletedTXT();

	}
	
}
