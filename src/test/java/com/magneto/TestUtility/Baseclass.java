package com.magneto.TestUtility;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.ITestResult;



import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	public static WebDriver driver;
    public static Properties prop;
    public static ExtentReports extent;
    public static ExtentTest test;

static
{
	extent =new ExtentReports(System.getProperty("user.dir")+"/test-output/myReports1.html");
	extent.addSystemInfo("environment", "Dev");
	extent.addSystemInfo("os", "Mac");
	extent.addSystemInfo("testerName", "Sunanda");
	extent.addSystemInfo("Browser", "Chrome");
	
}


//syntax:put the consturctor of that calss and write the .properties file code using try and catchb
public Baseclass() throws IOException
{
	
try//executable code
{
 prop=new Properties();   //java.util

FileInputStream fis=new FileInputStream("/Users/bhuban/Documents/sunanda_workspace/com.magneto/config.properties");//java.io
//fis is used for connecting ur file of (.property)
//fis will throw unhandeled exception.it can be handled by try and catch 
prop.load(fis);//loading the file into prop varabale
}
catch(FileNotFoundException e)//unhandeled exception are handled by try and catch .user defined exception
{
	e.printStackTrace();
}
}
@BeforeClass
public static void setup()
{
	String browsername=prop.getProperty("broswer");//is from .properties file
	if(browsername.equalsIgnoreCase("chrome"))
	{
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("opera"))
	{
	WebDriverManager.operadriver().setup();
	driver=new OperaDriver();
	}
	else if(browsername.equalsIgnoreCase("ff"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get(prop.getProperty("url"));
	
	
}

@AfterClass(alwaysRun=true)

public void endReport()
{
	extent.flush();
	extent.endTest(test);
	//driver.close();
	//driver.quit();
}

@BeforeMethod()
public void BeforeMethod(Method result)
{
	test=extent.startTest(result.getName());//relats method
	test.log(LogStatus.INFO, result.getName()+" test Started");
}

public void getResult(ITestResult result) throws IOException{
	
	if(result.getStatus()==ITestResult.FAILURE){
		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
		test.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
		String screen=getScreenshot("");
		test.log(LogStatus.FAIL, test.addScreenCapture(screen));//add screenshot to failed testcase
		}
	else if(result.getStatus()==ITestResult.SKIP){
		test.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS){
		test.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
		String screen=getScreenshot("");
		test.log(LogStatus.PASS, test.addScreenCapture(screen));//add passed screen shot in extent reports
	}
	
}
@AfterMethod()
public void afetrMethod(ITestResult result) throws IOException
		{
			getResult(result);
		}


public  String getScreenshot(String imagename)throws IOException// screen shot in ur project
{
	if(imagename.equals(""))
	{
		imagename="blank";
	}
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	// after execution, you could see a folder "FailedTestsScreenshots"
	// under src folder
	String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + imagename + dateName
			+ ".png";
	File finalDestination = new File(destination);
	FileUtils.copyFile(source, finalDestination);
	return destination;
}


}

