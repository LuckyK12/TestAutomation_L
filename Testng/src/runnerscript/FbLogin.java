package runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pomscripts.Fb_login;



public class FbLogin {
	@Test
	public void log ()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Fb_login f=new Fb_login(driver);
		f.entermail("kdmbllvn@gmail.com");
		f.enterpwd("Lucky@121");
		f.enter();
		driver.close();
		
		
	}

}
