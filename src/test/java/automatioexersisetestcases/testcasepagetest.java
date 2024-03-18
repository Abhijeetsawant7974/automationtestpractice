package automatioexersisetestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;

@Test
public class testcasepagetest {
	WebDriver driver;
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
		main.clickTestCasetBtn();
		String testcasecurrenturl = driver.getCurrentUrl();
		String actuallurl = "https://automationexercise.com/test_cases";
		Assert.assertEquals(testcasecurrenturl, actuallurl);
	}
}
