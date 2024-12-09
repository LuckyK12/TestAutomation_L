package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Click_hold {
	@Test
	
	public void cliho()throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		Thread.sleep(2000);
		 WebElement   ele = driver.findElement(By.id("circle"));
		 Actions act = new Actions(driver);
		act.clickAndHold(ele).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
