package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;
import pageObjects.pageObjectManager;
import pageObjects.searchDetailsPage;
import utils.textContextSetup;

public class searchDetailsPageStepDefinition {
	public WebDriver driver;
	pageObjectManager pageObjectManager_obj;
	textContextSetup textcontextSetup;
	homePage homepage_obj;
	searchDetailsPage searchDetailsPage_obj;
	String departureAirportName;
	int CountOfSelectedAdults;
	int PriceValue;
	
	
	public searchDetailsPageStepDefinition(textContextSetup textcontextSetup)
	{
		this.textcontextSetup = textcontextSetup;
		this.homepage_obj = textcontextSetup.pageObjectManager_obj.gethomePage();
		this.searchDetailsPage_obj = textcontextSetup.pageObjectManager_obj.getsearchDetailsPage();

	}
	
	@When("User search for country {string}")
	public void user_search_for_country(String country) {
		homepage_obj.searchCountry(country);
	}

	@Then("User redirects to search details page")
	public void user_redirects_to_search_details_page() {
		Assert.assertEquals(homepage_obj.getHomePageTitle(), "India | Mail Travel");
	}
	

	@When("User click Book Online button without selecting departure date")
	public void user_click_book_online_button_without_selecting_departure_date() {
		searchDetailsPage_obj.clickBookOnlineBtn_top();
	}

	@Then("Text {string} should be displayed")
	public void text_should_be_displayed(String errormessage) {
		Assert.assertEquals(searchDetailsPage_obj.getDepartureDate_ErrorMessage(), errormessage, "Error message not matched, hence test case is failed");
	}
	
	@Then("User scroll to the bottom of the page")
	public void user_scroll_to_the_bottom_of_the_page() {
		searchDetailsPage_obj.scrollToBottomOfPage();
	}
	
	@And("Select next available date and select two adults")
	public void select_next_available_date_and_select_two_adults() {
		searchDetailsPage_obj.selectAvailableStartDate();
	}
	
	@Then("Verify price for two adults")
	public void Verify_price_for_two_adults() throws InterruptedException {
		Assert.assertEquals(searchDetailsPage_obj.expectedPrice(), searchDetailsPage_obj.getCalculatedPrice(), "Names are not matching, hence test case is failed");
	}
	
	@And("User make note of departure airport and price and selected adults")
	public void user_make_note_of_departure_airport_and_price_and_selected_adults() throws InterruptedException {
		departureAirportName = searchDetailsPage_obj.getDepartureAirportName();	
		PriceValue = searchDetailsPage_obj.getPriceValue();
		CountOfSelectedAdults = searchDetailsPage_obj.getNumberOfAdultsSelected();
	}
	@When("User click Book Online button")
	public void user_click_book_online_button() {
		searchDetailsPage_obj.clickBookOnlineBtn_bottom();
	}

	@When("User redirects to passengers page")
	public void User_redirects_to_passengers_page() {
		
	}
		
	@Given("User expands Departure & Passengers section")
	public void user_expands_departure_passengers_section() throws InterruptedException {
		searchDetailsPage_obj.clickDeparturePassengersSection();
	}

	@Then("verify the adults count")
	public void verify_the_adults_count() {
		Assert.assertEquals(searchDetailsPage_obj.getActualAdultsCount(), 2, "Adults Count is not matching, hence test case is failed");

	}

	@Then("verify that departure airport name should be {string}")
	public void verify_that_departure_airport_name_should_be(String departureAirport) {
		Assert.assertEquals(searchDetailsPage_obj.getActualDepartureAirportName(), departureAirport, "Names are not matching, hence test case is failed");
	}

	@When("User expands Accomodation section")
	public void user_expands_accomodation_section() throws InterruptedException {
		searchDetailsPage_obj.clickAccomodationSection();
	}

	@Then("Verify the number required is {int}")
	public void verify_the_number_required_is(Integer numberRequired) throws InterruptedException {
		Assert.assertEquals(searchDetailsPage_obj.getAccomodationNumberRequired(), numberRequired, "Numbers are not matching, hence test case is failed");
	}
	
