package week5Assignments.LeafTaps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClassSalesforce {
	
	public ChromeDriver driver ; 
	
	@BeforeMethod
	
	public void Presetup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("testleaf@2024");
		driver.findElement(By.id("Login")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		
		Shadow S = new Shadow(driver);
		
		
		WebElement Learning = S.findElementByXPath(("//span[text()='Learning']"));
		Learning.click();
		Shadow S1 = new Shadow(driver);
		WebElement LearningOnTrailHead = S1.findElementByXPath(("//span[text()='Learning on Trailhead']"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		Actions act = new Actions(driver);
		
		act.moveToElement(LearningOnTrailHead).perform();
		WebElement Certification  = S1.findElementByXPath(("//a[text()='Salesforce Certification']"));
		act.moveToElement(Certification).click().perform();
		
		

	}
	@AfterMethod
	public void postsetup() {
		// TODO Auto-generated method stub
		driver.close();

	}

}
