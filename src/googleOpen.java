import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googleOpen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationTestingPD\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("ABC" + Keys.ENTER);
		
		
		//driver.get("https://www.bbc.com/");
		//driver.findElement(By.linkText("Thousands march for abortion rights across US")).click();
		
		//	driver.manage().window().maximize();
		//driver.findElement(By.name("btnK")).click();

		//	driver.close();












		//		driver.get("https://www.google.com/");
		//		driver.manage().window().maximize();
		//		driver.findElement(By.xpath("//input[contains(@class, 'gsfi')]")).sendKeys("India");
		//		
		//		Thread.sleep(5000);
		//		driver.findElement(By.id("search-icon-legacy")).click();
		//		driver.close();

	}

}

//chromedriver.exe
//geckodriver.exe