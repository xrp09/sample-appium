package com.agree.appium.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import io.appium.java_client.ios.IOSDriver;

public class Operate {
	
	
	 final String rootw = "/Users/xrp09/software/testcase/pic/";
	  final String phfir = ".png";
	  
	  public void screenshot(IOSDriver<WebElement> driver) {
		  File file = driver.getScreenshotAs(OutputType.FILE);
		    try {
		    	UUID randomUUID = UUID.randomUUID();
				FileUtils.copyFile(file, new File(rootw+randomUUID.toString()+phfir));
			} catch (IOException e) {
				e.printStackTrace();
			}
		  
	  }
	
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
	  public  void swipeToUp(IOSDriver<WebElement> driver,int during, int num) {  
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
	  public  void swipeToDown(IOSDriver<WebElement> driver,int during, int num) {  
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
	  public  void swipeToLeft(IOSDriver<WebElement> driver,int during, int num) {  
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
	  public  void swipeToRight(IOSDriver<WebElement> driver,int during, int num) {  
	      int width = driver.manage().window().getSize().width;  
	      int height = driver.manage().window().getSize().height;  
	      for (int i = 0; i < num; i++) {  
	          driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);  
	          tsleep(1000);  
	      }  
	  }  

}
