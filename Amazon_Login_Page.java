package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page {
	
	ChromeDriver driver;
	
	@FindBy(xpath="//span[@class='nav-icon nav-arrow']")
	WebElement Sign_In;
	
	@FindBy(name="email")
	WebElement Mobile_num;
	
	@FindBy(id="continue")
	WebElement conti_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement SignIn_Button;
	
	
	public void MobNo()
	{
		Mobile_num.sendKeys("7666405426");
	}
	public void Conti()
	{
		conti_button.click();
	}
	public void Pass()
	{
		password.sendKeys("123456");
	}
	public void SignInSubmit()
	{
		SignIn_Button.click();
	}

	public Amazon_Login_Page(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
