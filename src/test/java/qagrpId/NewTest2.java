package qagrpId;

import org.testng.annotations.Test;
import Utilities.Configuration;
import Utilities.Driver;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.logging.*;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.asserts.*;

public class NewTest2 {
  @Test
  public void f() {
	  Driver.instance.navigate().to(Configuration.url.appurl);
	  Driver.instance.findElement(By.xpath("//*[@id='homewrapper']/div[5]/a[1]/div/u")).click();
	  Driver.instance.findElement(By.cssSelector("input[name='login']")).sendKeys("sel_1");
	  Driver.instance.findElement(By.cssSelector("input[name='passwd']")).sendKeys("sel_1");
	Assert.assertTrue(Driver.instance.findElement(By.cssSelector("input[name='login']")).isDisplayed(), "Login USername field is displayed");
	Assert.assertTrue(Driver.instance.findElement(By.cssSelector("input[name='passwd']")).isDisplayed(), "Login USername field is displayed");
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  Driver.initialize();
  }

  @AfterTest
  public void closenquit() {
	  Driver.instance.close();
	  Driver.instance.quit(); 
	  
  }

}
