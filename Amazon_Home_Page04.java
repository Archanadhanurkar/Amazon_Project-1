package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page04 {

	ChromeDriver driver;
	
	@FindBy(id="glow-ingress-line2")
	WebElement Update_Location;
	
	@FindBy(id="GLUXZipUpdateInput")
	WebElement Pincode;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[3]")
	WebElement Apply;
	
	
	
	
	
	public void Location()
	{
		Update_Location.click();
	}
	
	public void Enter_Pincode()
	{
		Pincode.sendKeys("412207");
	}
	public void Apply_button() 
	{
		Apply.click();
	}
	
	public Amazon_Home_Page04(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
