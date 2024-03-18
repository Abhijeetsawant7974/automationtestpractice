package utility;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utilitestest {
	WebDriver driver;
	public <string> void newwindow() throws InterruptedException
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("window.open()");
		 ArrayList<string> tabs = new ArrayList<string>();
	}

}
