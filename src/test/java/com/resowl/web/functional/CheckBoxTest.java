package com.resowl.web.functional;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.resowl.web.base.BaseTest;
import com.resowl.web.pages.CheckBoxPage;
import com.resowl.web.pages.WelcomePage;

public class CheckBoxTest<Checkboxes> extends BaseTest {

	CheckBoxPage checkboxPo;
	private Object isChecked;
	private By e;

	public CheckBoxTest() throws IOException {
		super();

	}

	@BeforeClass
	public void testsetup() {
		launchBrowser(getBrowser());
		driver.get(getUrl());
	}

	@Test
	public void testCheckElements() throws InterruptedException {
		WelcomePage welcomePo = new WelcomePage();
		checkboxPo = welcomePo.clickCheckboxLink();
		
		WebElement Checksbox=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
		Checksbox.click();
		Thread.sleep(5000);
		
		WebElement Checkbox2=driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
		Checkbox2.click();
		
	
		
	}

	@AfterClass
	public void tearDown() {
		

	}
}
