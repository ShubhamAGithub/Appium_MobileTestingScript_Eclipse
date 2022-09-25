package common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import app_Pages_Locators.Pg_Login;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class TestBase {

	public static AndroidDriver driver;
	public static Timeouts wait;
	@BeforeClass
	public void init() {

		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ShubhamMobile");
			cap.setCapability("udid", "emulator-5554");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1.1");
			cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
			cap.setCapability("appPackage", "com.avegen.together");
			cap.setCapability("appActivity", "com.avegen.together.MainActivity");
			cap.setCapability(MobileCapabilityType.NO_RESET, "true");
			cap.setCapability(MobileCapabilityType.FULL_RESET, "false");
			
			driver= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			PageFactory.initElements(driver, Pg_Login.class);
					
		} catch (Exception e) {
			System.out.println("Error in initiation: " + e.getMessage());
		}

	}

	
	
	@AfterMethod
	public void endTest() {
		
		driver.close();
		
	}

}
