package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.TestUtility.Baseclass;

public class HomePage extends Baseclass
{
	public HomePage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	private WebElement MobileTab;
	
	
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	private WebElement TvTab ;
	
	@FindBy(xpath="//a[contains(text(),'Address Book')]")
	private WebElement  AddressLink;
	
	@FindBy(xpath="//strong[contains(text(),'My Wishlist')]")
	private WebElement WishListLink;
	
	public MobilePage MobileTabEle() throws Exception
	{
		MobileTab.click();
		return new MobilePage();
	}
	public TvPage clickonTVTab()throws Exception
	{
		 TvTab.click() ;
		 return new TvPage();
		
	}
	
}
