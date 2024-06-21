package week4Assignments.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAssignments {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		Actions act = new Actions(driver);
		
		WebElement MouseOver = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		WebElement search = driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
		
		act.moveToElement(MouseOver).click().perform();
		
		act.sendKeys("oneplus 9").perform();
		act.moveToElement(search).click().perform();
		
		
		String Price = driver.findElement(By.xpath("(//span[@class= 'a-price-whole'])[1]")).getText();
		
		System.out.println(Price);
		
		String ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		
		System.out.println(ratings);
		
		WebElement  ProductLink = driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")) ;
		
		act.moveToElement(ProductLink).click().perform();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		
		
		WebElement ProductImg = driver.findElement(By.xpath("//img[@class='a-dynamic-image a-stretch-horizontal']"));
		
		File scrnshot = ProductImg.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("./Snap/img.png");
		
		FileUtils.copyFile(scrnshot, trg);
		
		Thread.sleep(3000);
		
		WebElement Add2Cart = driver.findElement(By.id("add-to-cart-button"));
		
		act.moveToElement(Add2Cart).click().perform();
		
		Thread.sleep(3000);
		
		
		String Total = driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		
		Thread.sleep(3000);
		
		
		System.out.println(Total);
		
		
		
		if ( Total.contains(Price)) {
			
			System.out.println("Verified");
		}
		
		
		Thread.sleep(10000);
		
		driver.quit();	
		
		
		
		
		
		
		

		
		
	}

}
