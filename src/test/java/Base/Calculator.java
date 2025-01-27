package Base;

import java.net.MalformedURLException;
import java.net.URI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static void main(String[] args )throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
//		com.oneplus.calculator/com.android.calculator2.Calculator
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("deviceName", "DN2101");
		capabilities.setCapability("appPackage", "com.oneplus.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
		java.net.URL url = URI.create("http://127.0.0.1:4723/").toURL();
		AndroidDriver driver =new AndroidDriver(url,capabilities);
		//WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(5000));
		System.out.println("started");
		
		Thread.sleep(3000)	;
		driver.findElement(By.id("com.oneplus.calculator:id/digit_3")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/img_op_add")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/digit_6")).click();
		driver.findElement(By.id("com.oneplus.calculator:id/img_eq")).click();
		WebElement result=driver.findElement(By.id("com.oneplus.calculator:id/result"));
		System.out.println(result.getText());
		String resultget=result.getText();
		Assert.assertEquals(resultget, "9");
		   
		    
		if(resultget.equals("9"))
		{
			System.out.println("paas the test case");
		}
		else
		{
			System.out.println("fail the test case");
		}
	}
//	


}


