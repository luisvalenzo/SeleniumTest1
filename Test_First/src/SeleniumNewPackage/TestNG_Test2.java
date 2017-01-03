package SeleniumNewPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

//import Utilities;

public class TestNG_Test2 {

	public WebDriver wd;
	
  @Test
  public void f() {
	  wd.findElement(By.xpath("//*[@id='login-search-wrap']/div[3]/div/div[3]/form/div[7]/div[1]/cityselector/div[1]/div/a/span/img")).click();
	//*[@id="airport_popup_title"]
	  Assert.assertTrue(wd.findElements(By.xpath("//*[@id='airport_popup_title']")).size()!=0, "Airport PopUp");
	  Verify.verify(wd.findElements(By.xpath("//*[@id='airport_popup_title']")).size()!=0);
	  wd.findElement(By.xpath("//*[@id='airports-list-wrapper']/div/div/div/div[1]/a[1]")).click();
	  //System.out.println(wd.findElement(By.xpath("//*[@id='airports-list-wrapper']/div/div/div/div[1]/a[1]")).getAttribute("innertext"));
	  Utilities.SelectCity("C", wd);
  }
  @BeforeMethod
  public void beforeMethod() {
	  wd.get("https://www.jetblue.com/");
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	  wd = new ChromeDriver();
	  wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  wd.close();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
