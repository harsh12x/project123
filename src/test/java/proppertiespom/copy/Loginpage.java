package proppertiespom.copy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Loginpage {
 WebDriver driver;
 
 @FindBy(xpath="//*[@placeholder='Username']")
 WebElement userbox;	
 @FindBy(xpath="//*[@placeholder='Password']")	
 WebElement passwordbox;	
 @FindBy(xpath="//*[@type='submit']")			
 WebElement loginbutton;	
	
	public Loginpage(WebDriver driver) {
      this.driver=driver;
       PageFactory.initElements(driver, this);
 
	}
	
	public void enteruser(String name) {
         userbox.sendKeys(name);
 
	}
 
	public void enterpass(String pass) {
		passwordbox.sendKeys(pass);
		 
	}
	
	public void clickonlogin() {
		loginbutton.click();
		 
	}
 
	
	
	
}
