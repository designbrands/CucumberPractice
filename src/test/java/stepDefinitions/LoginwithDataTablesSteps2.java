package stepDefinitions;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginwithDataTablesSteps2 {
	public WebDriver driver;
	public String appUrl = "https://demoqa.com/login";
	
	
    @Given("^I launched chrome Browser and open application$")
    public void i_launched_chrome_browser_and_open_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Drivers\\chromeDriver99\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
		Thread.sleep(2000);
    }
    

    @When("^user login into application with (.+) and (.+)$")
    public void user_login_into_application_with_and(String username, String password) throws Throwable {
       	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(username);
    	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
    	driver.findElement(By.xpath("//button[text()='Login']")).click();
    	Thread.sleep(3000);
    }


    
    @Then("^I then verified that user (.+) logged in successfully$")
    public void i_then_verified_that_user_logged_in_successfully(String username) throws Throwable {
		  String LoginUserNameText = driver.findElement(By.xpath("//label[@id='userName-value']")).getText();
		  System.out.println(LoginUserNameText);
		  Assert.assertEquals(LoginUserNameText, username, "Username is not found and hence test case is failing.");
    }
    
    

    @And("^I then verified Title of the page$")
    public void i_then_verified_title_of_the_page() throws Throwable {
    	System.out.println("Verified Title");
    }

    
    @And("^I signout from the application$")
    public void i_signout_from_the_application() throws Throwable {
    	driver.findElement(By.xpath("//button[text()='Log out']")).click();    }
    
    @And("^Verified that user sign out from the application$")
    public void verified_that_user_sign_out_from_the_application() throws Throwable {
    	Thread.sleep(1000);
    	Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Login']")).isDisplayed());   
    	driver.quit();
    }
    
    
    

}
