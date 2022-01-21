package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public WebDriver driver;
	
	public void intialization () {
		System.setProperty("webdriver.chrome.driver", "/Users/rashidulhaque/Desktop/Drivers/chromedriver2");
		
		driver = new ChromeDriver () ;
		driver.manage().window().maximize();
		driver.get("https://transfotechacademy.com/");
		
	}
	public void tearDown() {
		driver.close();
	}

}
