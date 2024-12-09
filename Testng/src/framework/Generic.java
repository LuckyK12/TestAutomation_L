package framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	@BeforeMethod
	public void openapp() {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	 driver= new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/login/");
	}
	@AfterMethod
	public void closeapp() throws IOException {
	Genericscript.getPhoto(driver);
		driver.close();	
	}

}
