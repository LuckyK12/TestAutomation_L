package framework;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Rs extends Generic {
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("lavanya");
	     driver.findElement(By.id("pass")).sendKeys("Lucky@12");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	     System.out.println(driver.getTitle());
	}
//	@Test
//	public void login1()
//	{
//		driver.findElement(By.id("email")).sendKeys("lavanya");
//	     driver.findElement(By.id("pass")).sendKeys("Lucky@12");
//	     driver.findElement(By.xpath("//button[@type='submit']")).click();
//	     System.out.println(driver.getTitle());
//	}
	

}
