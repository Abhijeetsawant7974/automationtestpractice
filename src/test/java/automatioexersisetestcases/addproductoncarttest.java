package automatioexersisetestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;
import automatioexersisepages.productpage;

public class addproductoncarttest {

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
		
		String producturl1 = driver.getCurrentUrl();
		String productactulurl = "https://automationexercise.com/products";
		Assert.assertEquals(producturl1, producturl1);
		
		WebElement firstelementa = driver.findElement(By.xpath("//a[@data-product-id='1']"));
		Actions action=new Actions(driver);
		action.moveToElement(firstelementa).build().perform();
		
		productpage product=new productpage(driver);
		product.clickaddcartbtn();
		
		product.clickcontinuebtn();
		WebElement secondtime = driver.findElement(By.xpath("//a[@data-product-id='2']"));
		action.moveToElement(secondtime).build().perform();
		product.clickaddcartbtn();
		product.clickviewcartbtn();

		
		
		
	}
}
