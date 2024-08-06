package proppertiespom.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Manager {
 
private WebDriver driver;	
private Properties properties;	
	
public  WebDriver  intialized() throws IOException {	

	properties=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Propractice\\src\\test\\resources\\config.properties");
	properties.load(fis);
	  
	driver=new ChromeDriver();
     driver.manage().window().maximize(); 
       return driver;

}



   public String geturl() {

    return  properties.getProperty("url") ;
   }


   public String getusername() {

	    return  properties.getProperty("username") ;
	   }

   
   public String getpassword() {

	    return  properties.getProperty("password") ;
	   }

   
   
   
   
   
   
   
   
   
   
   
   



	
	
}
