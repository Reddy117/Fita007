package com.freecrm.test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.LandPage;

public class LandPageTest extends  TestBase{
	LandPage landpage=null;
	
	@BeforeMethod
	public void openApp(){
		openbrowser("ff");
		landpage=new LandPage();
	}
	
	@Test
	public void verifyHomePageTitle(){
		String actTitle=landpage.getLandPageTitle();
		//Assert.assertEquals(, actTitle);
	}
	
	

}
