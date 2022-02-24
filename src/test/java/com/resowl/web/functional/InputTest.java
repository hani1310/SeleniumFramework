package com.resowl.web.functional;

import org.testng.annotations.BeforeClass;

import com.resowl.web.base.BaseTest;

public class InputTest extends BaseTest {
	public InputTest() {
		super();
		
	}
	
	
	@BeforeClass
	public void testInput() {
		launchBrowser(getBrowser());
		driver.get(getUrl());		
		
	}
	
	
	
}
