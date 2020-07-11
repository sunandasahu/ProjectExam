package com.magneto.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magneto.TestUtility.Baseclass;

public class TvPage extends Baseclass
{
	
public TvPage() throws Exception
{
	PageFactory.initElements(driver, this);
}
    @FindBy(xpath="//a[contains(text(),'TV')]")
    private WebElement tvTab;

    @FindBy(id="search")
    private WebElement srchbtn;
    
    @FindBy(xpath="//img[@id='product-collection-image-5']")
    private WebElement tvImage;
    
    @FindBy(xpath="//p[@class='availability in-stock']")
    private WebElement chkInStock;
    
//	@FindBy(xpath="//span[@class='price']")
//	private WebElement price;
	
	@FindBy(id="qty")
	private WebElement qtybox;
	
	@FindBy(xpath="//a[contains(text(),'Add to Wishlist')]")
	private WebElement addWishList;
    
    
    
    
    
    public void clickonTvTab()
    {
    	tvTab.click();
    }
   public String  getTitleTvPage()
   {
	   return  driver.getTitle();
	   
   }
   
   public void srhTv(String tv)
   {
	   srchbtn.sendKeys(tv);  
	   srchbtn.submit();
   }
   public void clickonTvImg()
   {
	   tvImage.click(); 
   }
   
   public boolean ckechInStock()
   {
	   return  chkInStock.isDisplayed();
   }
   
//   public String checkPrice()
//   {
//	   return price.getText();
//   }
   
   public void changeqty(String qty)
   {
	   qtybox.clear();
	   qtybox.sendKeys(qty);
   }
   
   public void clickonAddWishList()
   {
	   addWishList.click(); 
   }
    
    
}
