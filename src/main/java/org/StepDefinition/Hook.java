package org.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class Hook {
	public static WebDriver driver;
	@Before
	public static void BeforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Customer_Practise\\PaymentGateway\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		
	}
	

}
