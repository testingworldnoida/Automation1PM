package testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class Steps {
    public ChromeDriver driver; 
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:/Users/TestingWorld/Downloads/chromedriver_win32 (10)/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https:/www.google.com/");
		
	}

	@When("^User enters username$")
	public void User_enters_username() throws Throwable {
		driver.findElementById("email").sendKeys("Hello");
	}

	@When("^User enters password$")
	public void User_enters_password() throws Throwable {
		driver.findElementById("pass").sendKeys("Hello");
	}

	@When("^User clicks on signinbutton$")
	public void User_clicks_on_signinbutton() throws Throwable {
	   
	}

	@Then("^User should be logged in$")
	public void User_should_be_logged_in() throws Throwable {
	   
	}

	@Then("^User should get welcome message$")
	public void User_should_get_welcome_message() throws Throwable {
	   
	}

	@When("^User enter data into searchbox$")
	public void User_enter_data_into_searchbox() throws Throwable {
	   
	}

	@When("^User clicks on search button$")
	public void User_clicks_on_search_button() throws Throwable {
	   
	}

	
	
}
