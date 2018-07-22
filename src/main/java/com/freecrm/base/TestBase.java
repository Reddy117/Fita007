package com.freecrm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.freecrm.util.Xls_Reader;

public class TestBase {
	public Xls_Reader xls=new  Xls_Reader();
	public static WebDriver driver;
	public FileInputStream f=null;
	public Properties p=null;
	
	public void openbrowser(String browser){
		if(browser.equals("ff"))
			driver=new FirefoxDriver();
		else if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "");
			driver=new  ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.freecrm.com/index.html");
	}
	
	public TestBase() {
		try{
			f=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\freecrm\\config\\config.properties");
			p=new Properties();
			p.load(f);
		}catch(Exception e){
			
		}
		
	}

}
