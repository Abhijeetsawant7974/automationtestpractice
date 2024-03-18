//pass but add is comming so it ill close manualy
package automatioexersisetestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;

public class verifyallproductsandproductdetail {
	WebDriver driver;
	@Test
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
//		Alert al=driver.switchTo().alert();
//		al.dismiss();
		String producturl1 = driver.getCurrentUrl();
		String productactulurl = "https://automationexercise.com/products";
		Assert.assertEquals(producturl1, productactulurl);
		productpage product=new productpage(driver);
		product.verifyproductpageproductlist();
		
		String productdetailpageurl = driver.getCurrentUrl();
		String accualproductdetailpageurl="https://automationexercise.com/product_details/1";
		//Assert.assertEquals(productdetailpageurl, accualproductdetailpageurl, "product detail page is not open");
		
		product.verifyproductnameavailabilitycondition();
		
	}
}
