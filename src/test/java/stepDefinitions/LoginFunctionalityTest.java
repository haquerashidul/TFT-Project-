package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginFunctionalityTest  {
	
	WebDriver driver;
	
	@Given("user is in home page of the application")
	public void user_is_in_home_page_of_the_application() throws InterruptedException {
		
		//specify the location of the driver 
System.setProperty("webdriver.chrome.driver", "/Users/rashidulhaque/Desktop/Drivers/chromedriver2");

         //Initialising the driver 
		driver = new ChromeDriver () ;
		
		//Maximize  window to full screen 
		driver.manage().window().maximize();
		
		//launch the website
		driver.get("https://transfotechacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	    Assert.assertEquals(driver.getTitle(), ("Best Online IT Training Institute | Transfotech Academy") );
	  
	}
    @When  ("the user clicks on Profile")
    public void the_user_clicks_on_Profile() {
    	driver.findElement(By.linkText("Profile")).click();
    	System.out.println("Prfile button is clicked");
    	
    	
    }
	@And("enters valid username")
	public void enters_valid_username() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("test123");
		System.out.println("username is provided");
		Thread.sleep(2000);
	    
	}

	@And("enters valid password")
	public void enters_valid_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("test123");
		System.out.println("password was provided ");
		Thread.sleep(2000);
	}
    @And ("select the checkbox Remember me")
public void select_the_checkbox_Remember_me () {
    	driver.findElement(By.name("rememberme")).click();
}
	@And("clicks Login button")
	public void clicks_login_button() throws InterruptedException {
		driver.findElement (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/button[1]")).click();
	    System.out.println("Login button was clicked");
	    Thread.sleep(2000);
	}

	@Then("user will be logged in")
	public void user_will_be_logged_in() throws InterruptedException {
	   Assert.assertEquals(driver.getCurrentUrl(), "https://transfotechacademy.com/lp-profile/");
	   System.out.println("Current url has been printed");
	   Thread.sleep(2000);
	}

	@And("will be able to see the name of the user")
	public void will_be_able_to_see_the_name_of_the_user() {
		driver.findElement(By.xpath("//body[1]/div[7]/div[1]/ul[2]/li[2]/a[1]/span[1]")).getText();
		System.out.println("Loged in user name has been printed");
		driver.close();
	}
	
	//Negative login functionality test using both invalid credentilas
	
	@And("enters invalid username")
	public void enters_invalid_username() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("test12345");
		System.out.println("username is provided");
		Thread.sleep(2000);
	}

	@And("enters invalid password")
	public void enters_invalid_password() throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("test12345");
		System.out.println("password was provided ");
		Thread.sleep(2000);
	    
	}

	@Then("user will not be logged in")
	public void user_will_not_be_logged_in() throws InterruptedException {
		  Assert.assertEquals(driver.getCurrentUrl(), "https://transfotechacademy.com/dashboard/");
		   System.out.println("Current url has been printed");
		   Thread.sleep(2000);
	}

	@And("user will be seeing login error message")
	public void user_will_be_seeing_login_error_message() {
	    driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]")).getText();
	
	driver.close();
	}
	
	//Negative login finctionality test by not providing any data for username and password and clicking login button
	
	
	@And("does not enter any data for username")
	public void does_not_enter_any_data_for_username() {
		driver.findElement(By.id("username")).sendKeys("");
	   
	}

	@And("does not enter any data for password")
	public void does_not_enter_any_data_for_password() {
		driver.findElement(By.id("password")).sendKeys("");
	}
	@And("click Login button")
	public void click_login_button() throws InterruptedException {
		driver.findElement (By.xpath("//body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[2]/button[1]")).click();
	    System.out.println("Login button was clicked");
	    Thread.sleep(2000);
	}
	
   @Then ("user will be seeing login error message Username is requried")
public void user_will_be_seeing_login_error_message_Username_is_requried () {
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div/main/article/div/div/div[1]")).getText();
	
	driver.close();
	
	
   }


	   
	}

	


