package com.example.ksrtcbookingtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WorkingWithCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv Deshpande\\Documents\\selenium data\\AmazonApplicationDemo\\AmazonApplicationDemo\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 System.out.println("this base class is executed");
		 
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		 Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		 System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 
		 Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6");
		 
		 
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
	}

}
