package com.agree.appium.atest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleAGTest {

  private IOSDriver<WebElement> driver;
  final String rootw = "/Users/xrp09/software/testcase/pic/";
  final String phfir = ".png";

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "IOS");
    desiredCapabilities.setCapability("platformVersion", "9.3.5");
    desiredCapabilities.setCapability("deviceName", "iPad mini");
    desiredCapabilities.setCapability("udid", "e63b296f6ac1d4006612da69ef29a4239eaa7904");
    desiredCapabilities.setCapability("xcodeOrgId", "964DMKR46F");
    desiredCapabilities.setCapability("bundleId", "com.agree.agtest");
    desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
    desiredCapabilities.setCapability("automationName", "XCUITest");
    desiredCapabilities.setCapability("orientation", "PORTRAIT");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new IOSDriver<WebElement>(remoteUrl, desiredCapabilities);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @Test
  public void sampleTest() {
//	 WebElement
//	  WebElement el0 =driver.findElementByAccessibilityId("icon demo");
////	  el0.click();  
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("icon demo");
    el1.click();
    tsleep(1000);
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Device（设备管理）");
    el2.click();
    tsleep(1000);
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("获取设备基本信息");
    el3.click();
    tsleep(1000);
    
//    /Users/xrp09/software/testcase/pic
//	WebElement e1 = driver.findElementByXPath("//XCUIElementTypeButton[@name=\"icon demo\"]");
//	WebElement e2=driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\\\"icon demo\\\"]"));
//	  WebElement e2=driver.findElement(By.name("icon demo"));
//	e2.click();
    tsleep(1000);
    driver.closeApp();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
  
  @Ignore
  public void tsleep(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	  }
  @Ignore
  public void screenshot() {
	  File file = driver.getScreenshotAs(OutputType.FILE);
	    try {
	    	UUID randomUUID = UUID.randomUUID();
			FileUtils.copyFile(file, new File(rootw+randomUUID.toString()+phfir));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
  }
  
}

