package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseOver {
WebDriver driver;
	
	@FindBy(xpath="/html/body/section/div/div[1]/a")
	WebElement ClickMeLink;
	@FindBy(id="clickCount")
	WebElement count;
		
	//Constructor that will be automatically called as soon as the object of the class is created
	public MouseOver(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void clickme_method()
	{
		ClickMeLink.click();
	}
	
	public int count_mentod()
	{
		return Integer.parseInt(count.getText());
	}
}
