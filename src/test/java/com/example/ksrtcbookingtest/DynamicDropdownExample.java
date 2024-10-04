package com.example.ksrtcbookingtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv Deshpande\\Documents\\selenium data\\AmazonApplicationDemo\\AmazonApplicationDemo\\driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 System.out.println("this base class is executed");
		 
		 //getting elements for autosleect
		 driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		 
		 Thread.sleep(3000);
		 
		 List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'] //a"));
		 
		 for(WebElement option :options) {
			 
			 if(option.getText().equalsIgnoreCase("India")){
				 option.click();
				 break;
			 }
		 }
	}

}
