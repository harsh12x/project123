package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {
 WebDriver driver;
 
 @Parameters("browser")
 @BeforeClass
	public void  launch(String browser) {
	
	if(browser.equalsIgnoreCase("Chrome")) {
		driver=new ChromeDriver();
		
	}
		
	else {	
		
		driver=new FirefoxDriver();
		
	}	
		
	
	
		
	}
 @Test
 public void setup() {
		driver.get("https://www.facebook.com/");
		
		}
	
	
	
	
}
