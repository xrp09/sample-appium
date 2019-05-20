//package com.agree.appium.atest;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.AndroidMobileCapabilityType;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.Set;
//
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//public class WeXTest {
//
//    static AndroidDriver<MobileElement> driver = null;
//
//    public static void main(String[] args) throws Exception {
//
//
//            DesiredCapabilities desired_capabilities = new DesiredCapabilities();
//            ChromeOptions chrome_options = new ChromeOptions();
//            chrome_options.setExperimentalOption("androidProcess", "com.tencent.mm:tools");
//
//            desired_capabilities.setCapability(ChromeOptions.CAPABILITY, chrome_options);
//            desired_capabilities.setCapability(AndroidMobileCapabilityType.PLATFORM, "Android");
//            desired_capabilities.setCapability(AndroidMobileCapabilityType.VERSION, "6.0");
//            desired_capabilities.setCapability("deviceName", "a6990c40");
////            desired_capabilities.setCapability(MobileCapabilityType.FORCE_MJSONWP, true);
//            desired_capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.tencent.mm");
//            desired_capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ui.LauncherUI");
//            desired_capabilities.setCapability("showChromedriverLog", true);
//            desired_capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
//            desired_capabilities.setCapability("noReset", true);
//                desired_capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"");
//            desired_capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
//
//
//        try {
//            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),desired_capabilities);
//
//            Thread.sleep(2000);
//            driver.findElementByXPath("//*[@text='发现']").click();
//            Thread.sleep(2000);
//            driver.findElementByXPath("//*[@text='小程序']").click();
//            Thread.sleep(2000);
//            driver.findElementByXPath("//*[@text='驴妈妈门票预订']").click();
//            Thread.sleep(5000);
//            Set<String>  contextNames = driver.getContextHandles();
//            for(String contextName : contextNames) {
//            lvmama:if(contextName.contains("tencent.mm:appbrand0")){
//                    driver.context(contextName);
//                    Set<String> winHandles = driver.getWindowHandles();
//                    for(String wid : winHandles) {
//                        driver.switchTo().window(wid);
//                        String source = driver.getPageSource();
//                        if (source.contains("票")) {//好粗暴
//                            break lvmama;
//                        }
//                    }
//                }
//            }
//            Thread.sleep(5000);
//            System.out.println(driver.getPageSource());
//
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//    }
//}