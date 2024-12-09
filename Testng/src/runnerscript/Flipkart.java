package runnerscript;




import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import pomscripts.Fk;

public class Flipkart {
	@Test
	public void purchase() 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Fk f = new Fk(driver);
		f.item("Mobiles");
		f.item1(Keys.ENTER);
	String p_id =	driver.getWindowHandle();
	f.clk();
		Set<String> wh=	driver.getWindowHandles();
	for (String w : wh) {
		driver.switchTo().window(w);
	}

	
	}
}
		
		



