package SeleniumNewPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_Test1 {
  
private WebDriver wd;

@Test
  public void f() {
	wd.findElement(By.xpath("//*[@id='1480664176477']/section")).click();
	Assert.assertTrue(wd.findElements(By.xpath("//*[@id='1480664176477']/section")).size() != 0 );
  }
  @BeforeMethod
  public void beforeMethod() {
	  wd.get("https://www.libertymutual.com/");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
  }

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	  wd = new ChromeDriver();
	  
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
