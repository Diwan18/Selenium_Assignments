package week4Assignments.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAndAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.switchTo().frame("iframeResult");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Hi , Mohammad");
		
		alert.accept();
		
		String value = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(value);
		
		
		
		
		

	}

}
