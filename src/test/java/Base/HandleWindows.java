package Base;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWindows extends BaseFor_Web {

	@Test
      public void testHandlewindow() throws InterruptedException
      {
		Thread.sleep(3000);

		 WebElement link = driver.findElement(By.xpath("//*[@id='box_wrapper']/section[1]/div/div/div/ul/li[4]/a"));
         link.sendKeys(Keys.END);
         Thread.sleep(2000);
         WebElement link2=driver.findElement(By.xpath("//*[@id='box_wrapper']/footer/div/div[1]/div[1]/a[3]"));
         link2.click();
         Thread.sleep(2000);

         String parentwindow= driver.getWindowHandle();

         Set<String> allwindows=driver.getWindowHandles();

         for(String windowhandle: allwindows)
         {
        	 driver.switchTo().window(windowhandle);


         if(driver.getTitle().contains("Yahoo")|| driver.getCurrentUrl().contains("yahoo.com"))
         {
        	 System.out.println("swithe to window2");
        	 break;
         }
         System.out.println("Title of the new window: " + driver.getTitle());



         driver.switchTo().window(parentwindow);

         // Continue actions on the main window
         System.out.println("Title of the main window: " + driver.getTitle());

      }
}
}