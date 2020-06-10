package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	public static void launchUrl(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	public static void type(WebElement e,String value) {
		e.sendKeys(value);
	}
	
	public static void click(WebElement e) {
		e.click();
	}
	
	public static void selectByIndex(WebElement e,int index) {
		new Select(e).selectByIndex(index);
	}
	
	public static void selectByText(WebElement e,String value) {
		new Select(e).selectByVisibleText(value);
	}
	
	public static String getAtt(WebElement e,String value) {
		String attribute = e.getAttribute(value);
		return attribute;
	}

}
