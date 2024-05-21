package amazon_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon_source.Amazon_Searchresult_Page06;

public class Testcase06_PriceCategory_Amazon {
	
	@Test
	public void Price_Category_Filter()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=shoe&ref=nb_sb_noss");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Amazon_Searchresult_Page06 s2 = new Amazon_Searchresult_Page06(driver);
		
		s2.Shoe_Category();
		s2.Filter_Price();
	}

}
