package com.resowl.web.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.resowl.web.utils.PathUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	//Base Test Logic Goes Here
	
	public static String projectDir;
	public static String configDir;
	public static Properties prop;
	public static WebDriver driver;
	
	public BaseTest(){
		projectDir = PathUtils.getCwd();
		configDir = PathUtils.getConfigDir(projectDir);
		System.out.println(configDir);
		prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(PathUtils.getFilePath(configDir, "config.properties"));
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("File config.properties Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Something went wrong processing the file");
			e.printStackTrace();
		}
	}
	
	/**
	 * Get browser from config
	 */
	public static String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public static String getUrl() {
		return prop.getProperty("url");
	}
	
	
	/**
	 * Launch web browser
	 * @param browserName
	 */
	public static void launchBrowser(String browserName) {
		System.out.println(browserName);
		if(browserName.toLowerCase().equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
	}
	
	/**
	 * Hard wait
	 * @param ms
	 */
	public static void hardWait(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}
