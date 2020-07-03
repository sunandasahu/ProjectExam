package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.TestUtility.Baseclass;

public class MobilePage extends Baseclass 
{
	
	
	public MobilePage() throws Exception
	{
		
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Mobile']")
	WebElement mobileTab;
	
	@FindBy(xpath="(//span[contains(text(),'Cart')])[1]")
	private WebElement cart;
	
	@FindBy(xpath="//a[@title='Remove This Item']")
	private WebElement removeItem;
	
	@FindBy(xpath="//input[@id='search']")
	WebElement srchIphone;
	
	@FindBy(xpath="//*[@id='product-collection-image-2']")
	WebElement iphoneImg;
	
	@FindBy(xpath="//*[text()='Add to Cart']")
	WebElement chkInStock;
	
	@FindBy(xpath="//*[@id='product-price-2']/child::*[@class='price']")

	WebElement chkPrice;
	
	@FindBy(xpath="//*[@id='qty']")
	WebElement cngQuantity;
	
	@FindBy(xpath="//*[text()='Add to Wishlist']")
	WebElement addWishlist;
	
	
	public void clickmobiletab()
	{
		mobileTab.click();
	}
	
	public void clickoncart()
	{
		cart.click();
	}
	
	public void clickonRemoveItem()
	{
		removeItem.click();
	}
	
	public void searchiphone(String srh)
	{
		srchIphone.sendKeys(srh);
		srchIphone.submit();
	}
	public void clickonimage()
	{
		iphoneImg.click();
	}
	
	public boolean checkingStock()
	{
		return chkInStock.isDisplayed();
		
	}
	public void chkStock()
	{
		chkInStock.getText();
	}
	
	public String getPrice()
	{
		return chkPrice.getText();
	}
	
	public void changeQty(String qt)
	{
		cngQuantity.clear();
		cngQuantity.sendKeys(qt);
	}
	
	public void clickAddWishlst()
	{
		addWishlist.click();	
	}


}
