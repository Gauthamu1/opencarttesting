package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{

	
		public Homepage(WebDriver driver)
		{
			super(driver);
		}
		
@FindBy(xpath="//a[@aria-expanded='false']")
WebElement lnkaccount;
@FindBy(xpath="//a[normalize-space()='Register']")
WebElement login;

public void clickmyAccount()
{
	
	lnkaccount.click();
}
	
public void clickRegister()
{
	
	login.click();
}
	
}
