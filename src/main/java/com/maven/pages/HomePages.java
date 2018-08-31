package com.maven.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePages {

WebDriver driver1;
	
	@FindBy(xpath="//*[@id=\"menu-item-50\"]/a") 
	WebElement ButtonMyAccount;
	
	public HomePages(WebDriver driver)
	{
		this.driver1=driver;
	}
	
	public void clickOnMyAccountButton()
	{
		ButtonMyAccount.click();
	}
	
	public boolean verifyLaunchingOnRegistration()
	{
		 String expectedurl= driver1.getCurrentUrl();
		 String actualurl = "http://practice.automationtesting.in/my-account/";
		 
		 if(expectedurl.equalsIgnoreCase(actualurl))
		 {
			 return true;
		 }
		 
		 else
		 {
			 return false;
		 }
	}
}