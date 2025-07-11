package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;	

public class accountregisrtationpage extends Basepage {

	public accountregisrtationpage(WebDriver driver) 
	{
		
		super(driver);
		
	}
	
@FindBy(xpath="//input[@id='input-firstname']")
WebElement txtname;

@FindBy(xpath="//input[@id='input-lastname']")
WebElement txtlast;

@FindBy(xpath="//input[@id='input-email']")
WebElement txtemail;

@FindBy(xpath="//input[@id='input-password']")
WebElement txtpass;

@FindBy(xpath="//button[@type='submit']")
WebElement txtsubmit;

@FindBy(xpath="//input[@name='agree']")
WebElement txtagree;
	
public void firstname(String fname) 
{
	txtname.sendKeys(fname);
}
public void lastname(String lname)
{
	txtlast.sendKeys(lname);
}
public void Emailid(String email)
{
	txtemail.sendKeys(email);
}
public void password(String pwd)
{
	txtpass.sendKeys(pwd);
}


//public String getConfirmationMsg()
//{
//	try {
	//	return (msgconfirmation.getText());
//	}catch(Exception e){
//       return(e.getMessage());
  		//}






}