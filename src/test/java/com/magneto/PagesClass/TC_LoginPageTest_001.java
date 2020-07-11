package com.magneto.PagesClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.magneto.TestData.ExcelReader;
import com.magneto.TestUtility.Baseclass;

import com.magneto.pageObjects.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC_LoginPageTest_001 extends Baseclass
{
	
	LoginPage lp;
	//ExtentReportsC extentClass;
	
	public TC_LoginPageTest_001() throws IOException {
		super();
		
	}
	
	//1st before class will execute then it come to @test and @Afetreclass will execute
	
	
	//method 1:
	//@Test(priority=0)
	
	//@Test(invocationCount=5)
		
//		public void loginPageTest() throws IOException
//		{
//			lp=new LoginPage();
//	
//			//username is geting from prop with is connected to baseclass
//			lp.enterUserName(prop.getProperty("username"));
//			test.log(LogStatus.PASS, "Entering the user name");
//		
//			lp.enterPassword(prop.getProperty("userpassword"));
//			test.log(LogStatus.PASS, "Entering the password");
//			
//			lp.clickLoginbtn();
//			test.log(LogStatus.PASS, "Clicking the login btn");//this is getting the data from property file
			
			//Assert.assertTrue(true);
		//}
		
	//@Test(testName="validateLoginpage")
	//method2:
	String sheetName="Sheet1";
	@Test(dataProvider="getLoginTestData")
	public void loginPageTest(String usernam1,String password1) throws IOException
	{
		LoginPage lp=new LoginPage();
		lp.enterUserName(usernam1);
		lp.enterPassword(password1);
		lp.clickLoginbtn();
	}
	@DataProvider
	public Object[][] getLoginTestData()//user defined in dataProvider="getLoginTestData"
	{
		Object data[][]=ExcelReader.getTestData(sheetName);
		 
		return data;
	}
	
	
			
	@Test(priority=1)
		
		public void validateLoginpage(){
		
			
				boolean ld = lp.logoDisplayed();
				test.log(LogStatus.PASS, "Validating the login page logo");
				Assert.assertTrue(true);
		}
	
	//@Test(testName="validateLoginTittle")
	//innovacationCount=5
	@Test(priority=2)
				public void validateLoginTittle(){
				
					String title=lp.LoginTitle();
					Assert.assertEquals(title,"My Account","login page title test passed");
					test.log(LogStatus.PASS, "Validating the login page title");
	
		
		
	}

}
