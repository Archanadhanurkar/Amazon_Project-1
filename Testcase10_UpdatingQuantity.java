package amazon_Test;

import org.testng.annotations.Test;

import amazon_source.Amazon_UpdatingQuantity_Cart_Page10;
import amazon_source.Launch_Quit;

public class Testcase10_UpdatingQuantity extends Launch_Quit{

	@Test
	public void Updating_Quantity() throws InterruptedException {
	Amazon_UpdatingQuantity_Cart_Page10 u1=new Amazon_UpdatingQuantity_Cart_Page10(driver);
	u1.Product();
	u1.Select();
	u1.AddToCart();
	u1.ProceedToCart();
	u1.MobNo();
	u1.Conti();
	u1.password();
	u1.Sign_In();
	
	
	}
	
}
