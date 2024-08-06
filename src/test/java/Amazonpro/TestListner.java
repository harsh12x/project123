package Amazonpro;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestListner implements ITestListener{

	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Suceffully completed: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		WebDriver driver=new ChromeDriver();
		Date obj=new Date();
		String date=obj.toString().replace(" ", "-").replace(":","-");
		  // how to take screenshot in selenium ------getScreenshotAs() File
		  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try {
			Files.copy(f, new File("C:\\Users\\Lenovo\\eclipse-workspace\\Propractice\\screenshot\\"+date+".jpg" ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		
		
		
		
		System.out.println("Take screenshot: "+result.getName());
	}
	@Override
	public void onStart(ITestContext context) {
		System.out.println("started with method: "+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished with method: "+ context.getName());
	}
  
	
	
	
	
	
	
	
}
