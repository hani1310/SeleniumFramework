package com.resowl.web.functional;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.FormAuth;
import com.resowl.web.pages.WelcomePage;

public class FormAuthTest extends BaseTest {
	
	FormAuth formPo;
	
	public FormAuthTest() {
		super();
	}
	
	@BeforeClass
	public void testSetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());

}
	@Test
	public void testForm() {
		WelcomePage welcomePo = new WelcomePage();
		formPo = welcomePo.clickFormElement();
		formPo.clickUser();
		formPo.clickPwd();
	
	}
	@Test
	public void testLogin() {
		formPo.clickLogin();
		formPo.clickOut();
		
		
		
		
	}
	
}	
	
