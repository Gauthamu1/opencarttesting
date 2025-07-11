package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.accountregisrtationpage;
import testbase.baseclass;

public class Testcase1 extends baseclass{

	public WebDriver driver;
		
	
	@Test
	public void verify_account_details()
	{
		Homepage hp = new Homepage(driver);
		hp.clickmyAccount();
		hp.clickRegister();
		
		accountregisrtationpage arp= new accountregisrtationpage(driver);
		arp.firstname("gautham");
		arp.lastname("utti");
		arp.Emailid("gauthamutti@gmail.com");
		arp.password("abcd");
		
	}
	public String randomString()
	{
		String randomstring=RandomStringUtils.randomAlphabetic(5);
		return randomstring;
	}
	public String randomNumber()
	{
		String genratenos=RandomStringUtils.randomNumeric(5);
		return genratenos;
	}

	public String randomAlphaNumeric()
	{
		String Alphanum=RandomStringUtils.randomAlphanumeric(5);
		return Alphanum;
	}
}
