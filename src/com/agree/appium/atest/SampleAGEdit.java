package com.agree.appium.atest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleAGEdit {

  private IOSDriver<WebElement> driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
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
  }

  @Test
  public void sampleTest() {
//	 WebElement
//	  WebElement el0 =driver.findElementByAccessibilityId("icon demo");
//	  el0.click();  
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("icon demo");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Device（设备管理）");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("获取设备基本信息");
    el3.click();
    driver.closeApp();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

