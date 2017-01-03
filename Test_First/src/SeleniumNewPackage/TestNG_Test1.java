package SeleniumNewPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
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
	//VerifyPage
	Assert.assertTrue(wd.findElements(By.xpath("//*[@id='1480664176477']/section/div/div[1]/div/section/div[1]")).size() != 0 );

	//wd.findElement(By.xpath("//*[@id='type']")).sendKeys(arg0);
	Select sElement = new Select(wd.findElement(By.xpath("//*[@id='type']")));
	sElement.selectByVisibleText("Home Insurance");
	wd.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("90210");
	wd.findElement(By.xpath("//*[@id='1480664176477']/section/div/div[1]/div/section/form/div[10]/button")).click();
	//thread.sleep(1000);
	//WebDriverWait wait = new WebDriverWait(wd, 10);
	//WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pane-header-YI01-0']/h1")));
	Assert.assertTrue(wd.findElements(By.xpath("//*[@id='pane-header-YI01-0']/h1")).size() != 0, "Page Home Insurance is displayed");
	
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
