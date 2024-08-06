package parallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {
	WebDriver driver;
	 
	 @Parameters("browser")
	 @BeforeClass
		public void  launch(String browser) {
		
		if(browser.equalsIgnoreCase("fire")) {
			driver=new FirefoxDriver();
			
		}
			
		else {	
			
			driver=new ChromeDriver();
			
		}	
			
		
		
}
	 @Test
	 public void setup() {
			driver.get("https://www.facebook.com/");
			
			}
	 }
