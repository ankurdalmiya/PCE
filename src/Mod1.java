import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mod1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.out.println("abc");
		System.setProperty("webdriver.chrome.driver", "D:\\AutomationTestingPD\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us&guccounter=1");
		driver.manage().window().maximize();
		driver.findElement(By.id("header-search-input")).sendKeys("PCE");
		driver.findElement(By.id("header-desktop-search-button")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
