package com.resowl.web.pages;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;

public class InputPageTest extends BaseTest {

	InputPage inputNumberPo;

	public InputPageTest() {
		super();

	}

	@BeforeClass
	public void testSetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());
	}

	@Test
	public void testInputsElement() {
		WelcomePage welcomePo = new WelcomePage();
		

	}

}
