package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Coupons_Page13 {

	ChromeDriver driver;
	
	@FindBy(xpath="//a[@href='/deals?ref_=nav_cs_gb']")
	WebElement Todays_Deal ;
	
	@FindBy(xpath="//a[@href=\"/amazon-coupons/b/?ie=UTF8&node=10465704031&ref_=sv_gb_4\"]")
	WebElement Coupons ;
	
	@FindBy(xpath="//a[@aria-label='View all coupons']")
	WebElement View_All_Coupons ;
	
	@FindBy(xpath="//input[@aria-labelledby='clip-button-B0CJ7WWVNS-announce']")
	WebElement Collect_coupon;
	
	@FindBy(id="clipCouponBtn")
	WebElement ClipCoupon ;
	
	@FindBy(id="ap_email")
	WebElement email; 
	
	@FindBy(id="ap_password")
	WebElement pass; 
	
	@FindBy(id="signInSubmit")
	WebElement signIn; 
	
	@FindBy(xpath="//a[@href='/cart?ref_=ewc_gtc']")
	WebElement Go_to_cart;
	
	public void Deal()
	{
		Todays_Deal.click();
	}
	public void Coupons()
	{
		Coupons.click();
	}
	public void All_Coupons()
	{
		View_All_Coupons.click();
	}
	public void collect_coupon() throws InterruptedException
	{
		Collect_coupon.click();
		
	}
	public void clip_coupon()
	{
		ClipCoupon.click();
	}
	public void Mob_no()
	{
		email.sendKeys("7666405426");
	}
	public void Password()
	{
		pass.sendKeys("123456");
	}
	public void SignIn()
	{
		signIn.click();
	}
	public void Cart()
	{
		Go_to_cart.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Amazon_Coupons_Page13(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
