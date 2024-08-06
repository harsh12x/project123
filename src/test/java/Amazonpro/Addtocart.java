package Amazonpro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListner.class)


public class Addtocart  extends login_functionalities{
 
	private WebElement searchbox;
	private WebElement product;
	private WebElement addtocart;
	private WebElement shoppingcart;
	
	public WebElement getSearchbox() {
		return driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	}
	public WebElement getProduct() {
		return driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div[1]/div/span/a"));
	}
	public WebElement getAddtocart() {
		return driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]"));
	}
	
	
	public WebElement getShoppingcart() {
		return driver.findElement(By.xpath("//*[@id=\"nav-cart\"]"));
	}
	@Test(priority=3)
	public void Addtocartfunction() {
		getSearchbox().sendKeys("Shoes");
		getSearchbox().sendKeys(Keys.ENTER);
		 getProduct().click();
		 //switch the tab
            Set<String> windowhandle=driver.getWindowHandles();
            Iterator<String> it=windowhandle.iterator();
            String mainwindow=it.next();
		    String childwindow=it.next(); 
		    driver.switchTo().window(childwindow);
		    
		    getAddtocart().click();
		 
		 String expectedresult="Added to Cart";
		 String actualresult=driver.findElement(By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]")).getText();
		 
		 
		 Assert.assertEquals(actualresult,expectedresult,"product not added" );
		 
	
	}
	
	
	
	@Test (priority=4)
	public void shoppingcart() {
	
		getShoppingcart().click();
		String priceofproduct=driver.findElement(By.xpath("//*[@id=\"sc-active-327f0c81-b056-4fec-9817-b9f7d180ec44\"]/div[4]/div/div[2]/ul/div[1]/div[1]/div/div/span")).getText();
		String priceofshopping=driver.findElement(By.xpath("//*[@id=\"sc-subtotal-amount-activecart\"]")).getText();
	
		if(priceofproduct.equals(priceofshopping)) {
		
		System.out.println("details are correct");	
		
		}
		else {
		
		System.out.println("check the subtotal");	
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
