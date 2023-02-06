package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {
	
	WebDriver driver ;
	By havePromoCodeLink  = By.cssSelector(".promo-code-button .collapse-button"); 
    By promoCodeTextBox = By.cssSelector("input[name='discount_name']");
    By promoCodeAddButton = By.xpath("//span[text()='Add']");
    By proceedTocheckoutButton = By.linkText("PROCEED TO CHECKOUT");
    By deleteProductOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteProductTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");
    By totalValue = By.cssSelector(".cart-total .value");
    
    
    
    public ShoppingCart(WebDriver driver) {
    	
    	this.driver = driver;
    }
    
    public WebElement getHavePromoCodeLink() {
    	return driver.findElement(havePromoCodeLink);
    	
    }
    public WebElement getPromoCodeTextBox() {
    	return driver.findElement(promoCodeTextBox);
    	
    }
    public WebElement getPromoCodeAddButton() {
    	return driver.findElement(promoCodeAddButton);
    	
    }
    public WebElement getProceedTocheckoutButton() {
    	return driver.findElement(proceedTocheckoutButton);
    	
    }
    public WebElement getDeleteProductOne() {
    	return driver.findElement(deleteProductOne);
    	
    }
    public WebElement getDeleteProductTwo() {
    	return driver.findElement(deleteProductTwo);
    	
    }
    public WebElement getTotalValue() {
    	return driver.findElement(totalValue);
    	
    }
}
