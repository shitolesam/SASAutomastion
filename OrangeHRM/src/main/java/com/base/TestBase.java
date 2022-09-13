package com.base;

public class TestBase {

	public static void initilization()  {
		System.setProperty("webdriver.chrome.driver","E:\\setup\\chrome\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		
		
		
	}
}
