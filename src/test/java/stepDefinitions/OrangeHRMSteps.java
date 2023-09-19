package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	public WebDriver driver;
	public String appUrl = "https://www.hyrtutorials.com/p/window-handles-practice.html";
	
	
	@Given("I launched the chrome browser")
	public void i_launched_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromeDriver99\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("I open the OrangeHRM application")
	public void i_open_the_orange_hrm_application() {
		driver.get(appUrl);
		System.out.println("Browser is launched.");
	}

	@Then("I verify the logo on page")
	public void i_verify_the_logo_on_page() {
	  String ActualTitle = driver.getTitle();
	  String expectedTitle = "Window Handles Practice - H Y R Tutorials";
	  Assert.assertEquals(ActualTitle, expectedTitle);
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
	}
	

}
