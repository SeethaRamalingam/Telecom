package org.StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import pageobjects.QuantityPage;

public class QuantityPageSteps {
	
	QuantityPage quantity=new QuantityPage();

@Given("The user is in Telecom HomePage")
public void the_user_is_in_Telecom_HomePage() {
	
    Hook.driver.get("https://demo.guru99.com/telecom/billing.php");
    Hook.driver.manage().window().maximize();

}






}

