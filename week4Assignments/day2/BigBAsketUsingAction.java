package week4Assignments.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BigBAsketUsingAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		Actions act1 = new Actions(driver);
		
		
		WebElement ShopByCat = driver.findElement(By.xpath("(//div[@class='relative h-full']/button)[2]"));
		
		act1.moveToElement(ShopByCat).click().perform();
		
		Thread.sleep(3000);
		
		WebElement FoodGrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala']/parent::li)[2]"));
		
		act1.moveToElement(FoodGrains).perform();
		Thread.sleep(3000);
		WebElement Rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']/parent::li"));
		act1.moveToElement(Rice).perform();
		Thread.sleep(3000);
		WebElement BoiledAndSteam = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']/parent::li")); 
		Thread.sleep(3000);
		act1.moveToElement(BoiledAndSteam).click().perform();
		Thread.sleep(3000);
		
		WebElement BBRoyal =  driver.findElement(By.id("i-BBRoyal"));
		Thread.sleep(3000);
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", BBRoyal);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		Thread.sleep(3000);
		
		
		WebElement KG = driver.findElement(By.xpath("//span[text()='5 kg']"));
		
		JavascriptExecutor executor1 = (JavascriptExecutor) driver;
		executor1.executeScript("arguments[0].click();", KG);
		
		String PriceOfRice = driver.findElement(By.xpath("//td[text()='₹404']")).getText();
		System.out.println(PriceOfRice);
		
		
		WebElement AddToCart = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		AddToCart.click();
		
		
		String Message = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println(Message);
		
		File scrnshot = driver.getScreenshotAs(OutputType.FILE);
		
		File trg = new File("./Snaps/img.png");
		
		FileUtils.copyFile(scrnshot, trg);
		
		driver.close();
		
		driver.switchTo().window(windows.get(0));
		Thread.sleep(3000);
		driver.close();
		
		

		
		
		
		
		

	}

}
