package com.freecrm.test;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.freecrm.base.TestBase;
import com.freecrm.pages.ContactPage;
import com.freecrm.pages.HomePage;
import com.freecrm.pages.LandPage;
import com.freecrm.util.TestUtil;

public class ContactPageTest extends TestBase{

	LandPage landpage=null;
	HomePage homepage=null;
	ContactPage contactpage=null;
	
	
	@BeforeMethod
	public void openApp(){
		openbrowser("ff");
		landpage=new LandPage();
		homepage=new HomePage();
		contactpage=new ContactPage();
	}
	
	@Test(dataProvider="getcreateContactAndVerifydata")
	public void createContactAndVerify(Hashtable<String,String> table) throws InterruptedException{
		System.out.println(table.get("Cfname"));
		homepage=landpage.login(p.getProperty("LUserName"), p.getProperty("Lpassword"));
		
		contactpage=homepage.clickNewContact();
		contactpage.createNewContactt(table.get("Cfname"), table.get("Clname"));
	}
	
	@DataProvider
	public Object[][] getcreateContactAndVerifydata() throws IOException{
		return TestUtil.getData("createContactAndVerify", "Sheet1", xls);
	}
}
