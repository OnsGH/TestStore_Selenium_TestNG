package com.automationtesting.app;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BasePage;
import pageObjects.Homepage;
import pageObjects.OrderFormDelivery;
import pageObjects.OrderFormPayement;
import pageObjects.OrderFormPersonalInformation;
import pageObjects.OrderFormShippingMethod;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

@Listeners(resources.Listeners.class)


public class OrderCompleteTest  extends BasePage {

	public OrderCompleteTest() throws IOException {
		super();
	
	}
	
	@BeforeTest
	public void setup() {
		
		driver = getDriver();
		driver.get(getUrl());
	}
	
	
	//@AfterTest
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver=null;
		
	}
	
	@Test
	public void endToEndTest() throws Exception {
		
		Homepage homepage = new Homepage(driver);
		homepage.getTestStoreLink().click();
		
		ShopHomePage shop = new ShopHomePage(driver);
		shop.getProductOne().click();
		
		ShopProductPage shopProduct = new ShopProductPage(driver);
		Select prodSizeOption = new Select(shopProduct.getSizeOption());
		prodSizeOption.selectByVisibleText("M");
		shopProduct.getQuantiyIncrease().click();
		shopProduct.getAddToCartButton().click();
		
		ShopContentPanel shopContPan = new ShopContentPanel(driver);
		shopContPan.getProceedToCheckoutButton().click();	
		
		ShoppingCart cart = new ShoppingCart(driver);
		cart.getHavePromoCodeLink().click();
		cart.getPromoCodeTextBox().sendKeys("20OFF");
		cart.getPromoCodeAddButton().click();
				
		Thread.sleep(4000);
		cart.getProceedTocheckoutButton().click();
		
		OrderFormPersonalInformation personalInfoForm = new OrderFormPersonalInformation(driver);
		
		personalInfoForm.getGenderMrs().click();
		personalInfoForm.getFirstNameText().sendKeys("Ons");
		personalInfoForm.getLastNameText().sendKeys("gh");
		personalInfoForm.getEmailAdressText().sendKeys("ons1@test.com");
		personalInfoForm.getBirthDateText().sendKeys("07/09/1982");
		personalInfoForm.getTermConditionsCheckBox().click();
		personalInfoForm.getContinueButton().click();
		
		Thread.sleep(4000);
		
		OrderFormDelivery orderFormDelivery = new OrderFormDelivery(driver);
		orderFormDelivery.getEmailAdressField().sendKeys("aaa");
		orderFormDelivery.getCityField().sendKeys("Austin");
		Select state = new Select(orderFormDelivery
				.getStateDropdownList());
		state.selectByVisibleText("Texas");
		orderFormDelivery.getPhoneField().sendKeys("123123");
		orderFormDelivery.getZipcodeField().sendKeys("44444");
		
		Thread.sleep(4000);
		orderFormDelivery.getContinueButton().click();

		
		OrderFormShippingMethod formShippingMethod = new OrderFormShippingMethod(driver);
		
		
		formShippingMethod.getCommentField().sendKeys("comment");
		formShippingMethod.getContinueButton().click();
		//Thread.sleep(3000);
		OrderFormPayement formPayement = new OrderFormPayement(driver);
		//formPayement.getPayByCheck().click();
		formPayement.getPayByBanckWire().click();
		formPayement.getTermsAndConditions().click();
		formPayement.getOrderButton().click();
		
	
	    Thread.sleep(3000);
		
	}

}
