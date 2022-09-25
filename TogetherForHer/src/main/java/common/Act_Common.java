package common;


import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Act_Common extends TestBase {

	public static void enterTextInTextBox(WebElement element, String data) {

		try {

			element.sendKeys(data);

		} catch (Exception e) {

			System.out.println("Error entering text: " + e.getMessage());
			Assert.fail("Expected element to enter text not found");
		}

	}

	public static void clickButton(WebElement element) {

		try {
			element.click();

		} catch (Exception e) {

			System.out.println("Error clicking button: " + e.getMessage());
			Assert.fail("Expected element to click not found");
		}

	}

	
}
