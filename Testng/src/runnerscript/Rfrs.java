package runnerscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pomscripts.Rfrs_script;

public class Rfrs {
	@Test
	public void enterdata()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		Rfrs_script r = new Rfrs_script(driver);
		r.passdata();
		driver.navigate().refresh();
		r.passdata();
	}

}
