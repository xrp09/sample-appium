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

import com.agree.appium.utils.Operate;

public class SampleFullagIphoneTest2 {

  private IOSDriver<WebElement> driver;
  Operate operate = new Operate();

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "10.3.3");
    desiredCapabilities.setCapability("deviceName", "iPhone 5");
    desiredCapabilities.setCapability("udid", "fefdb7276a44130ecfa01cd258f30a582ae208a8");
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
	operate.screenshot(driver);
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("icon demo");
    el1.click();
    operate.swipeToUp(driver, 500, 1);
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Device（设备管理）");
    el2.click();
    operate.tsleep(2000);
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("获取设备基本信息");
    el3.click();
    driver.navigate().back();
    operate.swipeToUp(driver, 500, 1);
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Notification（通知）");
    el4.click();
    operate.tsleep(2000);
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("提示音");
    el5.click();
    el5.click();
    
    driver.navigate().back();
    operate.screenshot(driver);
    driver.closeApp();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

