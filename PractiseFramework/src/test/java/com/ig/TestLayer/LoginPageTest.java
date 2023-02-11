package com.ig.TestLayer;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.ig.TestBase.TestBase;
import com.ig.pageLayer.LoginPage;

public class LoginPageTest extends TestBase 
{
	@Test
  public void verifyLoginPage()
  {
		
	  LoginPage login = new LoginPage();
	  login.enterUname();
	  login.enterPassword();
	  login.clickOnLoginBtn();
	  String actual = login.getUrl();
	  
	  String Expected_url = "https://www.ig.com/ie/login";
	  
	  Assert.assertEquals(actual, Expected_url);
	  
	  
			  
  }
 
}
