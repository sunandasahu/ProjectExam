package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.magneto.TestUtility.Baseclass;

public class CheckoutPage extends Baseclass 

{
	public CheckoutPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@title='Enter a New Address']")
	WebElement newAddress;
	
	@FindBy(xpath="//*[@name='firstname']")
	WebElement firstName;
	
	@FindBy(xpath="//*[@name='middlename']")
	WebElement middleName;
	
	@FindBy(xpath="//*[@name='lastname']")
	WebElement lastName;
	
	@FindBy(xpath="//*[@name='company']")
	WebElement companyName;
	
	@FindBy(xpath="//*[@name='telephone']")
	WebElement phoneNo;
	
	@FindBy(xpath="//*[@name='fax']")
	WebElement faxNo;
	
	@FindBy(xpath="//input[@id='street_1']")
	WebElement streetAddress;
	
	@FindBy(xpath="//input[@id='street_2']")
	WebElement streetAddress2; 
	
	@FindBy(xpath="(//*[@name='city'])")
	WebElement cityName;
	
	@FindBy(xpath="(//*[@name='postcode'])")
	WebElement zipCode;
	
	//@FindBy(xpath="//*[@name='country_id']")
	//WebElement country;
	//Select sc=new Select(country);
	@FindBy(id="region_id")
	WebElement stateName;
	
	@FindBy(xpath="//*[text()='Save Address']")
	WebElement saveAddress;
	
	@FindBy(xpath="(//span[contains(text(),'Account')])[1]")
	private WebElement accountbtn;
	
//	@FindBy(xpath="//a[contains(text(),'Log Out')]")
//	private WebElement logout;
	
	
	
	public void clickonNewAddress()
	{
		newAddress.click();
	}
	
	public void enterFirstName(String fname)
	{
		firstName.sendKeys(fname);
	}
	
	public void enterMiddleName(String mname)
	{
		middleName.sendKeys(mname);
	}
	
	public void enterLastName(String lname)
	{
		lastName.sendKeys(lname);
	}
	
	public void enterCompanyName(String comname)
	{
		companyName.sendKeys(comname);
	}
	
	public void enterPhoneNo(String phn)
	{
		phoneNo.sendKeys(phn);
	}
	
	public void enterFaxNo(String fxn)
	{
		faxNo.sendKeys(fxn);
	}
	
	public void enterStreetAdd(String add1)
	{
		streetAddress.sendKeys(add1);
	}
	
	public void enterStreetAdd2(String add2)
	{
		streetAddress2.sendKeys(add2);
	}
	
	public void enterCityName(String city)
	{
		cityName.sendKeys(city);
	}
	
	public void enterZipCode(String zip)
	{
		zipCode.sendKeys( zip);
	}
	
	public void enterState(String state)
	{
		stateName.sendKeys(state);
	}
	public void clickSaveAddress()
	{
		saveAddress.click();
	}
	public void clickonAccountbtn()
	{
		accountbtn.click();
	}
//	public void clickonLogout()
//	{
//		logout.click();
//	}
}
	
//	public void CheckoutDetails(String fname,String mname,String lname,String comname,String phn,String fxn,String add1,String add2,String states,String city,String zip)
//
//	{
//	
//		firstName.sendKeys(fname);
//	
//		middleName.sendKeys(mname);
//	
//
//		lastName.sendKeys(lname);
//	
//		companyName.sendKeys(comname);
//	
//		phoneNo.sendKeys(phn);
//	
//		faxNo.sendKeys(fxn);
//	
//		streetAddress.sendKeys(add1);
//	
//		streetAddress2.sendKeys(add2);
//	
//		cityName.sendKeys(city);
//		
//		state.sendKeys(states);
//	
//		zipCode.sendKeys(zip);
//		
//	
//		//country.sendKeys(country2);//becoz it is select class we are directly calling this method in test class
//		//sc.selectByVisibleText("IN");   //check if it  is correct
//	}
//	
	
	
	
	
	


