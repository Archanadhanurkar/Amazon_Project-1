package amazon_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import amazon_source.Amazon_cart_WithoutLogin15;
import amazon_source.Launch_Quit;

public class Testcase15_Amazon extends Launch_Quit
{
	@Test
	public void Cart_WithoutLogin ()
	{
		
		Amazon_cart_WithoutLogin15 w1 = new Amazon_cart_WithoutLogin15(driver);
		w1.Search();
		w1.find();
		w1.Adding_Cart();
		w1.Cart();
	}

}
 