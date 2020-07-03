package com.magneto.PagesClass;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.magneto.TestUtility.Baseclass;
import com.magneto.pageObjects.LoginPage;
import com.magneto.pageObjects.MobilePage;
import com.magneto.pageObjects.WishListPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_WishListPageTest_003 extends Baseclass
{
	    LoginPage lp;
		MobilePage mp;
		WishListPage wlp;
	public TC_WishListPageTest_003() throws IOException {
		super();
		
	}
	
	
	
	
	public void wishListPageTest() throws Exception
	{
		wlp =new WishListPage();
		
		//wlp.addComment(prop.getProperty("comments"));
		wlp.clickUpdtWishList();
		test.log(LogStatus.PASS, "Adding items to wishlist");
		wlp.clickAddtoCart();
		test.log(LogStatus.PASS, "Adding items to cart");
		wlp.changeingQuantity(prop.getProperty("qty2"));
		test.log(LogStatus.PASS, "Changing quantity to 1");
		wlp.clickUpdate();
		test.log(LogStatus.PASS, "Updating the cart");
		wlp.selectCountry(prop.getProperty("country1"));
		test.log(LogStatus.PASS, "Entering country name");
		wlp.selectState(prop.getProperty("state1"));
		test.log(LogStatus.PASS, "Entering state name");
		wlp.enterPin(prop.getProperty("pin1"));
		test.log(LogStatus.PASS, "Entering pin number");
		wlp.clickonEstimate();
		test.log(LogStatus.PASS, "Clicking on Estimate button");
		wlp.clickFixedbtn();
		test.log(LogStatus.PASS, "Clicking on fixed button");
		wlp.clickonupdateTotal();
		test.log(LogStatus.PASS, "Updating the total");
		wlp.clickonMultiaddress();
		test.log(LogStatus.PASS, "Clicking on multiaddress link");
		
	}

}
