package Test;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;
//import com.relevantcodes.extentreports.LogStatus;
import com.utility.ExtentReportListener;
import com.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

 
public class OpenApp extends ExtentReportListener {
	//public static AndroidDriver driver;
	public static AppiumDriver<MobileElement> driver = null;

	@BeforeTest
	public static void OpenApplication() throws InterruptedException, MalformedURLException, IOException {
		
		//Set the Desired Capabilities
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "samsung s8 API 27");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");	
		caps.setCapability("udid", "emulator-5554");
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		//Instantiate Appium Driver

		  
			try {
				driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
				
			} catch (MalformedURLException e) {
				System.out.println(e.getMessage());
			}
		
			
			  test.log(LogStatus.INFO, "URL is Opened in the browser");
			 
			
	}
	/*
	 * @AfterTest public static void closeApplication() throws InterruptedException,
	 * MalformedURLException {
	 * 
	 * 
	 * driver.quit();
	 * 
	 * 
	 * }
	 */
		}
		

