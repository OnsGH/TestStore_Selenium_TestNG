package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormShippingMethod {
	WebDriver driver ;
	
	By commentField = By.cssSelector("#delivery_message");
    //By commentField = By.xpath("//div[id='delivery']//textarea[name='delivery_message']");
	//By commentField = By.xpath("/html//textarea[@id='delivery_message']");
	By continueButton   = By.cssSelector("[name='confirmDeliveryOption']"); 
	
	
	public OrderFormShippingMethod(WebDriver driver){
		this.driver = driver;
	}
	
	
	public WebElement getCommentField() {
		
		return driver.findElement(commentField);
	}
	
	public WebElement getContinueButton() {
		return driver.findElement(continueButton);
		
	}
	
}
