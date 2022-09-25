package executeTests;

import org.testng.annotations.Test;

import app_Actions.Act_Login;
import common.TestBase;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;


public class TogtherForHertests extends TestBase {
	
	private String username = "";
	private String password = "";
	

	@Test
	public void verifyFrictionlessTransactionUsingMerchant() throws Exception {
		
		System.out.println("Application Start");
		Thread.sleep(2000);
		Act_Login.selectLanguage();
		Act_Login.clickOnNextButton();
		Act_Login.enterFirstName("Women");
		Act_Login.clickOnNextButton();
		Act_Login.selectCurrentMonth();
		Act_Login.clickOnNEXTButton();
		Act_Login.clickOnNoneOfTheAbove();
		Act_Login.clickOnSigninwithGoogle();
		Act_Login.clickOnAddAnotherAccount();
		
		Act_Login.enterUsername(username);
		Thread.sleep(1000);
		Act_Login.clickOnUserNameNext();
		Act_Login.enterPassword(password);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		Act_Login.clickOnPasswordNext();
		System.out.println("Application End");
		
	}
	

	
}
