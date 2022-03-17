package com.resowl.web.functional;

import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.InputPage;
import com.resowl.web.pages.WelcomePage;

import org.testng.annotations.BeforeClass;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;

public class InputPageTest extends BaseTest {

	InputPage inputPo;

	public InputPageTest() {
		super();
	}

	@Test
	public void testsetup() {
		WelcomePage welcomePo = new WelcomePage();
		inputPo = welcomePo.clickinputLink();
		inputPo.clickInputButton();
		
	}

	@BeforeClass
	public void beforeClass() {
		launchBrowser(getBrowser());
		driver.get(getUrl());

	}

	@AfterClass
	public void afterClass() {
	}

}
