package com.resowl.web.functional;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resowl.web.base.BasePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputNumb extends BasePage{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver;
	
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/inputs");
		Thread.sleep(3500);
		WebElement element = driver.findElement(By.xpath("//input[@type='number']")) ;
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='123'", element);
	
				

	}

}
