package Base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderTest {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br)
	{
//		WebDriverManager.chromedriver().setup();

		switch (br.toLowerCase())
		{
			case "chrome": driver=new ChromeDriver(); break;
			case "firefox": driver=new FirefoxDriver(); break;
			case "edge": driver=new EdgeDriver(); break;
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider="loginparameter", dataProviderClass=DataFortesting.class)
	void logintest(String email, String pass) throws InterruptedException
	{
		driver.get("https://work-permit-4c80a.uc.r.appspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//button[contains(text(),'Log In')]")).click();
		Thread.sleep(2000);
		Boolean status=driver.findElement(By.xpath("//p[contains(text(), 'Sanket Karwa')]")).isDisplayed();
		if(status) {

			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
//		Assert.assertEquals(true, status);
	}

//	@DataProvider(name="lp", indices={1,2} )
//	Object[][] LoginData()
//	{
//
//		 Object data[][]=
//			 {
//
//			           {"abc@gmail.com", "test1"},
//			           {"efg@gmail.com", "test2"},
//			           {"pratik@gmail.com", "test3"},
//			           {"sanket.karwa@zingworks.in", "Sanket@123"},
//
//			 };
//
//		return data;
//
//	}
}
