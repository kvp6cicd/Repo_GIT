package qagrpId;

import org.openqa.selenium.*;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.*;

import utils.BaseTest;
import utils.Configuration;
import utils.Driver;


public class NewTest3 {
	//Verify getting a column value from a table
  @Test
  public void getValuefromtable() {
	  Driver.instance.navigate().to(Configuration.url.appurl);
	List tab1 = Driver.instance.findElements(By.xpath("table[@id=':2t']"));
	
	int nrows = tab1.size();
	
	/*for (int i=0; i<nrows; i++)
	{
		String value  = tab1.get(i).getClass().getField(name)
	}*/
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
