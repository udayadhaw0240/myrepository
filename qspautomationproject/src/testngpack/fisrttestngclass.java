package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class fisrttestngclass {
  @Test
  public void method1() 
  {
   Reporter.log("method1 executed",true);
  }
  
  @Test
  public void method2() 
  {
   Reporter.log("method2 executed",true);
  }
  
  @Test
  public void method3() 
  {
   Reporter.log("method3 executed",true);
  }
  
  @Test
  public void method4() 
  {
	  int i=0;
	  int res=9/i;
	  System.out.println(res);
   Reporter.log("method4 executed",true);
  }
  
  @Test
  public void method5() 
  {
   Reporter.log("method5 executed",true);
  }
}
