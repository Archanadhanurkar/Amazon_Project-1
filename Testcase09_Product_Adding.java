package amazon_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazon_source.Amazon_Product_Page09;
import amazon_source.Launch_Quit;

public class Testcase09_Product_Adding extends Launch_Quit{
	@Test
	public void Adding_Product() throws InterruptedException
	{
		Amazon_Product_Page09 p = new Amazon_Product_Page09(driver);
		p.First_pdt();
		p.Second_pdt();
		
		Assert.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
	}
	
	
	

}
