package amazon_Test;

import org.testng.annotations.Test;

import amazon_source.Amazon_Coupons_Page13;
import amazon_source.Launch_Quit;

public class Testcase13_Coupon extends Launch_Quit{
	@Test
	public void Coupons() throws InterruptedException
	{
		Amazon_Coupons_Page13 cp = new Amazon_Coupons_Page13(driver);
		cp.Deal();
		cp.Coupons();cp.All_Coupons();
		cp.collect_coupon();
		cp.clip_coupon();
		cp.Mob_no();
		cp.Password();
		cp.SignIn();
		cp.Cart();
		
	}

}
