package amazon_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Searchresult_Page06 {
	
	ChromeDriver driver;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[59]")
	WebElement Price_Filter;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[9]")
	WebElement Category;
	
	
	public void Filter_Price()
	{
		Price_Filter.click();
	}
	
	public void Shoe_Category()
	{
		Category.click();
	}
	
	
	public Amazon_Searchresult_Page06(ChromeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
