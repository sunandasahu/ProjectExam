package com.magneto.pageObjects;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.TestUtility.Baseclass;

public class LoginPage extends Baseclass
{
	
	//constructor and initalize pageFactory
	public LoginPage() throws IOException 
	{
		
		//intitilizing the page factory
		PageFactory.initElements(driver, this);
	}
	

	//webElemnt methods
	@FindBy(xpath="//input[@title='Email Address']")
	private WebElement userEmail;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//span[contains(text(),'Login')]") 
	private WebElement loginbtn;
	
	@FindBy(xpath="//img[@class='large']")
	 private WebElement megnetologo ;
	
	public void enterUserName(String uname)
	{
		userEmail.sendKeys(uname);
	}
	
	public void enterPassword(String upassword)
	{
		password.sendKeys(upassword);
	}
	
	public void clickLoginbtn()
	{
		loginbtn.click();
	}
	
	public String LoginTitle()
	{
		return driver.getTitle();
	}
	public  boolean logoDisplayed()
	{
		return megnetologo.isDisplayed();
	}
	
	
	
	//driver.get("http://live.guru99.com/index.php/customer/account/login/");
		//WebElement email=driver.findElement(By.id("email"));
		
		//way 1: using page factory
		//webelemnts
		
		//way2:
//		@FindBy(how=How.id,using="email")
//		private WebElement userEmail1;
	//	
//		//way3:
//		public By username=By.id("email");
	//	
//		//creating method for way1, and 2 is same
//		public void sendUserNAMe(String username)	
//		{
//			userEmail.sendKeys(username);
//		}
//		 //way3 actionmethod
//		driver.findElement(username).sendKeys("jddbbhdb")
	
	//task is login logo dispalyed
	
	
	
	

	
//	email.sendKeys("nehamallik34@gmail.com");
//	WebElement password=driver.findElement(By.id("pass"));
//	password.sendKeys("123456");
//	driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
	//find logo xapath and isdipaly method
	
	
	
	
	
	
}
