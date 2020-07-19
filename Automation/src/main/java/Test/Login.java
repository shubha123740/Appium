package Test;

import io.appium.java_client.MobileElement;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
import com.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Login extends OpenApp{
	
	
@Test
public void submitForm() throws IOException {
	/*
	 * test.log(LogStatus.INFO, "URL is Opened in the browser");
	 */
	driver.get("http://demoqa.com/automation-practice-form");
	Utilities.EnterValue("form.firstname","FirstName");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.lastname","LastName");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.email","Email");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.phoneNumber","Phone");
	driver.hideKeyboard(); 
	Utilities.ClickElement2();
	Utilities.javaScriptCheckbox();
	Utilities.EnterValue("form.currentAddress","Address");
	driver.hideKeyboard(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Utilities.ClickElement("form.submit");
	String expectedName = Utilities.GetKey("FirstName") + " " + Utilities.GetKey("LastName");
	Utilities.verifyValues(Utilities.getText("form.getnamevalue"), expectedName);
	Utilities.verifyValues(Utilities.getText("form.getEmailvalue"), Utilities.GetKey("Email"));
	Utilities.ClickElement("form.close");
	
	/**code for negative testing*/
	
	/*
	 * test.log(LogStatus.INFO, "Test started for negative tested");
	 */
	Utilities.EnterValue("form.firstname","FirstName");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.lastname","LastName");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.email","Email");
	driver.hideKeyboard(); 
	Utilities.EnterValue("form.phoneNumber","Phone1");
	driver.hideKeyboard(); 
	Utilities.ClickElement2();
	Utilities.ClickElement("form.submit");
	Utilities.verifyValues(Utilities.getText1("form.title"),"Student Registration Form");
	test.log(LogStatus.INFO, "form is not submitted with negative data");
	 
	Utilities.scrollUp();
	
}
}
