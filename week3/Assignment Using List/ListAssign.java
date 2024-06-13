package listInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ListAssign {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ajio.com/");
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//label[@for ='Men - Fashion Bags']")).click();
		
//		String CountofItems = driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
//		System.out.println(CountofItems);
		
		
		List<WebElement> Brand = (List<WebElement>) driver.findElement(By.className("Brand"));
		
		int totalbrands = Brand.size();
		System.out.println(totalbrands);
		
		for (int i = 0; i < Brand.size(); i++) {
			
			String Text = Brand.get(i).getText();
			System.out.println(Text);
			
		}
		
		
		
		
		
		
		
	
		

	}

}
