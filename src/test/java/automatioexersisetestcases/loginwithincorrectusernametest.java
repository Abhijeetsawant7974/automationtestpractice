package automatioexersisetestcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automatioexersisepages.logintoyouraccount;
import automatioexersisepages.loginwithincorrectusernamepassword;
import automatioexersisepages.mainpage;
import automatioexersisepages.signuppage;

public class loginwithincorrectusernametest {
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
	public void loginwithincorrectdata() throws EncryptedDocumentException, IOException {
		mainpage main=new mainpage(driver);
		main.clickSignuplogintBtn();
		loginwithincorrectusernamepassword account=new loginwithincorrectusernamepassword(driver);
		account.verifyLoginToYourAccount();
		account.setLoginpageEmail();
		account.setLoginpagepassword();
		account.clickLoginPageLoginBtn();	
		account.verifyYourerrormsg();
		
	}
}
