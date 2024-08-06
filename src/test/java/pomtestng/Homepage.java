package pomtestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Homepage {
   WebDriver driver;
   
   @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]")
   WebElement text;
	
	public Homepage(WebDriver driver) {
	
	this.driver=driver;
	  PageFactory.initElements(driver, this);
	
	}
	
	public  String  gettext() {
	 return text.getText();
		
	}
	
}
