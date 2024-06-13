package listInterface;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ListAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.ajio.com/");
		
//		WebElement searchBox = driver.findElement(By.name("searchVal"));
//        searchBox.sendKeys("bags");
//        searchBox.submit();
        
        driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
        driver.findElement(By.xpath("//span[@class='ic-search']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//label[@for='Men']")).click();
        
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//label[@for ='Men - Fashion Bags']")).click();
        
        Thread.sleep(3000);
        
        String CountofItems = driver.findElement(By.xpath("//div[@class='length']//strong")).getText();
		System.out.println(CountofItems);
		
		Thread.sleep(3000);
		

		List<WebElement> BrandName =  driver.findElements(By.xpath("//div[@class='brand']"));
		
		int totalbrands = BrandName.size();
		System.out.println("\033[1m"  + "The No. of Brands Displayed" + "\033[0m");
		System.out.println(totalbrands);
		
//		for (WebElement BrandNameElement : BrandName) {
//            System.out.println(BrandNameElement.getText());}
		
		System.out.println("\033[1m" + "The Name of Brands Displayed"+ "\033[0m");
		for (int i = 0; i < BrandName.size(); i++) {
			
			String Text = BrandName.get(i).getText();
			System.out.println(Text);
			
		}
		
		
		List<WebElement> BagName = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		System.out.println( "\033[1m"  +  "The List of BagNames Displayed" + "\033[0m");
		
		for(int j = 0 ; j< BagName.size(); j++) {
			
			String Names = BagName.get(j).getText();
			System.out.println(Names);
		}		


	}

}
