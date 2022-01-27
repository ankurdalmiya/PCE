import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class allLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:\\AutomationTestingPD\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bbc.com/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		}
		
		

	}

}
