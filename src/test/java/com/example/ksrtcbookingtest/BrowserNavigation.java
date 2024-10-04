package com.example.ksrtcbookingtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv Deshpande\\Documents\\selenium data\\AmazonApplicationDemo\\AmazonApplicationDemo\\driver\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://formy-project.herokuapp.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			 System.out.println("this base class is executed");
			String pass = driver.findElement(By.xpath("//h1[text()='Welcome to Formy']")).getText();
			String[] passarr=pass.split(" ");
			System.out.println(passarr[0]);
			driver.navigate().to("https://www.google.com/"); 
		 }
		 catch (Exception e) {
			// TODO: handle exception
			 
			 System.out.println("Exception caught");
		}	
			
	}
	}


