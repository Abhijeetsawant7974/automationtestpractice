package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class listnersjava {
	WebDriver driver;
	@BeforeClass
	public void setDriver(ITestContext context){
		   driver = new ChromeDriver();
		  context.setAttribute("WebDriver", driver);
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");

			driver.get("https://www.facebook.com/");

	}
	
	
	@Test
	public void test2() throws InterruptedException {
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("abhi@1223");
		WebElement pass = driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys("abhi1452545");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		WebElement homebtn = driver.findElement(By.xpath("//ul[@class='xuk3077 x78zum5 x1iyjqo2 xl56j7k x1p8ty84 x1na7pl x88anuq']/li[1]"));
		boolean homebtndis = homebtn.isDisplayed();
		System.out.println(homebtndis);
		Thread.sleep(10000);
		Assert.assertEquals(homebtndis, true);
	}
	@Test
	public void test3() {
		System.out.println("test case 3 pass");
		Assert.assertTrue(false);
	}
	
	

}
