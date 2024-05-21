package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page09 {
	
	ChromeDriver driver;
	
	@FindBy(xpath="//a[@href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")
	WebElement Mobiles;
	
	@FindBy(xpath="(//div[@class='bxc-grid__image   bxc-grid__image--light bxc-grid__image--beauty bxc-grid__image--beauty'])[5]")
	WebElement FirstMob;
	
	@FindBy (xpath="(//input[@name='submit.add-to-cart'])[2]")
	WebElement AddCart;
	
	@FindBy(xpath="//a[@id='attach-close_sideSheet-link']")
	WebElement Close;
	
	@FindBy(xpath="//a[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")
	WebElement Electronics;
	
	@FindBy(xpath="(//span[.='Laptops'])[1]")
	WebElement Laptop;
	
	@FindBy(xpath="//img[@alt='Dell 14 Laptop']")
	WebElement Dell;
	
	@FindBy(xpath="(//input[@id='add-to-cart-button'])[2]")
	WebElement AddToCart;
	
	@FindBy(id="attach-close_sideSheet-link")
	WebElement close;
	
	@FindBy(xpath=" ( //span[.='    Cart   '])[2]  ")
	WebElement Cart;
	
	public void First_pdt() throws InterruptedException
	{
		Mobiles.click();
		FirstMob.click();
		Thread.sleep(3000);
		AddCart.click();
		Thread.sleep(3000);
		Close.click();
		Thread.sleep(3000);

	}
	
	public void Second_pdt()
	{
		Electronics.click();
		Laptop.click();
		Dell.click();
		AddToCart.click();
		Cart.click();
		
		
		
	}
	
	
	
	public Amazon_Product_Page09(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
