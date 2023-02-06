package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopProductPage {
	
	public WebDriver driver;
	By sizeOption = By.cssSelector("select[name='group[1]']");
	By quantityIncrease = By.cssSelector(".touchspin-up");
	By quantityDecrease = By.cssSelector(".touchspin-down");
	By addToCartButton = By.cssSelector("[data-button-action]");
	//By HomeLink = By.xpath("//span[text()='Home']");
	By HomeLink = By.xpath("//span[.='Home']"); // context item expression
	
   public   ShopProductPage(WebDriver driver)  {
	   
	   this.driver = driver;
	   
   } 
   
   public WebElement getSizeOption() {
	   
	   return driver.findElement(sizeOption);
	   
   }
   
   public WebElement getQuantiyIncrease() {
	   
	   return driver.findElement(quantityIncrease);
	   
   }
   
  public WebElement getQuantiyDecrease() {
	   
	   return driver.findElement(quantityDecrease);
	   
   }
  
  public WebElement getAddToCartButton() {
	  
	  return driver.findElement(addToCartButton);
  }
  
  
public WebElement getHomeLink() {
	  
	  return driver.findElement(HomeLink);
  }
  

}
