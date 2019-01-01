package qagrpId;

import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;


import Utilities.BaseTest;
import Utilities.Driver;
import Utilities.Configuration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.List;

import org.testng.annotations.AfterTest;


public class NewTest1 {
  
@Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeTest
  public void beforeTest() throws IOException {

	Driver.initialize();
	
  }
  
  @Test
   public void search() throws IOException 
   {
	Driver.instance.navigate().to(Configuration.url.appurl);
	System.out.println("URL = " + Driver.instance.getCurrentUrl());
	//Driver.instance.findElement(By.cssSelector("input[type='text']")).sendKeys("test");
	List<WebElement> lnks = Driver.instance.findElements(By.tagName("a"));
	System.out.println("Total links = " + lnks.size());
	/*for (int i=0; i<lnks.size();i++)
	{
	System.out.println(lnks.get(i).getText());
   }*/
   }
//  @AfterTest
  public void closenquit() {
	  Driver.instance.close();
	  Driver.instance.quit(); 
  }
  
  

}
