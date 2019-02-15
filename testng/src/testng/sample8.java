package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sample8 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
@Test
public void login1() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	String s= driver.getTitle();
	System.out.println(s);
	driver.close();
  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    
  WebElement v= driver.findElement(By.xpath("//div[.='Login ']"));
  
  SoftAssert sf=new SoftAssert();
  sf.assertEquals(driver.getTitle(),"actiTIME - Login ");
  Reporter.log(driver.getTitle(),true);
  Thread.sleep(1000);
  driver.close();
  sf.assertAll();
    }
}

