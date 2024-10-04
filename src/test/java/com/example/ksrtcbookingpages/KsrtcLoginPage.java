package com.example.ksrtcbookingpages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KsrtcLoginPage {

	private static WebElement element = null; 
	
	public static WebElement keyboardandmouse(WebDriver driver) {
 element = driver.findElement(By.xpath("//a[@class='btn btn-lg'][text()=\"Key and Mouse Press\"]"));
		return element;
		
	}
}
