package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testprac {
  WebDriver driver;
	
  @BeforeClass
	public void declare() {
		driver=new ChromeDriver();
	
	}
     @BeforeMethod
	public void setup(){
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	}
	
     @Test (priority=1)
	public void login() {
	
		// sendKeys("");
	driver.findElement(By.name("email")).sendKeys("harshada.rajput853@gmail.com");
		
		//find the password ------classname
	
	driver.findElement(By.id("pass")).sendKeys("harshada@123");
           //login
	driver.findElement(By.name("login")).click();
	//expectation ====not login
	
String actualtext= driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
	
	String expectedtext="The email address you entered isn't connected to an account. Find your account and log in.";
	
	Assert.assertEquals(actualtext, expectedtext,"expected text is not visible");
	
	
	}
     
    @Test(priority=2)
     public void testcase2() {
     
    String actualurl= driver.getCurrentUrl();
    String expectedurl="https://www.facebook";	
    

	if(expectedurl.equals(actualurl)) {
	
		System.out.println("pass");
	}
	else {
		
		System.out.println("fail");
	}
    
    	 
     
     }
     
     
     
     
     
     
	
     @AfterClass
	public void teardown() {
		
		driver.quit();
		
	}
	
}
