package com.regression.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.maven.pages.HomePages;
import com.maven.pages.LoginPage;
import com.maven.utility.BrowserFactory;

public class VerifyAutomationTesting {
	
	@Test
	public void verifyRegister()
	{
		WebDriver driver=BrowserFactory.startBrowser("Chrome", "http://practice.automationtesting.in/");
		HomePages home_page=PageFactory.initElements(driver, HomePages.class);
		home_page.clickOnMyAccountButton();
		
		LoginPage login_page=PageFactory.initElements(driver, LoginPage.class);
		login_page.loginToAutomation("kiran.bhuw.sharma@gmail.com", "kiranbhuwsharma");
		login_page.verifyLoginPage();
		
	}

}

