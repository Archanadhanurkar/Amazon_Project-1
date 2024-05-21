package amazon_Test;

import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import amazon_source.Amazon_SearchInfo_Page07;
import amazon_source.Launch_Quit;
import junit.framework.Assert;

public class Testcase07_InfoDisplay extends Launch_Quit {
	
	@Test
	public void Product_Details()
	{
		Amazon_SearchInfo_Page07 i1 = new Amazon_SearchInfo_Page07(driver);
		i1.Pdt_search();
		i1.search();
		i1.click();
		
		
		i1.AddingToCart();
		i1.Rating_IsDisplayed();
		
	    
		

	}

}
