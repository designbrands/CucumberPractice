package stepDefinitions;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.TestBase;
import utils.textContextSetup;

public class searchDetailsPage {

	public WebDriver driver;
	
	
	public searchDetailsPage(WebDriver driver)
	{
		this.driver=driver;
	}
		
		private By bookOnlineButton_top = By.xpath("//button[@name='enterbookingflow']");  
		private By text = By.xpath("//div[text()='Departure Airport:']");
		private By errorMessage = By.xpath("//div[@class='fielderror']");
		private By datePriceTitle = By.xpath("//h2[@id='dates_and_prices_title']");
		private By departureAirport = By.xpath("//div[@id='departure-selection']//span");
		private By availableStartDate = By.xpath("//div[@class='nbf_tpl_pms_calendar_box_select']");
		private By priceValue = By.xpath("//div[@class='nbf_tpl_pms_calendar_price']/span");
		private By calculatedPricefield = By.xpath("//span[@id='tour-price']/span");
		//private By adultsDropdown = By.xpath("//select[@name='numAdults']");
		private By BookOnlineButton_bottom = By.xpath("(//div[@class='nbf_tpl_pms_buttonarea nbf_tpl_pms_book']/button)[2]");
		private String expectedDepartureDateError = "Please select your departure date";
		
		private By depPassengersSection = By.xpath("(//div[@class='nbf_tpl_pms_bf_panel__title__links'])[1]");
		private By accomodationSection = By.xpath("(//div[@class='nbf_tpl_pms_bf_panel__title__links'])[3]");   
		private By numberRequired = By.xpath("//div[@class='nbf_grid_item nbf_w25 txt-right']"); 
		private By adultsCountfield = By.xpath("//div[@class='nbf_tpl_pms_bf_passenger_number unit size1of2 lastUnit']"); 
		private By departureAirportfield = By.xpath("(//span[@dir='ltr'])[1]");
		private By passengersSubtotalfield = By.xpath("//div[@class='nbf_tpl_pms_totalprice_js heading-sm']/span");
		
		private By titlefield = By.xpath("//select[@name='pax-a-title-1']");
		private By firstNameField = By.xpath("//input[@name='pax-a-first-1']");
		private By lastNameField = By.xpath("//input[@name='pax-a-last-1']");
		private By dob_DateField = By.xpath("//select[@name='pax-a-dobd-1']");
		private By dob_MonthField = By.xpath("//select[@name='pax-a-dobm-1']");
		private By dob_YearField = By.xpath("//select[@name='pax-a-doby-1']");
		
		private By titlefieldSecondAdult = By.xpath("//select[@name='pax-a-title-2']");
		private By firstNameFieldSecondAdult = By.xpath("//input[@name='pax-a-first-2']");
		private By lastNameFieldSecondAdult = By.xpath("//input[@name='pax-a-last-2']");
		private By dob_DateFieldSecondAdult = By.xpath("//select[@name='pax-a-dobd-2']");
		private By dob_MonthFieldSecondAdult = By.xpath("//select[@name='pax-a-dobm-2']");
		private By dob_YearFieldSecondAdult = By.xpath("//select[@name='pax-a-doby-2']");
		
		private By leadNameField = By.xpath("//input[@id='contact-name']");
		private By leadContactField = By.xpath("//input[@id='contact-mobile']");
		private By leadEmailField = By.xpath("//input[@id='contact-email']");
		private By leadAddress1Field = By.xpath("//input[@id='contact-address1']");
		private By leadAddress2Field = By.xpath("//input[@id='contact-address2']");
		private By leadCityField = By.xpath("//input[@id='contact-city']");
		private By leadHearAboutUsField = By.xpath("//select[@id='contact-hearabout']");


	    /*####################
	     *  First Passengers Details
	     *  ####################
	     * */
	    public WebElement selectPassengerTitle() throws Throwable{
	    	WebElement ele = driver.findElement(titlefield);
	    	return ele;
	    }
	    public WebElement selectbirthDate() throws Throwable{
	    	WebElement ele = driver.findElement(dob_DateField);
	    	return ele;
	    }
	    public WebElement selectbirthyear() throws Throwable{
	    	WebElement ele = driver.findElement(dob_YearField);
	    	return ele;
	    }
	    public WebElement selectbirthmonth() throws Throwable{
	    	WebElement ele = driver.findElement(dob_MonthField);
	    	return ele;
	    }
	    
	    public void enterPassengerFirstName(String fName){
	    	driver.findElement(firstNameField).sendKeys(fName);
	    }
	    public void enterPassengerLastName(String lName){
	    	driver.findElement(lastNameField).sendKeys(lName);
	    }
	    
	    /*################
	     *  2nd Passenger's Details
	     *  ###############
	     * */

