package com.automationtesting.app;

import org.testng.annotations.AfterMethod;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;


@Listeners(resources.Listeners.class)

public class AddRemoveItemBasketTest extends BasePage {

	public AddRemoveItemBasketTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeTest
	public void setup() {
		driver = getDriver();
		driver.get(getUrl());
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
		
	}
	
	@Test
	public void AddRemoveItem() throws Exception {
		Homepage home = new Homepage(driver);
		home.getTestStoreLink().click();
		
		ShopHomePage shopProduct = new ShopHomePage(driver);
		shopProduct.getProductOne().click();
		
		ShopProductPage shopItem = new ShopProductPage(driver);
		Select select  = new Select(shopItem.getSizeOption());
		select.selectByVisibleText("M");
		shopItem.getQuantiyIncrease();
		shopItem.getAddToCartButton().click();
		
		ShopContentPanel shopContentItem  = new ShopContentPanel(driver);
		shopContentItem.getContinueShoppingButton().click();
		
		shopItem.getHomeLink().click();
		
		shopProduct.getProductTwo().click();
		shopItem.getAddToCartButton().click();
		shopContentItem.getProceedToCheckoutButton().click();
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getDeleteProductTwo().click();
		// Wait until the item is deleted
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.invisibilityOf(cart.getDeleteProductOne()));
		Thread.sleep(1000);
		System.out.println(cart.getTotalValue().getText());
	    AssertJUnit.assertEquals(cart.getTotalValue().getText(), "$26.10");
		
	}
	

}
