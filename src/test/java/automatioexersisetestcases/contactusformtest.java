package automatioexersisetestcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automatioexersisepages.contactuspage;
import automatioexersisepages.mainpage;

public class contactusformtest {
WebDriver driver;
@BeforeClass
	public void browserlunch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijeet\\Desktop\\Abhijit\\driver\\chromedriver-win64\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}

@Test
public void contactus() {
	mainpage main=new mainpage(driver);
	main.clickContactUsBtn();
	
	contactuspage contactus=new contactuspage(driver);
	contactus.verifygetintouchtxt();
	contactus.setcontactuspagename();
	contactus.setcontactuspageemail();
	contactus.setcontactuspageyourmsghere();
	//contactus.clickcontactuspageuploadfile();
	contactus.clickcontactuspagesubmit();
	driver.switchTo().alert();
	Alert al= driver.switchTo().alert();
	al.accept();
	
	contactus.verifysubmitmessage();
	contactus.clickhomebtn();
}
}
