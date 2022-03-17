package com.resowl.web.functional;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.DynamicLoading;
import com.resowl.web.pages.WelcomePage;

public class DynamicTest extends BaseTest {

	DynamicLoading dynamicPo;

	public DynamicTest() {
		super();
	}

	@BeforeClass
	public void testSetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());
	}

	@Test
	public void testDynamic() {
		WelcomePage welcomePo = new WelcomePage();
		dynamicPo = welcomePo.clickDynamicElement();
		dynamicPo.clickDynamic();
		dynamicPo.clickStartLink();
		

	}

	@Test
	public void testStartButtons() {
		WelcomePage welcomePo = new WelcomePage();
		dynamicPo = welcomePo.clickDynamicElement();
		dynamicPo.clickDynamicLink2();
		dynamicPo.clickStartLink();

	}

}
