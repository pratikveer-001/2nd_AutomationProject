package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenGoogleChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();

	}

}
