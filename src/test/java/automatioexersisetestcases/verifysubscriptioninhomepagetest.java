package automatioexersisetestcases;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import automatioexersisepages.mainpage;

public class verifysubscriptioninhomepagetest {

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
		WebElement element=(driver.findElement(By.xpath("//h2[text()='Subscription']")));
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView();",element ); 
		mainpage main=new mainpage(driver);
		main.verifysubscriptiontxt();
		
}
}
