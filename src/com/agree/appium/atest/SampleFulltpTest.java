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

public class SampleFulltpTest {

  private IOSDriver<WebElement> driver;

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "9.3.5");
    desiredCapabilities.setCapability("deviceName", "iPad");
    desiredCapabilities.setCapability("udid", "e63b296f6ac1d4006612da69ef29a4239eaa7904");
    desiredCapabilities.setCapability("xcodeOrgId", "964DMKR46F");
    desiredCapabilities.setCapability("bundleId", "com.agree.test");
    desiredCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
    desiredCapabilities.setCapability("automationName", "XCUITest");
    desiredCapabilities.setCapability("orientation", "PORTRAIT");

    URL remoteUrl = new URL("http://localhost:4723/wd/hub");

    driver = new IOSDriver<WebElement>(remoteUrl, desiredCapabilities);
  }

  @Test
  public void sampleTest() {
	boolean isAppInstalled = driver.isAppInstalled("com.agree.test");
	System.out.println("com.agree.test APP 是否已安装 ："+isAppInstalled);
    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Attributes");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Button");
    el2.click();
    el2.click();
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Second");
    el3.click();
    MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntegrationApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSwitch");
    el5.click();
    MobileElement el8 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntegrationApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[3]");
    el8.sendKeys("6");
    MobileElement el9 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntegrationApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[4]");
    el9.sendKeys("55");
    MobileElement el10 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"IntegrationApp\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextView");
    el10.sendKeys("吃饼");
    el10.clear();
    driver.navigate().back();
    MobileElement el11 = (MobileElement) driver.findElementByAccessibilityId("Scrolling");
    el11.click();
    MobileElement el12 = (MobileElement) driver.findElementByAccessibilityId("TableView");
    el12.click();
   
    driver.closeApp();
  }

  @After
  public void tearDown() {
    driver.quit();
  }
}

