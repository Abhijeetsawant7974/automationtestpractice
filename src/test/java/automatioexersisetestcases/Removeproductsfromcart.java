package automatioexersisetestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;

public class Removeproductsfromcart {
	WebDriver driver;
@Test
	public void removefromcart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mainpage main=new mainpage(driver);
		main.clickProductBtn();
		productpage product=new productpage(driver);
		product.verifyproductpageproductlist();
		product.verifyproductnameavailabilitycondition();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(10000);
		product.clickaddcartbtn();
		//product.clickviewcartbtn();
		product.clickcontinueshopping();
		main.clickCartBtn();
	}

}
