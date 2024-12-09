package framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Generic1 {
	public WebDriver driver;
	@BeforeClass
	public void open()
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		 driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/");
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("lavanya");
	     driver.findElement(By.id("pass")).sendKeys("Lucky@12");
	     driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterMethod
	public void ss() throws IOException
	{
		Genericscript.getPhoto(driver);
	}
	@AfterClass
	public void close()
	{
		driver.close();
	}
	
	

}