	    public void enterSecondPassengerFirstName(String fName){
	    	driver.findElement(firstNameFieldSecondAdult).sendKeys(fName);
	    }
	    public void enterSecondPassengerLastName(String lName){
	    	driver.findElement(lastNameFieldSecondAdult).sendKeys(lName);
	    }
	    public WebElement selectSecondPassengerTitle() throws Throwable{
	    	WebElement ele = driver.findElement(titlefieldSecondAdult);
	    	return ele;
	    }
	    public WebElement selectSecondPassengerbirthDate() throws Throwable{
	    	WebElement ele = driver.findElement(dob_DateFieldSecondAdult);
	    	return ele;
	    }
	    public WebElement selectSecondPassengerbirthyear() throws Throwable{
	    	WebElement ele = driver.findElement(dob_YearFieldSecondAdult);
	    	return ele;
	    }
	    public WebElement selectSecondPassengerbirthmonth() throws Throwable{
	    	WebElement ele = driver.findElement(dob_MonthFieldSecondAdult);
	    	return ele;
	    }
	    
	    
	    /*################
	     *  Leads Contact Details
	     *  ###############
	     * */
	    public void enterLeadName(String Name){
	    	driver.findElement(leadNameField).clear();
	    	driver.findElement(leadNameField).sendKeys(Name);
	    }
	    public void enterLeadMobile(String Mobile){
	    	driver.findElement(leadContactField).clear();
	    	driver.findElement(leadContactField).sendKeys(Mobile);
	    }
	    public void enterLeadEmail(String Email){
	    	driver.findElement(leadEmailField).clear();
	    	driver.findElement(leadEmailField).sendKeys(Email);
	    }
	    public void enterLeadAddLine1(String Address1){
	    	driver.findElement(leadAddress1Field).sendKeys(Address1);
	    }
	    public void enterLeadAddLine2(String Address2){
	    	driver.findElement(leadAddress2Field).sendKeys(Address2);
	    }
	    public void enterLeadCity(String city){
	    	driver.findElement(leadCityField).sendKeys(city);
	    }
	    public WebElement selectLeadHearAbout(){
	    	WebElement ele = driver.findElement(leadHearAboutUsField);
	    	return ele;
	    }
	    
	    
	    
	    public void clickBookOnlineBtn_top(){
	    	driver.findElement(bookOnlineButton_top).click();
	    }
	    
	    public String getsearchDetailsPageTitle(){
	        String actualSearchPageTitle = driver.getTitle();   
	        return actualSearchPageTitle;
	    }
	    
	    public String getDepartureDate_ErrorMessage()
	    {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return driver.findElement(errorMessage).getText();
	    	
	    }
	    


		public WebElement calElement()
		{
			return driver.findElement(datePriceTitle);
		}
		
		public void scrollToElement(WebElement ele)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView(true)", ele);
		}
		
		
		public void scrollToBottomOfPage()
		{
			scrollToElement(calElement());
		}
		
		public String getDepartureAirportName()
		{
			return driver.findElement(departureAirport).getText();
			
		}
		
	    public void clickBookOnlineBtn_bottom(){
	    	driver.findElement(BookOnlineButton_bottom).click();
	    }
		public void selectAvailableStartDate()
		{
			driver.findElement(availableStartDate).click();
		}
		
		public int getPriceValue()
		{
			return Integer.parseInt(driver.findElement(priceValue).getText().replace("£", "").replace(",", ""));
			
		}
		
		public int getCalculatedPrice()
		{
			return Integer.parseInt(driver.findElement(calculatedPricefield).getText().replace("£", "").replace(",", ""));
			
		}
		
		public int getNumberOfAdultsSelected() throws InterruptedException
		{
			Thread.sleep(4000);
			WebElement adultDropdown = driver.findElement(By.xpath("//select[@name='numAdults']"));
			Select select = new Select(adultDropdown);
			WebElement numberofAdultsSelected = select.getFirstSelectedOption();
			return Integer.parseInt(numberofAdultsSelected.getText());
		}
		
		public int expectedPrice() throws InterruptedException
		{
			Thread.sleep(4000);
			return (getNumberOfAdultsSelected() * getPriceValue());
			
		}
		
		
		
		public void clickDeparturePassengersSection() throws InterruptedException{
			Thread.sleep(7000);
	    	driver.findElement(depPassengersSection).click();
	    }
	    
		public int getActualAdultsCount()
		{
			String adultsCount = driver.findElement(adultsCountfield).getText();	
			return Integer.parseInt(adultsCount);
		}
		
	    public String getPassengerPageTitle(){
	        String actualPassengerPageTitle = driver.getTitle();   
	        return actualPassengerPageTitle;
	    }
	    
		public String getActualDepartureAirportName()
		{
			return driver.findElement(departureAirportfield).getText();
		}
		
		
		public int getPassengersSubtotalPrice()
		{
			return Integer.parseInt(driver.findElement(passengersSubtotalfield).getText().replace("£", "").replace(",", ""));
			
		}
		
		public void clickAccomodationSection() throws InterruptedException{
			Thread.sleep(5000);
	    	driver.findElement(accomodationSection).click();
	    	Thread.sleep(5000);
	    }
		
		public int getAccomodationNumberRequired() throws InterruptedException
		{
			Thread.sleep(5000);
			return Integer.parseInt(driver.findElement(numberRequired).getText());
		}
		
}

