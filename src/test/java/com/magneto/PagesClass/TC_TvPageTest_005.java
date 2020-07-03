package com.magneto.PagesClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.magneto.TestUtility.Baseclass;
import com.magneto.pageObjects.CheckoutPage;
import com.magneto.pageObjects.LoginPage;
import com.magneto.pageObjects.MobilePage;
import com.magneto.pageObjects.TvPage;
import com.magneto.pageObjects.WishListPage;

public class TC_TvPageTest_005 extends Baseclass
{
     TvPage tp;
     MobilePage mp;
     WishListPage wlp;
     CheckoutPage cop;
     LoginPage lp;
     TC_WishListPageTest_003 wishtv;
     TC_CheckoutPageTest_004 checktv;
     TC_LoginPageTest_001 logintv;
	public TC_TvPageTest_005() throws IOException {
		super();
		
	}
	@Test(priority = 0)
	
	public void mobileLoginTest() throws Exception
	{
		logintv=new TC_LoginPageTest_001();
		logintv.loginPageTest();
	}
		
	@Test(priority = 1)
	public void tvPageTest() throws Exception
	{
		
	
	
		tp= new TvPage();
		tp.clickonTvTab();
		tp.getTitleTvPage();
		tp.srhTv(prop.getProperty("searchtv"));
		tp.clickonTvImg();
		boolean inStk = tp.ckechInStock();
		Assert.assertTrue(inStk);
		//String price = tp.checkPrice();
		//Assert.assertEquals(price, "$700.00");
	    tp.changeqty(prop.getProperty("qty2"));
		tp.clickonAddWishList();
		
		wishtv=new TC_WishListPageTest_003();
		wishtv.wishListPageTest();
		
		checktv= new TC_CheckoutPageTest_004();
		checktv.checkoutPageTest();
		
		}
	
		 
		

	}
	


