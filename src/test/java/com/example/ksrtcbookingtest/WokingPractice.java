package com.example.ksrtcbookingtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WokingPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajiv Deshpande\\Documents\\selenium data\\AmazonApplicationDemo\\AmazonApplicationDemo\\driver\\chromedriver-win64\\chromedriver.exe");
WebDriver driver =  new ChromeDriver();
driver.get("https://ksrtc.in/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[text()='Home']")).click();

driver.findElement(By.xpath("//div[@id='fromCity_chosen']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='chosen-search']]")).sendKeys("Hub");

Thread.sleep(3000);

List<WebElement> options = (List<WebElement>) driver.findElement(By.xpath("//div//ul//li[@class='active-result']"));

for(WebElement option :options) {
	 
	 if(option.getText().equalsIgnoreCase("Hubli")){
		 option.click();
		 break;
	 }
}

	}

}
