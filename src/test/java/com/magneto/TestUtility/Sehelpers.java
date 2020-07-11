package com.magneto.TestUtility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sehelpers
{
static WebDriver driver;
static WebDriverWait wait;
public static void swithToAnotherWindow(WebDriver driver,int Window_num)
{
List<String> windowlist=null;
Set<String> windows=driver.getWindowHandles();
windowlist=new ArrayList<String>(windows);
String currentWindow=driver.getWindowHandle();
if(!currentWindow.equalsIgnoreCase(windowlist.get(Window_num - 1)))
{
driver.switchTo().window(windowlist.get(Window_num - 1));
}
}
public static void checkBox(String element)
{
WebElement checkBox=driver.findElement(By.xpath(element));
checkBox.click();
}
public static void frame(int index)
{
driver.switchTo().frame(index);

}
public static void frame(String name)
{
driver.switchTo().frame(name);

}
public static void frame(WebElement element)
{
driver.switchTo().frame(element);
}

public static void closeBrowser(WebDriver driver)
{
driver.quit();
}
public static void sendkeys(WebDriver driver,WebElement element,int timeout,String value)
{
new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
element.sendKeys(value);
}
public static void click(WebDriver driver,WebElement element,int timeout)
{
new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
element.click();
}
// public static void action(WebDriver driver,WebElement element,int timeout)
// {
// new WebDriverWait(driver,timeout).until(ExpectedConditions.alertIsPresent().));
// element.click();
// }
//
}

