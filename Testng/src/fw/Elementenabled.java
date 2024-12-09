package fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Elementenabled {
	@Test

	public void eleena() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
	WebElement ele =	driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
	Boolean b = ele.isEnabled();
	if(b)
	{
		   Reporter.log("enabled", true);
	}
	else {
		Reporter.log("notenabled", true);
	}

	}

}
