package amazon_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import amazon_source.Amazon_Search_Page05;

public class Testcase05_Search_Amazon {

	@Test
	public void Product_Search()
	{
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_Search_Page05 s1 =new Amazon_Search_Page05(driver);
		
		s1.Pdt_search();
		s1.search();
	}
}
