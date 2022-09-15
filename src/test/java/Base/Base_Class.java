package Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Base_Class {
	
	public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest test;
    
	@BeforeSuite
	public void startTest()
	{
	report = new ExtentReports(System.getProperty("user.dir")+"/test-output/ExtentReportResults.html");
	test = report.startTest("Demo");
	}
	
	 @BeforeTest
	public void driver_method_start() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().driverVersion("105.0.5195.102").setup();
		driver = new ChromeDriver();
		
        String baseUrl = "http://uitestingplayground.com/";
        
        driver.get(baseUrl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
	}	
	
	@AfterTest
	public void driver_method_close()
	{
		 driver.quit();
	}
	
	@AfterSuite
    public void tearDown()
    {
        report.flush();
    }
	
}
