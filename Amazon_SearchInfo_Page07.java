package amazon_source;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchInfo_Page07 {
	
	ChromeDriver driver;
	
	@FindBy(name="field-keywords")
	WebElement search_tf;
	
	@FindBy (id="nav-search-submit-button")
	WebElement Search_button;
	
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[3]")
	WebElement Product;
	
	@FindBy (xpath="input[@id='add-to-cart-button")
	WebElement Add_to_Cart;
	
	@FindBy (xpath="(//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom'])[1]")
	WebElement Product_Rating;
	
	
	public void Pdt_search()
	{
		search_tf.sendKeys("shoe");
	}
	
	public void search()
	{
		Search_button.click();
	}
	
	public void click()
	{
		Product.click();
	}
	public void AddingToCart()
	{
		Add_to_Cart.click();
		
		Set<String> ParentChild = driver.getWindowHandles();
		Iterator<String> i = ParentChild.iterator();
		String Parent = i.next();
		String Child = i.next();
		
	}
	
	public void Rating_IsDisplayed()
	{
		Product_Rating.isDisplayed();
	}
	
	
	
	public Amazon_SearchInfo_Page07(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
