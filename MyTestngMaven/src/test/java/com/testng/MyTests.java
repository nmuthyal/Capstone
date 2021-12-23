package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class MyTests {
	
  @Test
  public void test() {
	  System.out.println("My test");

  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before test");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After test");

  }

}
