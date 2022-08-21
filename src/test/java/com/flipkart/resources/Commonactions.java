package com.flipkart.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	public static WebDriver driver;
	public void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void click(WebElement c) {
		c.click();
		
	}
	public void insertText(WebElement e, String value){
		
		e.sendKeys(value,Keys.ENTER);
		}
	public void insertNumber(WebElement g, String value) {
		g.sendKeys(value);
	}
	public void insertPassword(WebElement g, String value) {
		g.sendKeys(value);
	}
	}
