package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderFormPayement {
	
	public WebDriver driver ;
	
	By payByCheck = By.xpath("//span[text()='Pay by Check']");
	//By payByWire = By.xpath("//span[.='Pay by bank wire']");
	By payByWire = By.cssSelector("[for='payment-option-2'] span");
	By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
	By orderButton = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");
	
	public OrderFormPayement(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	public WebElement getPayByCheck() {
		
		return driver.findElement(payByCheck);
	}
	
	
	public WebElement getPayByBanckWire() {
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfElementLocated( payByWire));
	   // Thread.sleep(2000);
		return driver.findElement(payByWire);
	}

	
	public WebElement getTermsAndConditions() {
		return driver.findElement(termsAndConditions);
	}

	
	public WebElement getOrderButton() {
		return driver.findElement(orderButton);
	}


}
