package com.Automation.Test.Automation1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	
	@Test
	public void WriteToGoogleSearch() {
		driver.navigate().to("https://www.google.com");
		System.out.println("Test 1 Title is " + driver.getTitle());
		
		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("Mark Joseph Cordero");
		driver.findElement(By.name("btnK")).click();
	}
	
	@Test
	public void Test2() {
		//Launch test and quiz web site
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		//Fetch This is sample text
		String sampleText = driver.findElement(By.className("col-md-12")).getText();
		System.out.println(sampleText);
		
		//Click This is a link
//		driver.findElement(By.linkText("This is a link")).click();
	}
	
	
	@Test
	public void Test3() {
		//Launch test and quiz web site
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		
		//Fetch This is sample text
		String sampleText = driver.findElement(By.className("col-md-12")).getText();
		System.out.println(sampleText);
		
		//Click This is a link
//		driver.findElement(By.linkText("This is a link")).click();
		
		//Click on text box and send value
		driver.findElement(By.id("fname")).sendKeys("Mark Joseph Cordero");
		
		//Clear text box
		driver.findElement(By.id("fname")).clear();
	}
	
	@Test
	public void Test4() {
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		//Click button
		driver.findElement(By.id("idOfButton")).click();
	}
	
	@Test
	public void Test5() {
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		//Select radio button by id
		driver.findElement(By.id("male")).click();
	}
	
	@Test
	public void Test6() {
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		//Locate check box by cssSelector or xpath and check it
				driver.findElement(By.xpath("/html/body/div/div[8]/div/form/input[1]")).click();
	}
	
	@Test
	public void Test7() {
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		//Select class for selecting value from dropdown - Automation Testing
		Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));
		dropdown.selectByVisibleText("Automation Testing");
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
