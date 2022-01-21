package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialmediaIconsFunctionalityTest  {
	
	
	 WebDriver driver;
	 @Given("user home page of the application")
	 public void user_home_page_of_the_application() {
			//specify the location of the driver 
		 System.setProperty("webdriver.chrome.driver", "/Users/rashidulhaque/Desktop/Drivers/chromedriver2");

		          //Initialising the driver 
		 		driver = new ChromeDriver () ;
		 		
		 		//Maximize  window to full screen 
		 		driver.manage().window().maximize();
		 		
		 		//launch the website
		 		driver.get("https://transfotechacademy.com/");
		 		
		 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 }
	@When("the user clicks on Facebook icon")
	public void the_user_clicks_on_facebook_icon() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[1]/div/div/div/div[2]/div/ul/li[1]/a/i")).click();
	    Thread.sleep(2000);
	    }

	@Then("new window open on facebook page with Transofotech Academy informations")
	public void new_window_open_on_facebook_page_with_transofotech_academy_informations() throws InterruptedException {
		Thread.sleep(2000);
		driver.getCurrentUrl();
		
		driver.quit();
		
		}

	@When("the user clicks on Youtube icon")
	public void the_user_clicks_on_youtube_icon() {
		driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[1]/div/div/div/div[2]/div/ul/li[3]/a/i")).click();
	}

	@Then("new window open on Youtube page with Transofotech Academy informations")
	public void new_window_open_on_youtube_page_with_transofotech_academy_informations() throws InterruptedException {
	    Thread.sleep(2000);
	    driver.getCurrentUrl() ;
	    driver.quit();
	
	}

	@When("the user clicks on twitter  icon")
	public void the_user_clicks_on_twitter_icon() {
	    driver.findElement(By.xpath("//*[@id=\"masthead\"]/div/div[1]/div/div/div/div[2]/div/ul/li[4]/a/i")).click();
	}

	@Then("new window open on twitter page with Transofotech Academy informations")
	public void new_window_open_on_twitter_page_with_transofotech_academy_informations() throws InterruptedException {
		 Thread.sleep(2000);
		    driver.getCurrentUrl() ;
		    driver.quit();
	

}
}