package com.medicare.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends TestBase{
	
	@FindBy(xpath="//input[@id='name']")
	WebElement registername;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement registeremail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement registerpassword;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement registerBtn;
	
	@FindBy(xpath="/html/body/div[2]/div/p[3]")
	WebElement userText;
	
	Actions actions = new Actions(driver);
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void register_user()
	{
		registername.sendKeys("Sasidhar");
		registeremail.sendKeys("sasi@medicare.com");
		registerpassword.sendKeys("12345");
		actions.moveToElement(registerBtn).click();
//		registerBtn.click();
	}
	
	public String validate_registration_URL()
	{
		String register_url = driver.getCurrentUrl();
		return register_url;
	}
	
	public String validate_registration_Text()
	{
		String user_name = userText.getText();
		return user_name;
	}
	
	
	
	
	
	
	
	
	
	

}