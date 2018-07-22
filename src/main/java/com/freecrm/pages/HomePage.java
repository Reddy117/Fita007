package com.freecrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freecrm.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//td[contains(text(),'User:')]")
	public WebElement HUserName;
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/a")
	public WebElement contactLinkx;
	
	
	@FindBy(xpath="//*[@id='navmenu']/ul/li[4]/ul/li[1]/a")
	public WebElement newContactLinkx;
	

	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String  getHomeUserName(){
		driver.switchTo().frame("mainpanel");
		return  HUserName.getText();
	}
	
	public void clickContact(){
		driver.switchTo().frame("mainpanel");
		contactLinkx.click();
		driver.switchTo().defaultContent();
	}
	
	public ContactPage clickNewContact(){
		driver.switchTo().frame("mainpanel");
		Actions a=new Actions(driver);
		a.moveToElement(contactLinkx).build().perform();
		newContactLinkx.click();
		driver.switchTo().defaultContent();
		return new ContactPage();
	}

}
