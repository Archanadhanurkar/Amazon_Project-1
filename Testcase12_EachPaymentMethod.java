package amazon_Test;

import org.testng.annotations.Test;

import amazon_source.Amazon_CheckOut_Page11;
import amazon_source.Amazon_Payment_Page12;
import amazon_source.Launch_Quit;

public class Testcase12_EachPaymentMethod extends Launch_Quit {
	
	@Test
	public void payment() throws InterruptedException {
	Amazon_Payment_Page12 p1 = new Amazon_Payment_Page12(driver);
	p1.Product();
	p1.Select();
	p1.AddToCart();
	p1.ProceedToCart();
	p1.MobNo();
	p1.Conti();
	p1.password();
	p1.Sign_In();
	p1.Name();
	p1.Mobile_num();
	p1.pinCode();
	p1.Address();
	p1.Area_Street();
	p1.Landmark();
	p1.Checkbox();
	p1.Use_Address();
	p1.Save_Address();p1.Shipping_Address();
	p1.Use_This_Add();

}
}