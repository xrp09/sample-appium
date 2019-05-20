package com.agree.appium.atest;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


import io.appium.java_client.remote.MobileCapabilityType;

public class JunitAppTtargetTest {
 private WebDriver iosdriver;
	
	 
//	 {
//		  "platformName": "IOS",
//		  "platformVersion": "12.1.4",
//		  "deviceName": "iPhone",
//		  "noReset": true,
//		  "app": "/Users/xrp09/software/dump1/AppTarget.ipa",
//		  "udid": "000ffdfd1162b24aee9ed2dc558d0e1cd1913ec4",
//		  "xcodeOrgId": "964DMKR46F",
//		  "xcodeSigningId": "iPhone Developer",
//		  "bundleId": "com.agree.WebDriverAgentRunner.iostt1",
//		  "automationName": "XCUITest"
//		}
	@Before
    public void setUp() throws Exception {
//        File classpathRoot = new File(System.getProperty("user.dir"));
//        File appDir = new File(classpathRoot, "../apps");
//        File app = new File(appDir, "TestApp.app.zip");
//        String deviceName = System.getenv("IOSgetCanonicalPath_DEVICE_NAME");
//        String platformVersion = System.getenv("IOS_PLATFORM_VERSION");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.1.4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        capabilities.setCapability(MobileCapabilityType.UDID, "000ffdfd1162b24aee9ed2dc558d0e1cd1913ec4");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/xrp09/software/dump1/AppTarget.ipa");
        capabilities.setCapability("noReset", true);
        capabilities.setCapability("xcodeOrgId", "964DMKR46F");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("bundleId", "com.agree.WebDriverAgentRunner.iostt1");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        iosdriver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        iosdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Appium is launched...");
	}
	
	
	 	@After
	    public void tearDown() {
		 iosdriver.quit();
	    }


	    @Test
	    public void testFindElementsByAccessibilityID () {
	        // This finds elements by "accessibility id", which in the case of IOS is the "name" attribute of the element
	        WebElement computeSumButton = iosdriver.findElement(By.id("ComputeSumButton"));
//	        Assert.assertTrue(computeSumButton!=null);
	        computeSumButton.click();
	    }

	    @Test
	    public void testFindElementsByName () {
	        // Find element by name
	        WebElement windowElements = iosdriver.findElement(By.name("XCUIElementTypeWindow"));
	        windowElements.click();
//	        Assert.assertTrue(windowElements!=null);
	    };


	    @Test
	    public void testFindElementsByClassChain () {
	        // This is also an IOS-specific selector strategy. Similar to XPath. This is recommended over XPath.这也是iOS特定的选择策略。类似于xpath。这是相对于xpath的建议
	        List<WebElement> windowElements = iosdriver.findElements(By.xpath("XCUIElementTypeWindow[1]/*[2]"));
	        windowElements.get(0).click();
//	        Assert.assertEquals(windowElements.size(), 1);
	    };

	    @Test
	    public void testFindElementsByXPath () {
	        // Can find source xml by calling "driver.source()"
	        // Note that XPath is not recommended due to major performance issues  由于主要性能问题，不建议使用xpath
	        List<WebElement> buttons = iosdriver.findElements(By.xpath("//XCUIElementTypeWindow//XCUIElementTypeButton"));
	        buttons.clear();
	    };
}
