package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class ContactPage extends TestBase{
	
	@FindBy(xpath="//*[@id='first_name']")
	public WebElement FNamex;  
	
	@FindBy(xpath="//*[@id='surname']")
	public WebElement SNamex; 
	
	@FindBy(xpath="//input[@value='Save']")
	public WebElement SaveBtnx; 
	
	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void createNewContactt(String fName,String sName) throws InterruptedException{
		Thread.sleep(10000);
		driver.switchTo().frame("mainpanel");
		FNamex.sendKeys(fName);
		SNamex.sendKeys(sName);
		SaveBtnx.click();
		driver.switchTo().defaultContent();
	}
	
	
	

}
