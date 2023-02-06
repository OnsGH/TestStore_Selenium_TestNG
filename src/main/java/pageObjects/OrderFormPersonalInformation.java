package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderFormPersonalInformation {
	
	public WebDriver driver ;
	
	By genderMr = By.cssSelector(".col-md-6.form-control-valign > label:nth-of-type(1)");
	By genderMrs = By.cssSelector(".col-md-6.form-control-valign > label:nth-of-type(2)");
	By firstNameText =By.cssSelector("input[name='firstname']");
    By lastNameText = By.cssSelector("input[name='lastname']");
    By emailAdressText = By.cssSelector("input[name='email']");
    By birthDateText = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckBox = By.cssSelector("input[name='optin']");
    By newsletterCheckBox = By.cssSelector("input[name='newsletter']");
    By termConditionsCheckBox = By.cssSelector("input[name='psgdpr']");
    By continueButton = By.cssSelector("form#customer-form  button[name='continue']");




    public OrderFormPersonalInformation(WebDriver driver) {
    	
    	this.driver = driver;
    	
    }
    
    public WebElement getGenderMr() {
    	return driver.findElement(genderMr);
    	}
    
    public WebElement getGenderMrs() {
    	return driver.findElement(genderMr);
    	}
    
    public WebElement getFirstNameText() {
    	return driver.findElement(firstNameText);
    	}
    
    public WebElement getLastNameText() {
    	return driver.findElement(lastNameText);
    	}
    
    public WebElement getEmailAdressText() {
    	return driver.findElement(emailAdressText);
    	}
    
    public WebElement getBirthDateText() {
    	return driver.findElement(birthDateText);
    	}
    
    public WebElement getReceiveOffersCheckBox() {
    	return driver.findElement(receiveOffersCheckBox);
    	}
    
    public WebElement getNewsletterCheckBox() {
    	return driver.findElement(newsletterCheckBox);
    	}
    
    public WebElement getTermConditionsCheckBox() {
    	return driver.findElement(termConditionsCheckBox);
    	}
    
    public WebElement getContinueButton() {
    	return driver.findElement(continueButton);
    	}  
    	



}
