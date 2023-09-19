package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.textContextSetup;

public class homePage {
	public WebDriver driver;
	
	public homePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By searchCountry = By.id("searchtext_freetext_search_form");
	private By listCountries = By.xpath("//ul[@id='as_ul']//li/descendant::a//bdi"); 
	private By acceptCookies = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	
	
	
	public void acceptAllCookies()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(acceptCookies).click();
	}
	
    public String getHomePageTitle(){
        String actualHomePageTitle = driver.getTitle();   
        return actualHomePageTitle;
    }
    
    public void searchCountry(String countryName)
    {
    	driver.findElement(searchCountry).sendKeys(countryName);
    	List<WebElement> list = driver.findElements(listCountries);
		System.out.println("Total number of Lis :" + list.size());
		for(WebElement allLists:list)
		{
			System.out.println(allLists.getText());
			
			  if(allLists.getText().equals(countryName))
			  { 
				  allLists.click(); 
				  break;
			 }			 
		}

    }
    
    
    
}
