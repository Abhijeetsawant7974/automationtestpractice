package roughtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import roufgh.Signupregistration;
import roufgh.signuppagee;

public class registratinpagetest {
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
		mainpage main=new mainpage(driver);
		main.clickSignuplogintBtn();
		Thread.sleep(20000);
	}
	
	@BeforeMethod
	public void setnameandemail() throws EncryptedDocumentException, IOException {
		signuppagee sign=new signuppagee(driver);
		sign.setName();
		sign.SetemailAddress();
		sign.clickSignupBtn();
	}
	
	@Test
	public void setregistrationpage() throws EncryptedDocumentException, IOException {
		Signupregistration reg= new Signupregistration(driver);
		reg.setSignuppagetitle();
		reg.setSignuppagepassord();
		reg.setSignuppagebirthday();
		reg.setSignuppagebirthmonth();
		reg.setSignuppagebirthyear();
		reg.setSignuppageSignupforournewsletter();
		reg.clicksignuppageSignupReceivespecialoffers();
		reg.setSignuppageSignuppageFirstName();
		reg.setSignuppageSignuppageLastName();
		reg.setSignuppageSignuppageCompany();
		reg.setSignuppageSignuppageAddress1();
		reg.setSignuppageSignuppageAddress2();
		reg.setSignuppageSignuppageCountry();
		reg.setSignuppageSignuppagestate();
		reg.setSignuppageSignuppagestate();
		reg.setSignuppageSignuppageZipcode();
		reg.setSignuppageSignuppageMobileNumber();
		}
}
