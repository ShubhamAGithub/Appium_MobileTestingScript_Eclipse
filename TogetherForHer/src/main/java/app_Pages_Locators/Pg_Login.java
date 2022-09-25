package app_Pages_Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import common.TestBase;

public class Pg_Login extends TestBase{

	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Eng']")
	public static WebElement Select_Language;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Next']")
	public static WebElement Next_Button;
	
	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@text='Type here']")
	public static WebElement Enter_FirstName_textbox;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='3']")
	public static WebElement SelectCurrent_Month;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='NEXT']")
	public static WebElement NEXT_Button;
	
	@FindBy(how = How.XPATH, using = "//android.widget.Button[@text='NONE OF THE ABOVE']")
	public static WebElement NONE_OF_THE_ABOVE;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Sign in with Google']")
	public static WebElement Sign_in_with_Google_Button;
	
	@FindBy(how = How.XPATH, using = "//android.widget.TextView[@text='Add another account']")
	public static WebElement Add_another_account_Button;
	
	@FindBy(how = How.XPATH, using = "//android.widget.EditText[@resource-id='identifierId']")
	public static WebElement Username_TextBox;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@resource-id='identifierNext']")
	public static WebElement UserNameNext_Button;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@resource-id='password']//android.widget.EditText")
	public static WebElement password_TextBox;
	
	@FindBy(how = How.XPATH, using = "//android.view.View[@resource-id='passwordNext']")
	public static WebElement passwordNext_Button;
	

	
}
