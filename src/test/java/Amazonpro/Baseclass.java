package Amazonpro;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListner.class)
public class Baseclass {

 protected WebDriver driver;
public static org.apache.logging.log4j.Logger log= LogManager.getLogger(Baseclass.class);



public Baseclass() {
	
}



public WebDriver getDriver() {
     return driver;
 }

 @BeforeSuite
 public void declare() {
  //   System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Ensure the correct path to ChromeDriver
     driver = new ChromeDriver();
 }

 @BeforeMethod
 public void setup(){
	
     driver.get("https://www.amazon.in/");
     log.info("url strated");
     driver.manage().window().maximize();
     driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
     log.info("implicitlyWait present");
 }

	
	@AfterTest
	public void teardown() {
	
	driver.quit();
	
	
	
	}
	
	
}
