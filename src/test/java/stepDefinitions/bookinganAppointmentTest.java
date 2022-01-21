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

public class bookinganAppointmentTest   {
	
	 WebDriver driver;
	@Given("user is in homepage of the application")
	public void user_is_in_homepage_of_the_application() {
			//specify the location of the driver 
	System.setProperty("webdriver.chrome.driver", "/Users/rashidulhaque/Desktop/Drivers/chromedriver2");

	         //Initialising the driver 
			driver = new ChromeDriver () ;
			
			//Maximize  window to full screen 
			driver.manage().window().maximize();
			
			//launch the website
			driver.get("https://transfotechacademy.com");
			
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user clicks Book an Appointment link")
	public void user_clicks_book_an_appointment_link() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
	}


	    

	@And("user can provides all the requried details {string}, {string},{string},{string},{string}, {string} & {string}")
	public void user_can_provides_all_the_requried_details(String Firstname, String Lastname, String Email, String Phonenumber, String Date, String Time, String Message) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[2]/div[1]/div[1]/div/span/input")).sendKeys(Firstname);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[2]/div[1]/div[2]/div/span/input")).sendKeys(Lastname);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[2]/div[2]/div[1]/div/span/input")).sendKeys(Email);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[2]/div[2]/div[2]/div/span/input")).sendKeys(Phonenumber);
	    Thread.sleep(2000);
	    driver.findElement(By.name("date-279")).sendKeys(Date);
	    Thread.sleep(2000);
	    driver.findElement(By.name("appt-time")).sendKeys(Time);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[4]/div/div/span/textarea")).sendKeys(Message);
	    Thread.sleep(2000);
	    
	}

	@And("Select the subjectbox")
	public void select_the_subjectbox() {
	    driver.findElement(By.name("your-Interested[]")).click();
	}

	@Then("clicks Send A Request button")
	public void clicks_send_a_request_button() throws InterruptedException {
	 driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[5]/input")).click();
	 Thread.sleep(4000);
	 driver.close();
	}
	 
	 
	 //Verify if the user decided to cancel out from the Book an appointment form completing halfway 
	 
	 @Then("clicks the X button to cancel out from the form")

       public void clicks_the_X_button_to_cancel_out_from_the_form() throws InterruptedException {
		 driver.findElement(By.xpath("//body[1]/div[12]/div[1]/img[1]")).click();
		 Thread.sleep(2000);
		 
	 }
	         @Then("user clicks  back again Book an Appointment link")
	        public void user_clicks_back_again_book_an_appointment_link() throws InterruptedException {
	 	  driver.findElement(By.xpath("//*[@id=\"site-navigation\"]/div[2]/div/a")).click();
			 Thread.sleep(2000);
			 driver.close();
		 }

      
	 }
     // @Then("user should see error message in red The field is required")
	//public void user_should_see_error_message_in_red_The_field_is_required () {
		
		//String actual_msg = driver.findElement(By.xpath("//*[@id=\"wpcf7-f3264-o2\"]/form/div[4]/div/div/span/span")).getText();
		 //Store message in variable
		//String expect="This field is requried";
		//driver.findElement(By.cssSelector("#wpcf7-f3264-o2 > form > div.tm-commonform.tm-floatingbar-form > div:nth-child(1) > div:nth-child(1) > div > span > span")).getText();
		// Here Assert is a class and assertEquals is a method which will compare two values if// both matches it will run fine but in case if does not match then if will throw an 
		//exception and fail testcases
		 
		 //Verify error message
		//Assert.assertEquals(actual_msg, expect); 
		//driver.close();
	 
	 
	