package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import Base.Base_Class;
import Util.UtilClass;
import pages.MouseOver;
import pages.Progress_Bar;
import pages.VerifyText;

public class TC123 extends Base_Class {
	UtilClass util=new UtilClass();
	@Test
public void verifytext_method() throws InterruptedException, IOException {
		
	//driver_method_start();
		
		driver.get("http://uitestingplayground.com/verifytext");
		VerifyText txt=new VerifyText(driver);
		
		Thread.sleep(2000);
		String actualtext;
		
		String tempext="Welcome UserName!";
		boolean value;
		
		if(txt.verifytext_method().equalsIgnoreCase(tempext)) {
			value=true;
			test.log(LogStatus.PASS, test.addScreenCapture(util.capture(driver))+ "Test Passed");
		}
		else
		{
			value=false;
			test.log(LogStatus.FAIL, test.addScreenCapture(util.capture(driver))+ "Test Failed");
}
               
		Assert.assertTrue(value);
		
		//driver_method_close();
              
	}

@Test
	public void progressbar_method() throws InterruptedException, IOException {
		
		
	//driver_method_start();
	
			driver.get("http://uitestingplayground.com/progressbar");
		Progress_Bar pBar=new Progress_Bar(driver);
		pBar.start_click();
		Thread.sleep(2000);
		pBar.stopp_click();
		String val=pBar.progress_method();
		int val1=Integer.parseInt(val);
		startTest();
		boolean value;
		//testmethod("demo2");
		if(val1==75)
		{
			value=true;
			test.log(LogStatus.PASS, test.addScreenCapture(util.capture(driver))+ "Test Passed");
		}
		else
		{
			value=false;
			test.log(LogStatus.FAIL, test.addScreenCapture(util.capture(driver))+ "Test Failed");
		}
			//Assert.assertTrue(value);
		//endTest();;
				//driver_method_close();
		              
			}

@Test
	public void mouseover_method() throws InterruptedException, IOException {
		
	//driver_method_start();
	
	driver.get("http://uitestingplayground.com/mouseover");
	
		MouseOver m=new MouseOver(driver);
		m.clickme_method();
		m.clickme_method();
		int count=m.count_mentod();
		boolean value;
		System.out.println("count"+count);
		if(count==2)
		{
			System.out.println("pass");
			value=true;
			test.log(LogStatus.PASS, test.addScreenCapture(util.capture(driver))+ "Test Passed");
		}
		else
		{
			value=false;
			test.log(LogStatus.FAIL, test.addScreenCapture(util.capture(driver))+ "Test Failed");
		}
		Assert.assertTrue(value);
		System.out.println(m.count_mentod());
		//endTest();;

		//driver_method_close();
              
	}

}
