package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ass {
	@Test
	public void veri()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("httpds://www.facebook.com/");
		String title = driver.getTitle();
		Assert.assertEquals(title,"Facebook");
		System.out.println("India");
	}

}

