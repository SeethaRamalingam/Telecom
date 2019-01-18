package pageobjects;

import org.StepDefinition.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenerateCardNumberPage {
	
	public GenerateCardNumberPage () {
		PageFactory.initElements(Hook.driver, this);
		}
		
		@FindBy(xpath = "//a[text()='Payment Gateway Project']" )
		private WebElement PaymentGateway;
		
		@FindBy(xpath="(//a[text()='Generate Card Number'])[1]")
		private WebElement GenerateCardNo;
		
		
		
		@FindBy(xpath="((//div[@class='inner'])[2]/h4)[1]")
		private WebElement CardNumber;
		
		
		@FindBy(xpath="((//div[@class='inner'])[2]/h4)[2]")
		private WebElement Cvv;
		
		
		@FindBy(xpath="((//div[@class='inner'])[2]/h4)[3]")
		private WebElement Exp;
		
		
		@FindBy(xpath="((//div[@class='inner'])[2]/h4)[4]")
		private WebElement CreditLimit;
		
		public WebElement getPaymentGateway() {
			return PaymentGateway;
		}
		public WebElement getGenerateCardNo() {
			return GenerateCardNo;
		}
		public WebElement getCardNumber() {
			return CardNumber;
		}
		public WebElement getCvv() {
			return Cvv;
		}
		public WebElement getExp() {
			return Exp;
		}
		public WebElement getCreditLimit() {
			return CreditLimit;
		}

		
	

}
