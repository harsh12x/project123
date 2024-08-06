package pomtestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Data {
	
WebDriver driver;	
public void data() {

driver.findElement(By.xpath("//*[@placeholder='Username']"));
driver.findElement(By.xpath("//*[@placeholder='Password']"));
driver.findElement(By.xpath("//*[@type='submit']"));	
	
	
}
	
}

