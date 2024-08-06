package first;

import org.testng.annotations.Test;

public class Test1 {
  @Test  (priority=2)  // testcase
  public void f() {
	  
	System.out.println("hii to f");  
	
  }
  
  
  @Test (priority=1)
  public void z() {
  
	  System.out.println("hii to z");
  
  
  }
  
  
  
}
