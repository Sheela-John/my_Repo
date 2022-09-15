package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Progress_Bar {
WebDriver driver;
	
	@FindBy(id="startButton")
	WebElement startbtn;
	@FindBy(id="stopButton")
	WebElement stopbtn;
	@FindBy(id="progressBar")
	WebElement progressBar;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public Progress_Bar(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void start_click()
	{
		startbtn.click();
	}
	public void stopp_click()
	{
		stopbtn.click();
	}
	public String progress_method()
	{
		String value=progressBar.getText();
		String val[]=value.split("%");
		System.out.println(val[0]);
		return val[0];
	}
	
}
