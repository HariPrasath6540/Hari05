package Hari_Final;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hari_FinalProjectNew {

	public static void main(String[] args) throws InterruptedException
	{
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hari0\\OneDrive\\Desktop\\Automation Tools\\Browser extension\\chromedriver.exe");
		//WebDriver driver=new EdgeDriver();
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		
		//URL
				driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("Email")).sendKeys("hari05prasath@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Hari@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[1]/div/div/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("add-to-cart-button-14")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();


	}

}
