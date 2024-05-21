package amazon_source;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Launch_Quit {
	 protected ChromeDriver driver;
	
	@BeforeMethod
	public void Pre_condition()
	{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	/*@AfterMethod
	public void Post_Execution() throws IOException, InterruptedException
	{
		
		
		driver.quit();
		
	}*/

}
