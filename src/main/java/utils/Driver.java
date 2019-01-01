package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.*;
import org.testng.*;
import utils.Configuration.browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import utils.BaseTest;
import utils.Configuration;


public class Driver {
public static WebDriver instance = null;
	
	//public static String Browsername =null;
	
	
  public static void initialize  () throws IOException
	{
	  
/* Properties prop = new Properties();
 FileInputStream FS =  new FileInputStream("C:\\Users\\kmath.ORADEV\\E2EProject\\src\\main\\java\\Utilities\\config.properties");
 prop.load(FS);*/
 //browser = prop.getProperty("browsername");
 //System.out.println("browser =" + browser );
 
 
 if ("chrome".equalsIgnoreCase(utils.Configuration.browser.Browsername))
	  {
	 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
	 ChromeOptions chromeOptions = new  ChromeOptions();
	//DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	 
	 chromeOptions.addArguments("--start-maximized");
	// capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
  //   driver=new WebDriver(capabilities);
	  instance =  new ChromeDriver ();
	 
	  }
 else if  ("FF".equalsIgnoreCase(utils.Configuration.browser.Browsername))
{
	 System.out.println("Firefox") ;
 }
 else {System.out.println("test123");
 }
 instance.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 instance.manage().window().maximize();
 

}
	public static void close(){
	instance.close();	
	System.out.print("Browser Closed");
	instance.quit();
	System.out.print("Browser Quit");
	}
	
	

}

 
 
		