    /*######################
     *  Enter 1st Passenger's Details
     *  #######################
     * */
	@And("User selects first adult title {string}")
	public void user_selects_first_adult_title(String title) throws Throwable {
		 Select select= new Select(searchDetailsPage_obj.selectPassengerTitle());
	     select.selectByValue(title);
	}
	
	@Then("User selects first adult birth date {int}")
	public void user_selects_first_adult_birth_date(int date) throws Throwable {
		 Select select= new Select(searchDetailsPage_obj.selectbirthDate());
	     select.selectByIndex(date);
	}
	
	@And("User selects first adult birth month {int}")
	public void user_selects_first_adult_birth_month(int month) throws Throwable {
		 Select select= new Select(searchDetailsPage_obj.selectbirthmonth());
	     select.selectByIndex(month);
	}
	
	@And("User selects first adult birth year {int}")
	public void user_selects_first_adult_birth_year(int year) throws Throwable {
		 Select select= new Select(searchDetailsPage_obj.selectbirthyear());
	     select.selectByIndex(year);
	}
	
	@And("User enters first adult firstname {string}")
	public void user_enters_first_adult_firstname(String firstname) {
		searchDetailsPage_obj.enterPassengerFirstName(firstname);
	}
	@And("User enters first adult lastname {string}")
	public void user_enters_first_adult_lastname(String lastname) {
		searchDetailsPage_obj.enterPassengerLastName(lastname);
	}
	
	
	
	
    /*######################
     *  Enter 2nd Passenger's Details
     *  #######################
     * */
	   @Then("User selects second adult title {string}")
		public void user_selects_second_adult_title(String title) throws Throwable {
		   Select select= new Select(searchDetailsPage_obj.selectSecondPassengerTitle());
		    select.selectByValue(title);
		}
		@Then("User selects second adult birth date {int}")
		public void user_selects_second_adult_birth_date(int date) throws Throwable {
			 Select select= new Select(searchDetailsPage_obj.selectSecondPassengerbirthDate());
		     select.selectByIndex(date);
		}
		@Then("User selects second adult birth month {int}")
		public void user_selects_second_adult_birth_month(int month) throws Throwable {
			 Select select= new Select(searchDetailsPage_obj.selectSecondPassengerbirthmonth());
		     select.selectByIndex(month);
		}
		@Then("User selects second adult birth year {int}")
		public void user_selects_second_adult_birth_year(int year) throws Throwable {
			 Select select= new Select(searchDetailsPage_obj.selectSecondPassengerbirthyear());
		     select.selectByIndex(year);
		}
		@Then("User enters second adult firstname {string}")
		public void user_enters_second_adult_firstname(String firstname) {
			searchDetailsPage_obj.enterSecondPassengerFirstName(firstname);

		}
		@Then("User enters second adult lastname {string}")
		public void user_enters_second_adult_lastname(String lastname) {
			searchDetailsPage_obj.enterSecondPassengerLastName(lastname);
		}
		
		
		
	    /*################
	     *  Enter Leads Details
	     *  ###############
	     * */
		
		@Then("User enters leads name {string}")
		public void user_enters_leads_name(String Name) {
			searchDetailsPage_obj.enterLeadName(Name);
		}

		@Then("User enters leads mobile number {string}")
		public void user_enters_leads_mobile_number(String Mobile) {
			searchDetailsPage_obj.enterLeadMobile(Mobile);
		}

		@Then("User enters leads email {string}")
		public void user_enters_leads_email(String Email) {
			searchDetailsPage_obj.enterLeadEmail(Email);

		}

		@Then("User enters leads address line1 {string}")
		public void user_enters_leads_address_line1(String Add1) {
			searchDetailsPage_obj.enterLeadAddLine1(Add1);
		}

		@Then("User enters leads address line2 {string}")
		public void user_enters_leads_address_line2(String Add2) {
			searchDetailsPage_obj.enterLeadAddLine2(Add2);
		}

		@Then("User enters leads city {string}")
		public void user_enters_leads_city(String City) {
			searchDetailsPage_obj.enterLeadCity(City);

		}

		@Then("User selects hear about us {int}")
		public void user_selects_hear_about_us(int aboutus) throws Throwable {
			  Select select= new Select(searchDetailsPage_obj.selectLeadHearAbout());
			  select.selectByIndex(aboutus);
		}
		
		
		
	}
