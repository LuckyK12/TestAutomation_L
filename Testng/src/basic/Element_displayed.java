package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Element_displayed {
	@Test
	public void test3() throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
WebElement ele =	driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
if(ele.isDisplayed())
{
	Reporter.log("displayed",true);
}
else {
	  Reporter.log("notdisplayed", false);
}
	}
}
