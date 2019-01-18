package org.StepDefinition;

import java.util.Set;

import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.GenerateCardNumberPage;
import pageobjects.PaymentPage;
import pageobjects.QuantityPage;


public class PaymentPageSteps  {
	PaymentPage Payment=new PaymentPage();
	GenerateCardNumberSteps card=new GenerateCardNumberSteps();
	
	
		GenerateCardNumberPage GCard=new GenerateCardNumberPage();
		QuantityPage quantity=new QuantityPage();
		
		
		@When("The User selects Generate CardNumber")
	public void the_User_selects_Generate_CardNumber() throws Throwable {
			
			 
			Thread.sleep(3000);
			GCard.getPaymentGateway().click();
			Thread.sleep(8000);
			GCard.getGenerateCardNo().click();
			Thread.sleep(3000);
	    
	}
		
		
	
	@When("User completes payment")
	public void user_completes_payment() throws Throwable {
		Thread.sleep(8000);
		String pwid=Hook.driver.getWindowHandle();
		System.out.println(pwid);
		Set<String> allWindowsId=Hook.driver.getWindowHandles();
		System.out.println(allWindowsId);
		for (String Win:allWindowsId ) {
		Hook.driver.switchTo().window(Win);
		Thread.sleep(3000);
		}
		Thread.sleep(8000);
				
		
		
		String[] Card1=GCard.getCardNumber().getText().split(" ");
	  String CardNum=Card1[Card1.length-1];
	  
	  
	  String[] CVV=GCard.getCvv().getText().split(" ");
	  String CVVNum=CVV[1];
	  
	  
	  String[] Exp=GCard.getExp().getText().split(" ");
	  String ExpMonth=Exp[1].substring(1,2);
	  String ExpYear=Exp[1].substring(3);
	  
     String[] Limit=GCard.getCreditLimit().getText().split(" ");
	  String Limit1=Limit[2];
	  String CreditLimit=Limit1.substring(1);
	  
	  System.out.println("CVV Num is" + CVVNum);
	 
	  System.out.println(ExpMonth);
	  System.out.println("Exp year" + ExpYear );
	  System.out.println(CreditLimit);
		
		
		
		
		quantity.getPaymentGateway().click();
		Thread.sleep(3000);
			Select s= new Select (quantity.getQuantities());
			s.selectByValue("2");
			quantity.getBuyNow().click();
			Thread.sleep(4000);
		
				
				Payment.getCardNoField().sendKeys(CardNum);
				Thread.sleep(2000);
				Payment.getCVVField().sendKeys(CVVNum);
				Thread.sleep(2000);
				Select mon= new Select (Payment.getMonthField());
				mon.selectByValue(ExpMonth);
				Thread.sleep(2000);
				Select year= new Select (Payment.getYearField());
				year.selectByValue(ExpYear);
				Thread.sleep(3000);
				Payment.getPaymentButton().click();
				
				
		
		
	}
	
	
	@Then("Verify success message")
	public void verify_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
