package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registrationfunctionalitytest   {
	    WebDriver driver;
	
	
	@Given ("user is in dashboard page of the application")
	public void user_is_in_dashboard_page_of_the_application() throws InterruptedException {
		//specify the location of the driver 
System.setProperty("webdriver.chrome.driver", "/Users/rashidulhaque/Desktop/Drivers/chromedriver2");

         //Initialising the driver 
		driver = new ChromeDriver () ;
		
		//Maximize  window to full screen 
		driver.manage().window().maximize();
		
		//launch the website
		driver.get("https://transfotechacademy.com/dashboard/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    //Assert.assertEquals(driver.getTitle(), ("Best Online IT Training Institute | Transfotech Academy") );
	}
	
	
	@When("user provides all the requried details {string}, {string}, {string}, {string}, {string}, {string} & {string}")
	public void user_provides_all_the_requried_details(String Email, String Username, String Password, String ConfirmPassword, String Firstname, String Lastname, String Displayname) throws InterruptedException {
		driver.findElement(By.name("reg_email")).sendKeys(Email);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_username")).sendKeys(Username);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_password")).sendKeys(Password);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_password2")).sendKeys(ConfirmPassword);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_first_name")).sendKeys(Firstname);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_last_name")).sendKeys(Lastname);
	    Thread.sleep(2000);
	    driver.findElement(By.name("reg_display_name")).sendKeys(Displayname);
	    Thread.sleep(2000);
	    
	}
	@And("Select the checkbox")
	public void Select_the_checkbox() {
		driver.findElement(By.name("become_teacher")).click();
	}

	@And("clicks Register button")
	public void clicks_register_button() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"learn-press-profile\"]/div/div[2]/form/p[2]/button")).click();
	  Thread.sleep(2000);
	}

	@Then("user should be able to register")
	public void user_should_be_able_to_register() throws InterruptedException {
		String expectedregistrationpageUrl = "https://transfotechacademy.com/dashboard/";
		String actualregistrationpageUrl= driver.getCurrentUrl();
		Assert.assertEquals(actualregistrationpageUrl, expectedregistrationpageUrl);
		Thread.sleep(2000);
		
		
		driver.close();
	    
	}

}
