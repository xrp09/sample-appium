package com.agree.appium.atest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SamplePFmobTest {

  private IOSDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "10.3.3");
    desiredCapabilities.setCapability("deviceName", "iPhone 5");
    desiredCapabilities.setCapability("udid", "fefdb7276a44130ecfa01cd258f30a582ae208a8");
    desiredCapabilities.setCapability("xcodeOrgId", "964DMKR46F");
    desiredCapabilities.setCapability("bundleId", "com.agree.PF.mobile");
    desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
    desiredCapabilities.setCapability("automationName", "XCUITest");
    desiredCapabilities.setCapability("orientation", "PORTRAIT");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new IOSDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("登录");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[@name=\"pf-bank\"]/XCUIElementTypeOther[2]");
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeOther[@name=\"pf-bank\"]/XCUIElementTypeOther[3]/XCUIElementTypeImage");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("提交");
    el4.click();
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("下一步");
    el5.click();
    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("下一步");
    el6.click();
    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("返回首页");
    el7.click();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

