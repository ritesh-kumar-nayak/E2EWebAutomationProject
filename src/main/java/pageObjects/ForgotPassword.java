package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPassword {

	
	public WebDriver driver;
	
	//By email=By.cssSelector();
	@FindBy(css="[id='user_email']")
	WebElement email;
	
	//By sendMeInstructions=By.cssSelector();
	@FindBy(css="[type='submit']")
	WebElement sendMeInstructions;
		
	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver;
		
	}


	public WebElement getEmail()
	{
		return email;
	}
	
	public WebElement sendMeInstructions()
	{
		return sendMeInstructions;
	}
	
	

	
	
}
