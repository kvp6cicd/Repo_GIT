package utils;

import java.io.FileInputStream;
import java.io.FileInputStream.*;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

	protected static  Driver driver; 
	public String browsername = null;
	
		public static Driver getDriver () 
		   {
		      return driver;
		   }
	}		   		   
		    



/*Properties prop = new Properties();
	FileInputStream fs = new FileInputStream("C:\\Users\\kmath.ORADEV\\E2EProject\\src\\main\\java\\Utilities\\config.properties");
	prop.load(fs);
	 String browser = prop.getProperty("browsername");
	 if (browser == "Chrome")
	 {
		ChromeOptions chromeOptions = new  ChromeOptions();
		 System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		 chromeOptions.addArguments("--start-maximized");
		 driver =  new ChromeDriver ();
		 return driver;	 
	 }
	 else if  (browser == "Firefox")
{
		 return driver; 
	 }
	 else {return driver;}
	
	}*/
		
		// TODO Auto-generated method stub

	


