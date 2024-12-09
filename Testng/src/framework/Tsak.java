package framework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tsak extends Generic1 {
	@Test
	public void act()
	{
		driver.findElement(By.xpath("//a[.='Try Again']")).click();
		driver.findElement(By.id("identify_email")).sendKeys("kdmbllvn@gmail.com");
		driver.findElement(By.id("did_submit")).click();
	}

}
