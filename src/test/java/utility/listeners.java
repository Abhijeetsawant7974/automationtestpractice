package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{
	WebDriver driver=null;
	  public void onTestStart(ITestResult result) {
		  System.out.println("test case start");
	  }

		  
		  public void onTestSuccess(ITestResult result) {
			  System.out.println("test case success");
		  }

		  
		  public void onTestFailure(ITestResult result) {
			  ITestContext context = result.getTestContext();
			    driver = (WebDriver) context.getAttribute("WebDriver");
			  System.out.println("test case fail abhi");
			  File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
			     File dest=new File("E:\\Abhijit\\facebook.png");
			     
			     try {
					FileUtils.copyFile(src, dest);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


		  }

		  public  void onTestSkipped(ITestResult result) {
			  System.out.println("test case skiped");

		  }

		  /**
		   * Invoked each time a method fails but has been annotated with successPercentage and this failure
		   * still keeps it within the success percentage requested.
		   *
		   * @param result <code>ITestResult</code> containing information about the run test
		   * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
		   */
		  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		  
		  public  void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
		  }

		  public void onStart(ITestContext context) {
		    // not implemented
		  }

		 		  public void onFinish(ITestContext context) {
		    // not implemented
		  }

}
