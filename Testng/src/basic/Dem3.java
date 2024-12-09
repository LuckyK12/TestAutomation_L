package basic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dem3 {
	@Test
	public void test1() {
		Reporter.log("hello", true);
		}
	@Test
	public void test2() {
		Reporter.log("bye", true);
		}
//	@Test(invocationCount = 4)
//	public void hello3() {
//		Reporter.log("hi", true);
//	}
//	@Test(priority = 2)
//	public void test4() {
//		Reporter.log("bye", true);
//		}
//	@Test(enabled = false)
//	public void test5() {
//		Reporter.log("bye", true);
//		}
	@Test(dependsOnMethods = "test2")
	public void test6() {
		Reporter.log("hi", true);
		Assert.fail();
		}
	@Test(dependsOnMethods = "test6")
	public void test7() {
		Reporter.log("bye", true);
	}
	
	
	
	
	

}
