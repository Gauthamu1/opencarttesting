package testbase;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;//log4js
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseclass {
	
	
		
public WebDriver driver;
public Logger logger;	
	@BeforeClass 
	public void testsetup()
	{
		logger =LogManager.getLogger(this.getClass());
		
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
