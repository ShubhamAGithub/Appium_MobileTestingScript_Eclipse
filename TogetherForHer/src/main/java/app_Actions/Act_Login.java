package app_Actions;



import app_Pages_Locators.Pg_Login;
import common.Act_Common;

public class Act_Login extends Pg_Login {

	
	public static void enterFirstName(String Name) {

		try {

			Act_Common.enterTextInTextBox(Enter_FirstName_textbox, Name);

		} catch (Exception e) {

			System.out.println("Error entering password: " + e.getMessage());

		}
	}

	public static void selectLanguage() {

		try {

			Act_Common.clickButton(Select_Language);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());
		}
		}
		
	public static void clickOnNextButton() {

			try {

				Act_Common.clickButton(Next_Button);

			} catch (Exception e) {
				System.out.println("Error entering password: " + e.getMessage());

			}
	}
	
	public static void selectCurrentMonth() {

		try {

			Act_Common.clickButton(SelectCurrent_Month);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void clickOnNEXTButton() {

		try {

			Act_Common.clickButton(NEXT_Button);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void clickOnNoneOfTheAbove() {

		try {

			Act_Common.clickButton(NONE_OF_THE_ABOVE);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void clickOnSigninwithGoogle() {

		try {

			Act_Common.clickButton(Sign_in_with_Google_Button);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void clickOnAddAnotherAccount() {

		try {

			Act_Common.clickButton(Add_another_account_Button);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void enterUsername(String Name) {

		try {

			Act_Common.enterTextInTextBox(Username_TextBox, Name);

		} catch (Exception e) {

			System.out.println("Error entering password: " + e.getMessage());

		}
	}
	
	public static void clickOnUserNameNext() {

		try {

			Act_Common.clickButton(UserNameNext_Button);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
	public static void enterPassword(String pwd) {

		try {

			Act_Common.enterTextInTextBox(password_TextBox, pwd);

		} catch (Exception e) {

			System.out.println("Error entering password: " + e.getMessage());

		}
	}
	
	public static void clickOnPasswordNext() {

		try {

			Act_Common.clickButton(passwordNext_Button);

		} catch (Exception e) {
			System.out.println("Error entering password: " + e.getMessage());

		}
}
	
}
