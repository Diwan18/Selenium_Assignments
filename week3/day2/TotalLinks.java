package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		List<WebElement> Links	 = driver.findElements(By.tagName("a"));
		
		int totallinks = Links.size();
		System.out.println(totallinks);
		
		for (int i = 0; i < Links.size(); i++) {
			
			String Text = Links.get(i).getText();
			System.out.println(Text);
			
		}
		

	}

}
