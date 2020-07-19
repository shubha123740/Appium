package com.utility;

import java.awt.Dimension;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.lang.*;
import java.time.Duration;
import java.util.Properties; 
  
import Test.OpenApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import com.relevantcodes.extentreports.LogStatus;
import com.utility.ExtentReportListener;

public class Utilities extends ExtentReportListener {
public static String Content;	
public static String Value;	


	public  static String  GetKey(String key) throws IOException 
	 
	    { 
		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\Parameters.properties"));
		Properties propmain = new Properties();
		propmain.load(FileInputStream);
		String value = propmain.getProperty(key);
		System.out.println(value);
			return value; 
	    }
	
	
	
	public static void EnterValue(String key,String key2) throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {

			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			String value=GetKey(key2);
			System.out.println(value+"value");
			OpenApp.driver.findElement(By.id(locator)).sendKeys(value);
			test.log(LogStatus.PASS,
					"Successfully entered" + value);
		} catch (IOException e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL,
					"unable to enter");
		}
	}
	
	
	public static void verifyValues(String expected,String actual) throws FileNotFoundException {

		Assert.assertEquals(expected, actual);
		test.log(LogStatus.PASS,
				"assertion is passed,values are matched");
	}
	
	
	public static String getText(String key) throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {

			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			Value=OpenApp.driver.findElement(By.xpath(locator)).getText();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Value;
	}
	
	public static String getText1(String key) throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {

			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			Value=OpenApp.driver.findElement(By.id(locator)).getText();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Value;
	}
	

	public static void ClickElement(String key) throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		
		
		try {
			
			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			System.out.println("clickkk heerr");
			OpenApp.driver.findElement(By.id(locator)).click();
			System.out.println("clickkk heerhghgr");
			test.log(LogStatus.PASS,
					"element is clicked");

		} catch (IOException e) {
			e.printStackTrace();
			test.log(LogStatus.PASS,
					"element is unable to clicked");
		}

	}


	public static void ClickElement2() throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		
		
		try {
			
			
			
			propmain.load(FileInputStream);
			//String locator = propmain.getProperty(key);
			System.out.println("clickkk heerr");
			
			System.out.println("clickkk heerhghgr");
			JavascriptExecutor js = (JavascriptExecutor)OpenApp.driver;
			js = (JavascriptExecutor) OpenApp.driver;
			js.executeScript("document.getElementById('gender-radio-2').click();");
			test.log(LogStatus.PASS,
					"gender is selected");
		} catch (IOException e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL,
					"gender is not selected");
		}

	}
	
	
	public static void javaScriptCheckbox() throws FileNotFoundException {

		Properties propmain = new Properties();

		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		
		
		try {
			
			
			
			propmain.load(FileInputStream);
			//String locator = propmain.getProperty(key);
			System.out.println("clickkk heerr");
			
			System.out.println("clickkk heerhghgr");
			JavascriptExecutor js = (JavascriptExecutor)OpenApp.driver;
			js = (JavascriptExecutor) OpenApp.driver;
			js.executeScript("document.getElementById('hobbies-checkbox-3').click();");
			test.log(LogStatus.PASS,
					"hobby is selected");
		
		} catch (IOException e) {
			e.printStackTrace();
			test.log(LogStatus.FAIL,
					"hobby is not selected");
		}

	}

	public static void EnterValues1(String key,String key2) throws FileNotFoundException {

		Properties propmain = new Properties();
		System.out.println("aya");
		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {

			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			String value=GetKey(key2);
			System.out.println(value+"value");
			System.out.println(locator + "locator");
			OpenApp.driver.findElement(By.xpath(locator)).sendKeys(value);
			OpenApp.driver.findElement(By.xpath(locator)).sendKeys(Keys.ENTER);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static void EnterValues(String key,String key2) throws FileNotFoundException {

		Properties propmain = new Properties();
		System.out.println("aya");
		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {

			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			String value=GetKey(key2);
			System.out.println(value+"value");
			System.out.println(locator + "locator");
			OpenApp.driver.findElement(By.xpath(locator)).sendKeys(value);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public static void Enter(String key) throws FileNotFoundException {

		Properties propmain = new Properties();
		FileInputStream FileInputStream = new FileInputStream(
				new File(System.getProperty("user.dir") + "\\src\\main\\resources\\ObjectRepository.properties"));
		try {
			propmain.load(FileInputStream);
			String locator = propmain.getProperty(key);
			OpenApp.driver.findElement(By.id(locator)).sendKeys("Keys.ENTER");
		} catch (IOException e) {

			e.printStackTrace();
		}
		

	}
public static void scrollUp(){

int endx=0;
int starty=0;
int endy=0;
org.openqa.selenium.Dimension size=OpenApp.driver.manage().window().getSize();
starty=(int)(size.height*0.20);
endy=(int)(size.height*0.80);
int startx=size.width/2;
AppiumDriver<MobileElement> driver=OpenApp.driver;
new TouchActions((PerformsTouchActions)driver).longPress(PointOption.point(startx,starty)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).
moveTo(PointOption.point(endx,endy)).release().perform();




}


	}
	
	
	
	
	
	
	
