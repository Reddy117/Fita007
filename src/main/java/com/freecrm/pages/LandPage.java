package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class LandPage extends TestBase{

	@FindBy(name="username")
	public WebElement Unamex;
	
	@FindBy(name="password")
	public WebElement Pwordx;
	
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement Loginbtnx;
	
	
	public LandPage(){
		PageFactory.initElements(driver, this);
	}
	public String getLandPageTitle(){
		return driver.getTitle();
	}
	
	
	public HomePage  login(String uName,String Pword){
		
		Unamex.sendKeys(uName);
		Pwordx.sendKeys(Pword);
		Loginbtnx.click();
		return new HomePage();
  }
}
