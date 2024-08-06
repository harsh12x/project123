package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runningtest {
 WebDriver driver;
 Loginpage lpage;
 Homepage hpage;	
	
@BeforeMethod
 public void setup() {
 driver=new ChromeDriver();
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.manage().window().maximize();
 lpage=new Loginpage(driver);
 hpage=new Homepage(driver);
 
 }
 
 @Test
	public void testvalidation() throws InterruptedException {
    Thread.sleep(2000);
     lpage.enteruser("Admin");
     lpage.enterpass("admin123");
     lpage.clickonlogin();
     Thread.sleep(4000);
      String textreurn=hpage.gettext();
     Assert.assertEquals(textreurn, "Dashboard","problem");
     
	}
	
 
 @AfterMethod
 public void teardown() {
 
 driver.quit();
 
 }
 
	
}
