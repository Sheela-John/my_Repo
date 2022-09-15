package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyText {
WebDriver driver;
	
	@FindBy(xpath="/html/body/section/div/div[4]/span")
	WebElement text;
	//Constructor that will be automatically called as soon as the object of the class is created
	public VerifyText(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	//Locator for login button
	//By LoginBtn = By.id("login");
	
	//Method to click login button
	public String verifytext_method()  {
		
			System.out.println(text.getText());
		return text.getText();
	}
}
