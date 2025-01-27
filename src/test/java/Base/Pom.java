package Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class Pom {

	public  AndroidDriver driver;

	public Pom(AndroidDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id ="com.android.permissioncontroller:id/permission_allow_button")
	WebElement Allow;
	@FindBy(xpath ="//android.widget.EditText[@text=\"Email ID *\"]")
	WebElement Email;
	@FindBy(xpath ="//android.widget.EditText[@text=\"Password *\"]")
	WebElement Paas;
	@FindBy(xpath= "//android.widget.Button[@content-desc=\"Submit\"]")
	WebElement submit;

	
	public void allow() throws InterruptedException
	{
		Allow.click();
		Thread.sleep(2000);
	}

    public void enteremail(String Enteremail)
    {
    	Email.sendKeys(Enteremail);
    }
    
    public void enterpass(String Enterpass)
    {
    	Paas.sendKeys(Enterpass);
    }
    
    public void clicksubmit()
    {
    	submit.click();
    }
}
