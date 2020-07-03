package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magneto.TestUtility.Baseclass;

public class WishListPage extends Baseclass 
{

	public WishListPage() throws Exception 
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//*[@placeholder='Please, enter your comments...']")
//	WebElement commentBox;
	
	@FindBy(xpath="(//*[@name='do']//child::*[text()='Update Wishlist'])[2]")
	WebElement updateWishlist;
	
	@FindBy(xpath="//*[@title='Add to Cart']//child::*[text()='Add to Cart']")
	WebElement addToCart;
	
	@FindBy(xpath="//*[@title='Qty']")
	WebElement changeQuantity;
	
	@FindBy(xpath="//*[@title='Update']")
	WebElement updateBox;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement dropCountry;
	//Select drcountry =new Select(dropCountry);//can i use sendkey for dropdown?
	
	
	@FindBy(xpath="//*[@name='region']")
	WebElement State;
	
	@FindBy(xpath="//*[@name='estimate_postcode']")
	WebElement pinCode;
	
	@FindBy(xpath="//*[@title='Estimate']")
	WebElement estimatebtn;    
	
	@FindBy(xpath="//*[@type='radio']")
	WebElement fixedbtn;
	
	@FindBy(xpath="//*[@title='Update Total']")
	WebElement updateTotal;
	
	@FindBy(xpath="//*[@title='Checkout with Multiple Addresses']")
	WebElement multiAddressLink;
	
//	
//	public void addComment(String comment )
//	{
//		commentBox.sendKeys(comment);
//	}
	
	public void clickUpdtWishList()
	{
		updateWishlist.click();
	}
	
	public void clickAddtoCart()
	{
		addToCart.click();
	}
	public void changeingQuantity(String quantity2)
	{
		changeQuantity.clear();
		changeQuantity.sendKeys(quantity2);
	}
	public void clickUpdate()
	{
		updateBox.click();
	}
	
	public void selectCountry(String country1)
	{
		dropCountry.sendKeys(country1);
		//drcountry.selectByVisibleText(country1);
		
	}
	public void selectState(String statename)
	{
		State.sendKeys(statename);
		
	}public void enterPin(String pin)
	{
		pinCode.sendKeys(pin);
	}
	public void clickonEstimate()
	{
		estimatebtn.click();
	}
	
	public void clickFixedbtn()
	{
		fixedbtn.click();
	}
	public void clickonupdateTotal()
	{
	updateTotal.click();
	}
	public void clickonMultiaddress()
	{
		multiAddressLink.click();
	}

}


	