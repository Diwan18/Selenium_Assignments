package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectClass_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://en-gb.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		driver.findElement(By.name("lastname")).sendKeys("all");
		
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("mohmaddiwan@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Qwerty12345");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select Day = new Select(day);
		
		Day.selectByValue("18");
		
		WebElement Month = driver.findElement(By.id("month"));
		
		Select month = new Select(Month);
		
		month.selectByVisibleText("Apr");
		
		WebElement Year = driver.findElement(By.id("year"));
		Select year = new Select(Year);
		year.selectByValue("1996");
		
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
