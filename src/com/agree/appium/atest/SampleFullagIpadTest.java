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

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleFullagIpadTest {

  private IOSDriver<WebElement> driver;
  final String rootw = "/Users/xrp09/software/testcase/pic/";
  final String phfir = ".png";
  
  @Ignore
  public void screenshot() {
	  File file = driver.getScreenshotAs(OutputType.FILE);
	    try {
	    	UUID randomUUID = UUID.randomUUID();
			FileUtils.copyFile(file, new File(rootw+randomUUID.toString()+phfir));
		} catch (IOException e) {
			e.printStackTrace();
		}
	  
  }

  @Before
  public void setUp() throws MalformedURLException {
    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
    desiredCapabilities.setCapability("platformName", "iOS");
    desiredCapabilities.setCapability("platformVersion", "9.3.5");
    desiredCapabilities.setCapability("deviceName", "iPad");
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
	screenshot();
    MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"SDKDemo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther");
    el1.click();
    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("icon demo");
    el2.click();
    tsleep(1000);
    MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("增强 Webview 基本测试");
    el3.click();
    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("getUserMedia");
    el4.click();
//  61000000-0000-0000-1303-000000000000
    MobileElement els1 = (MobileElement) driver.findElementByAccessibilityId("确定");
    els1.click();
    MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"base\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton");
    el5.click();
//    MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Device（设备管理）");
//    el7.click();
//    MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("获取设备基本信息");
//    el8.click();
//    MobileElement el9 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"返回\"]");
//    el9.click();
//    MobileElement el10 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"返回\"]");
//    el10.click();
//    driver.navigate().back();
//    MobileElement el11 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeStaticText[@name=\"返回\"]");
//    el11.click();
//    MobileElement el13 = (MobileElement) driver.findElementByAccessibilityId("Push（推送）");
//    el13.click();
//    driver.navigate().back();
//    MobileElement el14 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeNavigationBar[@name=\"push\"]/XCUIElementTypeOther[1]/XCUIElementTypeButton");
//    el14.click();
//    MobileElement el15 = (MobileElement) driver.findElementByAccessibilityId("Screen（屏幕管理）");
//    el15.click();
//    MobileElement el16 = (MobileElement) driver.findElementByAccessibilityId("屏幕方向");
//    el16.click();
    tsleep(1000);
    swipeToUp(500,1);
    MobileElement el18 = (MobileElement) driver.findElementByAccessibilityId("Notification（通知）");
    el18.click();
    MobileElement el19 = (MobileElement) driver.findElementByAccessibilityId("提示音");
    el19.click();
    el19.click();
    el19.click();
    screenshot();
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
			e.printStackTrace();
		}
	   
	  }
 
  /** 
   * 上滑 
   * @param driver 
   * @param during 滑动时间 ms
   * @param num  滑动次数 
   */  
  @Ignore
  public  void swipeToUp(int during, int num) {  
      int width = driver.manage().window().getSize().width;  
      int height = driver.manage().window().getSize().height;  
      for (int i = 0; i < num; i++) {  
          driver.swipe(width / 2, height * 3 / 4, width / 2, height / 4, during);  
          tsleep(1000);  
      }  
  }
  
  /** 
   * 下滑  
   * @param driver 
   * @param during 
   * @param num 
   */  
  public  void swipeToDown(int during, int num) {  
      int width = driver.manage().window().getSize().width;  
      int height = driver.manage().window().getSize().height;  
      System.out.println(width);  
      System.out.println(height);  
      for (int i = 0; i < num; i++) {  
          driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);  
          tsleep(1000);   
      }  
  }  

  /** 
   * 左滑  
   * @param driver 
   * @param during 
   * @param num 
   */  
  public  void swipeToLeft(int during, int num) {  
      int width = driver.manage().window().getSize().width;  
      int height = driver.manage().window().getSize().height;  
      for (int i = 0; i < num; i++) {  
          driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);  
          tsleep(1000);  
      }  
  }  

  /** 
   * 右滑 
   * @param driver 
   * @param during 
   * @param num 
   */  
  public  void swipeToRight(int during, int num) {  
      int width = driver.manage().window().getSize().width;  
      int height = driver.manage().window().getSize().height;  
      for (int i = 0; i < num; i++) {  
          driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);  
          tsleep(1000);  
      }  
  }  

	 
}

