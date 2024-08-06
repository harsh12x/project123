package parallelTest;

import org.testng.annotations.Test;

public class Test3 {
	 @Test
	  public void method1() {
		  
		System.out.println("Hii from Test3 method1: "+ Thread.currentThread().getId()); // this will help me to see the id 
	  }
	  
	  @Test
	  public void method2() {
			System.out.println("Hii from Test3 method2: "+ Thread.currentThread().getId());
	  }
	  @Test
	  public void method3() {
			System.out.println("Hii from Test3 method3: "+ Thread.currentThread().getId());
	  }
	  
}
