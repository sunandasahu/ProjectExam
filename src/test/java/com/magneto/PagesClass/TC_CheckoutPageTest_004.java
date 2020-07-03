package com.magneto.PagesClass;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magneto.TestUtility.Baseclass;
import com.magneto.pageObjects.CheckoutPage;
import com.magneto.pageObjects.LoginPage;
import com.magneto.pageObjects.MobilePage;
import com.magneto.pageObjects.WishListPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_CheckoutPageTest_004 extends Baseclass
{
	LoginPage lp;
	MobilePage mp;
	WishListPage wlp;
	CheckoutPage cop;
	
	public TC_CheckoutPageTest_004() throws IOException {
		super();
		
	}

	public void checkoutPageTest() throws Exception
	{
		 cop = new CheckoutPage();
		 
		 cop.clickonNewAddress();
		 test.log(LogStatus.PASS, "Clicking on new address");
//		 cop.CheckoutDetails(prop.getProperty("firstName"),prop.getProperty("middleName"), prop.getProperty("lastName"), prop.getProperty("companyName")
//				 , prop.getProperty("phoneNumber"), prop.getProperty("faxNumber"), prop.getProperty("StreetAddress1"), prop.getProperty("StreetAddress2"),
//				 prop.getProperty("cityName"),prop.getProperty("statename"), prop.getProperty("zipCode"));
//	
//		 Select sc=new Select(driver.findElement(By.xpath("//*[@name='country_id']")));
//		 sc.selectByVisibleText("IN");
//			 
//		
//		 cop.clickSaveAddress();
		 
		 cop.enterFirstName(prop.getProperty("firstName"));
		 test.log(LogStatus.PASS, "Entering first name");
		 cop.enterMiddleName(prop.getProperty("middleName"));
		 test.log(LogStatus.PASS, "Entering middle name");
		 cop.enterLastName(prop.getProperty("lastName"));
		 test.log(LogStatus.PASS, "Entering last name");
		 cop.enterCompanyName(prop.getProperty("companyName"));
		 test.log(LogStatus.PASS, "Entering company name");
		 cop.enterPhoneNo(prop.getProperty("phoneNumber"));
		 test.log(LogStatus.PASS, "Entering phone number");
     	 cop.enterFaxNo(prop.getProperty("faxNumber"));
     	 test.log(LogStatus.PASS, "Entering fax number");
		 cop.enterStreetAdd(prop.getProperty("StreetAddress1"));
		 test.log(LogStatus.PASS, "Entering street address 1");
		 cop.enterStreetAdd2(prop.getProperty("StreetAddress2"));
		 test.log(LogStatus.PASS, "Entering street address 2");
		 cop.enterCityName(prop.getProperty("cityName"));
		 test.log(LogStatus.PASS, "Entering city name");
		 cop.enterZipCode(prop.getProperty("zipCode"));
		 test.log(LogStatus.PASS, "Entering zip code");
		 //cop.enterState(prop.getProperty("state1"));
		 Select drstate = new Select(driver.findElement(By.id("region_id")));
		 drstate.selectByVisibleText("Ohio");
		 test.log(LogStatus.PASS, "Entering state name");
		 Select sc=new Select(driver.findElement(By.xpath("//*[@name='country_id']")));
		 sc.selectByVisibleText("United States");
		 test.log(LogStatus.PASS, "Entering country name");
		 cop.clickSaveAddress();
		 test.log(LogStatus.PASS, "Click on save address");
//		 cop.clickonLogout();
//		 test.log(LogStatus.PASS, "Click on LogOut Btn");
	}

}
