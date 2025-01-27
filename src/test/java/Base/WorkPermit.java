package Base;

import java.net.MalformedURLException;
import java.net.URI;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class WorkPermit {

//	com.zingworks.workpermitdev/com.zingworks.workpermit.MainActivity
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("deviceName", "DN2101");
		capabilities.setCapability("appPackage", "com.zingworks.workpermitdev");
		capabilities.setCapability("appActivity", "com.zingworks.workpermit.MainActivity");
		capabilities.setCapability("autoGrantPermissions", true);
		java.net.URL url = URI.create("http://127.0.0.1:4723/").toURL();
		AndroidDriver driver1 =new AndroidDriver(url,capabilities);
		//WebDriverWait wait = new WebDriverWait(driver1,Duration.ofSeconds(5000));
		System.out.println("started");
		Thread.sleep(5000);
		WebElement ele=driver1.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
		System.out.println(ele);
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		ele.sendKeys("gaurav.narvekar@zingworks.in");
		driver1.navigate().back();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele2=driver1.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
		System.out.println(ele2);
		ele2.click();
		Thread.sleep(2000);
		ele2.sendKeys("Gaurav@123");
		Thread.sleep(2000);
		WebElement Login=driver1.findElement(By.xpath("//android.widget.Button[@content-desc='Log in']"));
		Login.click();
		Thread.sleep(3000);
		WebElement Profile= driver1.findElement(By.xpath("//android.view.View[@content-desc='Hello, Gaurav Narvekar ']"));
		Thread.sleep(3000);
		String Profile_Name=Profile.getText();
		System.out.println(Profile_Name);
		Thread.sleep(2000);
		String Exp_Dash="Hello, Gaurav Narvekar";			
//		Assert.assertTrue(Profile_Name.equals(Exp_Dash), "Expected text to be '" + Exp_Dash + "' but found '" + Profile_Name + "'");
		System.out.println("pass");
		Thread.sleep(2000);
//		driver1.quit();
		
		driver1.findElement(By.xpath("//android.widget.Button[@content-desc='Create Work Permit']")).click();
		Thread.sleep(2000);

		driver1.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[1]/android.view.View")).click();
		
		driver1.findElement(By.xpath("//android.view.View[@content-desc='Cold Work Permit']")).click();
		
		driver1.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[2]/android.view.View")).click();
		
		driver1.findElement(By.xpath("//android.view.View[@content-desc='Defence Colony Plant']")).click();
		
		driver1.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[3]/android.view.View")).click();
		
		driver1.findElement(By.xpath("//android.view.View[@content-desc='Manufacturing Unit A']")).click();
		
		driver1.findElement(By.xpath("//android.widget.ScrollView/android.widget.ImageView[4]/android.view.View")).click();
		
		driver1.findElement(By.xpath("//android.view.View[@content-desc='AMC contractors']")).click();
		
		WebElement work_Discription=driver1.findElement(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));
		
		work_Discription.click();
		Thread.sleep(2000);
		
		work_Discription.sendKeys("Todays permit", Keys.TAB);
   
        driver1.findElement(By.xpath("//android.widget.Button[@content-desc='Add Labours']")).click();
        
        driver1.findElement(By.xpath("//android.view.View[@content-desc='Goldee - External']")).click();	
        
        driver1.findElement(By.xpath("//android.view.View[@content-desc='Jenny - External']")).click();
        
        driver1.findElement(By.xpath("//android.widget.Button[@content-desc='Add']")).click();
	}
}