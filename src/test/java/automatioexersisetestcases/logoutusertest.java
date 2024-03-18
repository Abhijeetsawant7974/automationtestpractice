package automatioexersisetestcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automatioexersisepages.logintoyouraccount;
import automatioexersisepages.mainpage;

public class logoutusertest  {
	WebDriver driver;
	
	@BeforeClass
	public void browserlunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
@Test
public void logoutusergotologinpage() throws EncryptedDocumentException, IOException {
	mainpage main=new mainpage(driver);
	main.clickSignuplogintBtn();
	logintoyouraccount login = new logintoyouraccount(driver);
	login.setLoginpageEmail();
	login.clickloginpagelogoutbtn();
	String currenturl = driver.getCurrentUrl();
	String expectedurl = "https://automationexercise.com/login";
	Assert.assertEquals(currenturl, expectedurl, "login page is not visible");

}
}
