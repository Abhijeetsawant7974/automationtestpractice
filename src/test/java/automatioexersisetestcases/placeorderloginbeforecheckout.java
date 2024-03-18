package automatioexersisetestcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automatioexersisepages.cartpage;
import automatioexersisepages.logintoyouraccount;
import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;
import automatioexersisepages.signuplogin;
import automatioexersisepages.signuppage;

public class placeorderloginbeforecheckout {

	@Test
	public void LoginBfcheckout() throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://automationexercise.com");
			driver.manage().window().maximize();
			Thread.sleep(10000);
			String currenturl = driver.getCurrentUrl();
			String actualurl = "https://automationexercise.com/";
			Assert.assertEquals(currenturl, actualurl);
			mainpage main= new mainpage(driver);
			Thread.sleep(20000);
			mainpage mainpage = new mainpage(driver);
			main.clickSignuplogintBtn();
			logintoyouraccount login=new logintoyouraccount(driver);
			login.setLoginpageEmail();
			Thread.sleep(10000);
			mainpage mainp=new mainpage(driver);
			mainp.clickProductBtn();
			productpage product=new productpage(driver);
			product.verifyproductpageproductlist();
			Thread.sleep(5000);
			product.addtocardproductview();
			driver.navigate().to("https://automationexercise.com/view_cart");
			
			String cartpagecurrenturl = driver.getCurrentUrl();
			String cartpageexpectedurl="https://automationexercise.com/view_cart";
			Assert.assertEquals(cartpagecurrenturl, cartpageexpectedurl);
			driver.navigate().refresh();
			product.clickproceedtocheckout();
			
			cartpage cart=new cartpage(driver);
			cart.placeorderbtn();
			signuppage sign=new signuppage(driver);
			sign.clicksignuppageDeleteAccount();
			sign.verifySignupPageAccountDeletedTXT();
			sign.clickSignupPageAccountDeletedContinueBtn();

		}
}
