package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFor_Web {

	
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		 
		 WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get("https://finolex.com/");
	     driver.manage().window().maximize();	 
	
    }	
	
//	@AfterTest
//	public void afterTest()
//	{
//		driver.quit();
//	}
}
