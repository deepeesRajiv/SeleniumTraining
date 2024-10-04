package com.example.ksrtcbookingtest;

import org.openqa.selenium.WebDriver;


import com.example.ksrtcbookingpages.KsrtcLoginPage;
public class Keyboardandmouseinouttest {

	public static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		keyboard();
	}
	
	public static void  keyboard() {
		KsrtcLoginPage.keyboardandmouse(driver).click();
	}

}
