package amazon_Test;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import amazon_source.Amazon_Home_Page04;

public class Testcase04_Home_Amazon {
	
	@Test
	public void Update_Location()
	{
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Amazon_Home_Page04 a4 =new Amazon_Home_Page04(driver);
		a4.Location();
		a4.Enter_Pincode();
		a4.Apply_button();		

}
}