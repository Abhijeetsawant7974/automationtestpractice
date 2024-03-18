package automatioexersisetestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;

public class Productcontityinacarttest {
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
	@Test
	public void setcontityonproduct() {
		mainpage main=new mainpage(driver);
		main.clickProductBtn();
		productpage product=new productpage(driver);
		product.verifyproductpageproductlist();
		product.setproductpageproductquantity();
	}
}
