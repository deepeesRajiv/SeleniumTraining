package com.example.ksrtcbookingtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class HandlingDropdown {

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
		 //C:\Users\Rajiv Deshpande\Documents\selenium data\KsrtcBooking\KsrtcBooking\driver\chromedriver
		// C:\Users\Rajiv Deshpande\Documents\selenium data\AmazonApplicationDemo\AmazonApplicationDemo\driver\chromedriver-win64
		 //Assignment 1
//		 driver.findElement(By.id("checkBoxOption1")).click();
//		 Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		 Thread.sleep(3000);
//		 driver.findElement(By.id("checkBoxOption1")).click();
//		 Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		 
//		 System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 
		 //==================================================================================================
		 
		 //Assignment 2
//		 driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Rajiv Deshpande");
//		 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("deshpanderajiv123@gmail.com");
//		 driver.findElement(By.id("exampleInputPassword1")).sendKeys("rajiv123@gmail");
//		 driver.findElement(By.id("exampleCheck1")).click();
//		 
//		 WebElement drop =driver.findElement(By.id("exampleFormControlSelect1"));
//		 Select pick = new Select(drop);
//		 pick.selectByVisibleText("Male");
//		 
//		 driver.findElement(By.id("inlineRadio1")).click();
//		 
//		 driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("08-05-1994");
//		 driver.findElement(By.xpath("//input[@value='Submit']")).click();
//		 
//		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		 
		 
		 
		 //static dropdown
		 WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		 Select dropdown = new Select(element);
		 dropdown.selectByIndex(1);
		 System.out.println(dropdown.getFirstSelectedOption().getText());
		 
		 //select number of adults in incrmental order
		 driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		 for(int i=1;i<5;i++) {
			 driver.findElement(By.id("hrefIncAdt")).click();
			 System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		 }
		 
		 driver.findElement(By.id("btnclosepaxoption")).click();
		 
		 driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		 //select to and from place
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		 
		 Thread.sleep(2000);
		 
		 //working with UI calender
		
		 driver.findElement(By.xpath("//td//a[@class='ui-state-default ui-state-highlight']")).click();
		
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
		
		 //working with checkboxes
		 
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		 driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
		 Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		 System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 
		 Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), "6");
		 
		 
		 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		 
		
		 
	}
	}


