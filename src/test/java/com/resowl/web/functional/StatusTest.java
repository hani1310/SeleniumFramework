package com.resowl.web.functional;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.StatusCode;
import com.resowl.web.pages.WelcomePage;

public class StatusTest extends BaseTest {
	
	StatusCode StatusPo;
	
	public StatusTest() {
		super();
	}

	@BeforeClass
	public void testSetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());
	}
	
	@Test
	public void testStatus() {
		WelcomePage welcomePo = new WelcomePage();
		StatusPo = welcomePo.clickStatusElement();
		StatusPo.clickStatus();
		StatusPo.clickHere();
	}

}
