package Base;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;

public class Gainon {

	public static AndroidDriver driver;
	
	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException
	{  

		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("deviceName", "DN2101");
		capabilities.setCapability("appPackage", "in.appstute.whisper");
		capabilities.setCapability("appActivity", "in.appstute.whisper.MainActivity");
		java.net.URL url = URI.create("http://127.0.0.1:4723/").toURL();
		driver =new AndroidDriver(url,capabilities);
		//WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(5000));
		System.out.println("started");
		Thread.sleep(2000);
		
   	}
	
//	@AfterTest
//	public void teardown()
//	{
//		driver.quit();
//	}
}
