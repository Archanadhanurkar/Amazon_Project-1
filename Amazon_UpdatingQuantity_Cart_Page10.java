package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_UpdatingQuantity_Cart_Page10 {

	ChromeDriver driver;
	
	@FindBy(xpath="//a[.='Mobiles']")
	WebElement Mobile;
	
	@FindBy (xpath="//a[@aria-label='POCO m6']")
	WebElement Poco;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	WebElement Cart;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[29]")
	WebElement Proceed;
	
	@FindBy(id="ap_email")
	WebElement MobileNo;
	

	@FindBy(id="continue")
	WebElement Conti_botton;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement Sign_in;
	public void Product() throws InterruptedException
	{
		Mobile.click();
		Thread.sleep(5000);
	}
	public void Select()
	{
		Poco.click();
	}
	public void AddToCart() throws InterruptedException
	{
		Cart.click();
		Thread.sleep(3000);

	}
	public void ProceedToCart() throws InterruptedException
	{
		Proceed.click();
		Thread.sleep(3000);
	}
	public void MobNo()
	{
		MobileNo.sendKeys("7666405426");
	}
	public void Conti()
	{
		Conti_botton.click();
	}
	public void password()
	{
		password.sendKeys("123456");
	}
	public void Sign_In()
	{
		Sign_in.click();
	}
	
	
	
	
	
	
	public Amazon_UpdatingQuantity_Cart_Page10(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
