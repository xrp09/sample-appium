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

public class SampleTaTest {

  private IOSDriver<WebElement> driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "12.1");
    desiredCapabilities.setCapability("deviceName", "iPhone XR");
    desiredCapabilities.setCapability("automationName", "XCUITest");
    desiredCapabilities.setCapability("app", "/Users/xrp09/software/manage/TestApp.app");
    URL remoteUrl = new URL("http://localhost:4723/wd/hub");
    driver = new IOSDriver<WebElement>(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("TextField1");
    el2.sendKeys("1");
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("TextField2");
    el3.sendKeys("2");
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("ComputeSumButton");
    el4.sendKeys("");
    MobileElement el5 = (MobileElement) driver.findElementByAccessibilityId("show alert");
    el5.sendKeys("");
    MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("OK");
    el6.sendKeys("");
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}
