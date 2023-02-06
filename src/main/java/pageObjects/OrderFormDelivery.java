package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormDelivery {
	
	public WebDriver driver ;
	
	By firstNameField =By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lasttname']");
    By emailAdressField = By.cssSelector("input[name='address1']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdownList = By.cssSelector("select[name='id_state']");
    By zipcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdownList = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By continueButton = By.cssSelector("button[name='confirm-addresses']");
    By invoiceCheckBox = By.cssSelector("input#use_same_address");
    
    public OrderFormDelivery(WebDriver driver ) {
    	
    	this.driver = driver ;
    }
    
    public WebElement getFirstNameField() {
    	
    	return driver.findElement(firstNameField);
    	
    }
 public WebElement getLastNameField() {
    	
    	return driver.findElement(lastNameField);
    	
    }
 public WebElement getEmailAdressField() {
 	
 	return driver.findElement(emailAdressField);
 	
 }
 public WebElement getCityField() {
 	
 	return driver.findElement(cityField);
 	
 }
 public WebElement getStateDropdownList() {
 	
 	return driver.findElement(stateDropdownList);
 	
 }
 public WebElement getZipcodeField() {
 	
 	return driver.findElement(zipcodeField);
 	
 }
 public WebElement getCountryDropdownList() {
 	
 	return driver.findElement(countryDropdownList);
 	
 }
 public WebElement getPhoneField() {
 	
 	return driver.findElement(phoneField);
 	
 }
 public WebElement getContinueButton() {
 	
 	return driver.findElement(continueButton);
 	
 }
 
 public WebElement getInvoiceCheckBox() {
	 	
	 	return driver.findElement(invoiceCheckBox);
	 	
	 }
    
}
