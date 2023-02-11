package com.ig.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ig.TestBase.TestBase;

public class LoginPage extends TestBase
{
	//Initialization.....
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Declaration...
	@FindBy(xpath="//input[@id='account_id']")
	private WebElement userName_txtbox;
	
	@FindBy(xpath="//input[starts-with(@id, 'nonEncry')]")
    private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='loginbutton']")
	private WebElement login_btn;
	
	//Action Methods.....
	
	public void enterUname()
	{
		userName_txtbox.sendKeys("Nikhil5555");
	}
	
	public void enterPassword()
	{
		password_txtbox.sendKeys("Nikhil@5555");
	}
	public void clickOnLoginBtn()
	{
		login_btn.click();
	}
	
	public String getUrl()
	{
	   String actual_url = driver.getCurrentUrl();
	   return actual_url;
		
	}
	
} 
