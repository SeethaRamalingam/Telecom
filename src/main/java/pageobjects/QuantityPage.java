package pageobjects;

import org.StepDefinition.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuantityPage {
	public QuantityPage() {
	PageFactory.initElements(Hook.driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Payment Gateway Project']" )
	private WebElement PaymentGateway;
	
	
	
	@FindBy(xpath = "//select[@name='quantity']")
	private WebElement Quantities;
	
	
	

	@FindBy(xpath = "//input[@value='Buy Now']")
	private WebElement BuyNow;
	
	
	public WebElement getPaymentGateway() {
		return PaymentGateway;
	}
	public WebElement getQuantities() {
		return Quantities;
	}
	public WebElement getBuyNow() {
		return BuyNow;
	}
	
	
	
}

