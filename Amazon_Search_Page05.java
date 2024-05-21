package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search_Page05 {

	ChromeDriver driver;
	
	@FindBy(name="field-keywords")
	WebElement search_tf;
	
	@FindBy (id="nav-search-submit-button")
	WebElement Search_button;
	
	
	
	
	public void Pdt_search()
	{
		search_tf.sendKeys("shoe");
	}
	
	public void search()
	{
		Search_button.click();
	}
	
	
	
	public Amazon_Search_Page05(ChromeDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}
