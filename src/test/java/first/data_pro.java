package first;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class data_pro {
 WebDriver driver;
	
	@BeforeClass
	public void loader() {
	driver=new ChromeDriver();	
		
	}
	
	@Parameters ("url")
	@BeforeMethod
	public void setup(String url) {
	driver.get(url);//time
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider="logindata")
	public void login(String username,String password) {
	

		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	
  }
	
	
	
	
	@DataProvider(name="logindata")
	public Object[][] data() {
	
	Object [][] datapro=new Object [2][2];
	
	datapro[0][0]="jhanvi";
	datapro[0][1]="jhanvi@1233";
		
	datapro[1][0]="Rudra";
	datapro[1][1]="Rudra@1233";
		
	return datapro;
	
	}
	
	}
	
	
	
	
	
	
	
	

