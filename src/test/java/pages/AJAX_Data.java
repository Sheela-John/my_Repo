package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AJAX_Data {
WebDriver driver;
	
	@FindBy(id="ajaxButton")
	WebElement ajaxbtn;
	@FindBy(id="content")
	WebElement content;
		
	//Constructor that will be automatically called as soon as the object of the class is created
	public AJAX_Data(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void clickajax()
	{
		ajaxbtn.click();
	}
	
	public String Display ()
	{
		return content.getText();
	}
}
