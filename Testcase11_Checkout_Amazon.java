package amazon_Test;

import org.testng.annotations.Test;

import amazon_source.Amazon_CheckOut_Page11;
import amazon_source.Launch_Quit;

public class Testcase11_Checkout_Amazon extends Launch_Quit{
	@Test
	public void CheckOut() throws InterruptedException
	{
		Amazon_CheckOut_Page11 k1 = new Amazon_CheckOut_Page11(driver);
		k1.Product();
		k1.Select();
		k1.AddToCart();
		k1.ProceedToCart();
		k1.MobNo();
		k1.Conti();
		k1.password();
		k1.Sign_In();
		k1.Name();
		k1.Mobile_num();
		k1.pinCode();
		k1.Address();
		k1.Area_Street();
		k1.Landmark();
		k1.Checkbox();
		k1.Use_Address();
		k1.Save_Address();
	



	

	}

}
