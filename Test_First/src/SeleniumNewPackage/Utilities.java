package SeleniumNewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Utilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void SelectCity(String City, WebDriver wd){
		String Xpath;
		for (int i=1;i<wd.findElements(By.xpath("//*[@id='airports-list-wrapper']/div/div/div/div[2]/div/div[1]/div[2]/ul/li/ul")).size(); i++){
			Xpath="//*[@id='airports-list-wrapper']/div/div/div/div[2]/div/div[1]/div[2]/ul/li/ul/li[" + i + "]/a";
			System.out.println(wd.findElement(By.xpath(Xpath)));
		}
		
		
	}

}
