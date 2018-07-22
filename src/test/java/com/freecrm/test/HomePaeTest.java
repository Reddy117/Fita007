package com.freecrm.test;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LandPage;

public class HomePaeTest extends TestBase{
	LandPage landpage=null;
	HomePage homepage=null;
	
	
	@BeforeMethod
	public void openApp(){
		openbrowser("ff");
		landpage=new LandPage();
		homepage=new HomePage();
	}
	
	@Test
	public void verifyHomepageUserame(){
		
		homepage=landpage.login("AnishG", "anishsaireddy8");
		String actUser=homepage.getHomeUserName();
		Assert.assertTrue(actUser.contains(p.getProperty("ActUName")));
	}
}
