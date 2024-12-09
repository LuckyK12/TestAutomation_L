package basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(invocationCount = 5)
	public void test1()
	{
		Reporter.log("hello", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("world", true);
	}
	
	

}
