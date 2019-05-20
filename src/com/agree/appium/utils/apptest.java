package com.agree.appium.utils;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * beforeclass>before>test>after>beforeclass
 * @author xrp09
 *
 */
/**
 * @author xrp09
 *
 */
public class apptest {

	
	@Before
	public void t1() {
		System.out.println("1");
	}
	@Before
	public void t2() {
		System.out.println("2");
	}
	@Before
	public void t3() {
		System.out.println("3");
	}
	@BeforeClass
	public static void tc1() {
		System.out.println("tc1");
	}
	@BeforeClass
	public static void tc2() {
		System.out.println("tc2");
	}
	
	@Test
	public  void t4() {
		System.out.println("4");
	}
	
	 @Ignore
	 @Test(timeout=2000)
     public void testWhile(){
        while(true){
              System.out.println("run forever...");
        }
	 }
	 @Ignore
	 public void ignore(){
		 System.out.println("-------");
		 
		 
	 }
	 
//	 1. 如果两者一致, 程序继续往下运行. 2. 如果两者不一致, 中断测试方法, 抛出异常信息 AssertionFailedError .
//	 (expected=ArithmeticException.class)
	 @Test
	 public void testDivide(){
//		 boolean b = true;
	     assertTrue(true);
	     System.out.println("==========");
	 }
	
	@AfterClass
	public static void tc3() {
		System.out.println("tc3");
	}
	@AfterClass
	public static void tc4() {
		System.out.println("tc4");
	}
	@After
	public void tc5() {
		System.out.println("5");
	}
	@After
	public void tc6() {
		System.out.println("6");
	}
	
}
