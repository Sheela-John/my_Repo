package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
public class SampleApp {

	
	WebDriver driver;
	
	@FindBy(name="UserName")
	WebElement uName;
	@FindBy(name="Password")
	WebElement pswd;
	@FindBy(id="login")
	WebElement loginBtn;
	@FindBy(id="loginstatus")
	WebElement loginstatus;
	//Constructor that will be automatically called as soon as the object of the class is created
	public SampleApp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);	
          
	}
	
	
	
	

	public void enterUsername(String user) {
	
		//driver.findElement(uName).sendKeys(user);
		uName.sendKeys(user);
	}

	//Method to enter password
	
	public void enterPassword(String pass) {
		//driver.findElement(pswd).sendKeys(pass);
		pswd.sendKeys(pass);
	}
	
	//Method to click on Login button
	
	public void clickLogin() throws InterruptedException {
		
		Thread.sleep(3000);
		loginBtn.click();
		}
	public String WelcomeMethod()
	{
		return loginstatus.getText();
	}
}