package com.resowl.web.functional;

import com.resowl.web.base.BaseTest;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class FunctionSampleTest extends BaseTest {
	WebDriver driver;

//  @BeforeMethod
//  public void beforeMethod() {
//	  System.out.println("Before MEthod");
//	  
//  }
	@BeforeClass(alwaysRun = true)
	public void beforeClass() {
		System.out.println("Before MEthod");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_zip\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.navigate().to("https://weathershopper.pythonanywhere.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterMethod() {
		System.out.println("After");

		driver.quit();
	}

	@Test
	public void test1() {
		System.out.println("Test");
	}

	@Test
	public void test2() {
		System.out.println("Test2");
	}

}
