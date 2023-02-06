package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopContentPanel {
	
	WebDriver driver;
	
	By proceedToCheckoutButton = By.linkText("PROCEED TO CHECKOUT");
    By continueShoppingButton = By.xpath("//button[contains(text(),'Continue')]");
    
    
    public ShopContentPanel(WebDriver driver) {
    	this.driver = driver;
    	
    }
    
    public WebElement getProceedToCheckoutButton() {
    	return driver.findElement(proceedToCheckoutButton);
    	
    	
    }
    
    public WebElement getContinueShoppingButton() {
    	return driver.findElement(continueShoppingButton);
    	
    	
    }
    
}
