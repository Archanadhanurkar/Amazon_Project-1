package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Payment_Page12 {

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
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	WebElement Full_Name;
	
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	WebElement Mobile_no ;
	
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	WebElement Pincode;
	
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	WebElement Flat_No;
	
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	WebElement Area;
	
	@FindBy(id="address-ui-widgets-landmark")
	WebElement LandMark;
	
	@FindBy(id="address-ui-widgets-use-as-my-default")
	WebElement Default_Address;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[4]")
	WebElement Use_Addreess;
	
	@FindBy(name="address-ui-widgets-saveOriginalOrSuggestedAddress")
	WebElement Save_Add;
	
	@FindBy(id="shipToThisAddressButton")
	WebElement Ship_Address ;
	
	@FindBy(xpath="//input[@class='a-button-input' and @aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	WebElement Use_This_Address ;
	
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
	public void Name()
	{
		Full_Name.sendKeys("Archana Ghate");
	}
	public void Mobile_num()
	{
		Mobile_no.sendKeys("7666405426");
	}
	public void pinCode()
	{
		Pincode.sendKeys("412207");
	}
	public void Address()
	{
		Flat_No.sendKeys("Flat No. B407, Neocity Phase 2");
	}
	public void Area_Street()
	{
		Area.sendKeys("Bakori Road, Wagholi.");
	}
	public void Landmark()
	{
		LandMark.sendKeys("Near JSPM college");
	}
	public void Checkbox()
	{
		Default_Address.click();
	}
	public void Use_Address()
	{
		Use_Addreess.click();
	}
	public void Save_Address() throws InterruptedException
	{
		Save_Add.click();
		Thread.sleep(8000);
	}
	public void Shipping_Address() throws InterruptedException
	{
		Ship_Address.click();
		Thread.sleep(3000);
	}
	public void Use_This_Add()
	{
		Use_This_Address.click();
	}
	
	
	
	
	
	
	public Amazon_Payment_Page12(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
}
