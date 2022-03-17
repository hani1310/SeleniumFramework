package com.resowl.web.functional;

import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.FileUploadPage;
import com.resowl.web.pages.WelcomePage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FileUploadTestCase extends BaseTest {

	FileUploadPage fileUploaadPo;

	public FileUploadTestCase() {
		super();

	}

	@Test
	public void testsetup() {
		WelcomePage welcomePo = new WelcomePage();
		fileUploaadPo = welcomePo.clickfileuploadLink();
		fileUploaadPo.clickUploadFileButton();

	}
	
	@Test
	public void testsetup2() {
		
	}

	@BeforeClass
	public void beforeclass() {
		launchBrowser(getBrowser());
		driver.get(getUrl());

	}

	@AfterClass
	public void afterClass() {
	}

}
