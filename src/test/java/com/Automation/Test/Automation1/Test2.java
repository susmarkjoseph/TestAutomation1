package com.Automation.Test.Automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {

	
public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	
	@Test
	public void getUrl() {
		//Get URL
		String url = "https://www.facebook.com/makmakoy";
		System.out.println("Getting URL from url string...");
		driver.get(url);
	}
	
	@Test
	public void getTitleAndTitleLength() {
		driver.get("https://www.facebook.com/makmakoy");
		System.out.println("Getting page title...");
		String title = driver.getTitle();
		System.out.println("Title of the current page is: "+title);
		System.out.println("Calculating title's length...");
		int titleLength = title.length();
		System.out.println("Title's length is: "+titleLength);
	}
	
	@Test
	public void compareCurrentPageTitle() {
		driver.get("https://www.facebook.com/makmakoy");
		System.out.println("Getting current page title...");
		String currentTitle = driver.getTitle();
		System.out.println("Title of the current page is: "+currentTitle);
		System.out.println("Comparing current title to the expected title...");
		String expectedTitle = "Mark Joseph Cordero";
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Verification Successful! - The correct Title is displayed.");
		}
		else {
			System.out.println("Verification Unsuccessful! - The displayed Title is incorrect.");
		}
	}
	
	@Test
	public void getPageSource() {
		driver.get("https://www.facebook.com/makmakoy");
		System.out.println("Displaying the page source...");
		String pageSource = driver.getPageSource();
		System.out.println("Calculating the length of the page source...");
		int length = pageSource.length();
		System.out.println("The length of the page source is: "+length);
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
