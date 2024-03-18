package automatioexersisepages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class lunchbrowser {
	WebDriver driver;
	public lunchbrowser() {
		PageFactory.initElements(driver, this);
		
	}

	public void browserlunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
}
