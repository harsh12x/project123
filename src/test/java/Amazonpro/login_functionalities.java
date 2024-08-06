package Amazonpro;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListner.class)
public class login_functionalities extends Baseclass {

	
	  private WebElement hellohover ;
	  private WebElement signin_button ;
	  private WebElement emailbox;
	  private WebElement continue_button;
	  private WebElement password;
	  private WebElement singin;
	  
public static org.apache.logging.log4j.Logger  log=LogManager.getLogger(login_functionalities.class);

	  
	  
	  
	  public WebElement getHellohover() { 
		  
		  return driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")); }
	  
	  public WebElement getSignin_button() { 
		  return driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a"));
	  
	  }
	  
	  
	  public WebElement getEmailbox() {
		  return driver.findElement(By.xpath("//input[@id='ap_email']")); }
	  
	  public WebElement getContinue_button() { 
		  return driver.findElement(By.xpath("//*[@id=\"continue\"]")); }
	  
	
	  
	  public WebElement getPassword() { 
		  return driver.findElement(By.xpath("//*[@id=\"ap_password\"]")); }
	  
	  
	  
	 public WebElement getSingin() { 
		 return driver.findElement(By.xpath("//*[@id='signInSubmit']")); }
	  
	 
	  @Test (priority=1)
	  public void login() { 
	   Actions act=new Actions(driver);
	   act.moveToElement(getHellohover()).perform(); 
	   log.info("Cliked on hello button");
	  getSignin_button().click();
	  log.info("Cliked on signin  button");
	  getEmailbox().sendKeys("9359994367");
	  getContinue_button().click();
	  getPassword().sendKeys("Harshada@123");
	  getSingin().click();
	  
	  }

	@Test(priority=2)
	public void lang() {
		// lan
		driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]")).click();
		log.info("cliked on lang button");
		// select radio button
		driver.findElement(By.cssSelector("#icp-language-settings > div:nth-child(6) > div > label > i")).click();
		log.info("selected radio button");
		// validate
		String expectedtext = "अनुवाद\n"
				+ "हम आपकी ब्राउज़िंग, खरीदारी और कम्युनिकेशन के लिए सबसे ज़रूरी जानकारी का अनुवाद करेंगे. हमारे अनुवाद आपकी सहूलियत के लिए प्रदान किए जाते हैं. हमारी उपयोग की शर्तों सहित Amazon.in का अंग्रेज़ी वर्जन ही अंतिम वर्जन है. और जानें";

		String actualtext = driver.findElement(By.xpath("//*[@id=\"icp-language-disclaimer\"]")).getText();

		Assert.assertEquals(actualtext, expectedtext);
		log.error("not matching");
	}

}
