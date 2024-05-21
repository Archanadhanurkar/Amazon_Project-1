package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_cart_WithoutLogin15
{
	ChromeDriver driver;
	
	@FindBy(name="field-keywords")
	WebElement Search_tf;
	
	@FindBy (id="nav-search-submit-button")
	WebElement Search;
	
	@FindBy (id="a-autoid-3-announce")
	WebElement Add_To_Cart;
	
	@FindBy(xpath="(//a[@class='a-button-text'])[1]")
	WebElement Go_To_Cart;
	
	
	
	
	
	
	
	
	public void Search()
	{
		Search_tf.sendKeys("Headset");
	}
	public void find()
	{
		Search.click();
	}
	public void Adding_Cart()
	{
		Add_To_Cart.click();
	}
	public void Cart()
	{
		Go_To_Cart.click();
	}

	public Amazon_cart_WithoutLogin15(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
