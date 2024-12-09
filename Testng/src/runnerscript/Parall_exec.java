package runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parall_exec {
	public WebDriver driver;
	@Parameters({"browsers"})
		@Test
	public void pexec(String browser)
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}
		else {
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			
		}
	}

}
