package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopHomePage {
	
	WebDriver driver ;
	By productOne = By.cssSelector("[alt='Hummingbird printed t-shirt']");
	By productTwo = By.cssSelector("[alt='Brown bear printed sweater']");
	
	
	
	
	public ShopHomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getProductOne() {
		
		return driver.findElement(productOne);
		
	}
	
    public WebElement getProductTwo() {
		
		return driver.findElement(productTwo);
		
	}

}
