package newpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newtest1 {
  WebDriver driver;
	
@BeforeTest
	public void setup() {
	     driver=new ChromeDriver();
	     driver.manage().window().maximize();
	
	}

@BeforeMethod
     public void url() {

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

     }
	@Test (priority=1)
	public void login() {
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	driver.findElement(By.cssSelector("#app > div.orangehrm-login-layout > div > div.orangehrm-login-container > div > div.orangehrm-login-slot > div.orangehrm-login-form > form > div.oxd-form-actions.orangehrm-login-action > button")).click();
	
	}
	@Test (priority=2)
	public void title() {
	
	
	System.out.println(driver.getTitle());
	
	
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
