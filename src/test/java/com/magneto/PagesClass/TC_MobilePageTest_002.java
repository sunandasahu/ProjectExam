package com.magneto.PagesClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magneto.TestUtility.Baseclass;
import com.magneto.pageObjects.CheckoutPage;
import com.magneto.pageObjects.HomePage;
import com.magneto.pageObjects.LoginPage;
import com.magneto.pageObjects.MobilePage;
import com.magneto.pageObjects.WishListPage;
import com.relevantcodes.extentreports.LogStatus;

import javafx.scene.control.Alert;

public class TC_MobilePageTest_002 extends Baseclass
{
	
	MobilePage mp;
	
	TC_LoginPageTest_001 loginCred;
	TC_WishListPageTest_003 wish;
	TC_CheckoutPageTest_004 check;
    
	public TC_MobilePageTest_002() throws IOException {
		super();
		
	}
	@Test(priority = 0)
	//@Test(testName="mobileLoginTest")
	
	public void mobileLoginTest() throws Exception
	{
		loginCred=new TC_LoginPageTest_001();//LOGIN PAGE CRED
		loginCred.loginPageTest("mounica.sriramoju@gmail.com", "9703202000");
		//loginCred.loginPageTest(String username, String password);
		
		
	}
	@Test(priority = 1)
	//@Test(dependsOnMethods="mobileLoginTest")
	
	public void mobilePageTest() throws Exception
	{
		//extent.createTest("Getting the mobile info");
		 mp=new MobilePage();
		 
//			mp.clickonRemoveItem();
//			org.openqa.selenium.Alert alert1= driver.switchTo().alert();
//			alert1.accept();
		 
	mp.clickmobiletab();
	
	test.log(LogStatus.PASS, "Clicking on mobile tab");
	

	
	mp.searchiphone(prop.getProperty("schiphone"));
	test.log(LogStatus.PASS, "Searching iphone ");
	
	mp.clickonimage();
	test.log(LogStatus.PASS, "Clicking on iphone image");
	
	boolean is = mp.checkingStock();
	Assert.assertTrue(is);
	test.log(LogStatus.PASS, "Checking in Stock");

	mp.changeQty(prop.getProperty("qty1"));
	test.log(LogStatus.PASS, "Changing quantuty to 5");
	
	mp.clickAddWishlst();
	test.log(LogStatus.PASS, "Adding items to wishlist");
	}
		//@Test(testName="MobileWIshListTest")
	@Test(priority = 2)
		//@Test(enable=false)
	public void MobileWIshListTest() throws Exception
	{
	 wish =new TC_WishListPageTest_003();
     wish.wishListPageTest();
	}

	@Test(priority = 3)
		//@Test(testName="MobileCheckOutTest")
	public void MobileCheckOutTest() throws Exception//this ur own method in ur related page
	{
		//test=extent.createTest("Mobile is ready for checkOut");
		check=new TC_CheckoutPageTest_004();
		check.checkoutPageTest();//calling method in the checkout page 
	
	}
	
	 
	}


