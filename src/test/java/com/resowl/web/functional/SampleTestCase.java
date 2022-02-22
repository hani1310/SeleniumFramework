package com.resowl.web.functional;

import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.AddRemovePage;
import com.resowl.web.pages.WelcomePage;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SampleTestCase extends BaseTest {

	AddRemovePage addRemovePo;

	public SampleTestCase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public void testSetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());
	}

	@Test
	public void testAddElements() {
		WelcomePage welcomePo = new WelcomePage();
		addRemovePo = welcomePo.clickAddRemoveElement();
		addRemovePo.clickAddElementButton();
		int deleteButtonCount = addRemovePo.getDeleteButtonCount();
		Assert.assertEquals(deleteButtonCount, 1);
		hardWait(2000);
	}

	@Test
	public void testDeleteElements() {
		addRemovePo.clickDeleteButton(0);
		int deleteButtonCount = addRemovePo.getDeleteButtonCount();
		Assert.assertEquals(deleteButtonCount, 0);
	}

	@AfterClass
	public void tearDown() {
		
	}

}
