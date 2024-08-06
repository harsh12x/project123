package newpack;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NewTpart2 extends newtest1 {

	
  @Test(priority=3)
  public void checkurl() {
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  
  }
}
