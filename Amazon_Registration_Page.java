package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Registration_Page {
	ChromeDriver driver;
	
	
	
	@FindBy(id="ap_customer_name")
	WebElement name_tf;
	
	@FindBy (id="ap_phone_number")
	WebElement Mob_num;
	
	@FindBy (id="ap_password")
	WebElement password;
	
	@FindBy (id="continue")
	WebElement verify_num;

	
	
	public void cust_name()
	{
		name_tf.sendKeys("Archana Ghate");
	}
	
	public void mobileNo()
	{
		Mob_num.sendKeys("7666405426");
	}
	
	public void passwd()
	{
		password.sendKeys("123456");
	}
	
	public void Continue()
	{
		verify_num.click();
	}
	
	public Amazon_Registration_Page(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}
