package pageobjects;

import org.StepDefinition.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public PaymentPage() {
		PageFactory.initElements(Hook.driver, this);
		}
	
	
	@FindBy(xpath="//input[@id='card_nmuber']")
	private WebElement CardNoField;
	
	@FindBy(xpath="//select[@name='month']")
	private WebElement MonthField;
	
	@FindBy(xpath="//select[@name='year']")
	private WebElement YearField;
	
	@FindBy(xpath="//input[@name='cvv_code']")
	private WebElement CVVField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement PaymentButton;
	
	
	
	public WebElement getMonthField() {
		return MonthField;
	}


	public WebElement getYearField() {
		return YearField;
	}


	public WebElement getCVVField() {
		return CVVField;
	}


	public WebElement getPaymentButton() {
		return PaymentButton;
	}


	public WebElement getCardNoField() {
		return CardNoField;
	}
	

}
