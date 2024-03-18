package automatioexersisetestcases;



import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automatioexersisepages.lunchbrowser;
import automatioexersisepages.mainpage;
import automatioexersisepages.signuplogin;


public class RegisterUserwithexistingemailtest {
WebDriver driver;
@Test
	public void browserlunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
@Test
public void loginwwithexistemal() throws EncryptedDocumentException, IOException {
	mainpage main=new mainpage(driver);
	main.clickSignuplogintBtn();
	
	signuplogin signup=new signuplogin(driver);
	signup.verifyNewUserSignUP();
	signup.setName();
	signup.SetemailAddress();
	signup.clickSignupBtn();
	signup.verifyemailallreadyexist();
}
	
}
