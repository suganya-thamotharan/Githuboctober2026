package org.flip;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCartSwitch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver objdriver = new ChromeDriver();
		objdriver.manage().window().maximize();
		objdriver.get("https://www.flipkart.com/");
		
		//wait.until(ExpectedConditions.elementOfLocated(
               // By.xpath("//button[text()='✕']")));
		
		
			
		
		WebDriverWait wait = new WebDriverWait(objdriver, Duration.ofSeconds(10));
		
       WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		//WebElement searchBox = objdriver.findElement(By.name("q"));
		
		
		searchBox.sendKeys("iphone 17");
        searchBox.sendKeys(Keys.ENTER);
        
        
        List<WebElement> mobiletype = objdriver.findElements(By.xpath("//div[@class='RG5Slk']"));
       List<WebElement> mobileprices = objdriver.findElements(By.xpath("//div[@class='hZ3P6w DeU9vF']"));
       
       
       
       
       for (int i = 0; i < mobiletype.size() && i < mobileprices.size(); i++) {
           System.out.println(mobiletype.get(i).getText() + " ==== " + mobileprices.get(i).getText());
       }
	}
}
       
       
        
       
        
        
		 
		 
		 
		 
		 
		 
		 
		 
		 



