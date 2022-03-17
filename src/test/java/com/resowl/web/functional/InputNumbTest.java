package com.resowl.web.functional;

import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.WelcomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class InputNumbTest extends BaseTest {
	
  @BeforeClass
  public void beforeClass() {
	  
  }

  @AfterClass
  public void afterClass() {
	  launchBrowser(getBrowser());
	  driver.get(getUrl());
  }


  @Test
  public void mainTest() {
		WelcomePage welcomePo = new WelcomePage();
		
  }
}
