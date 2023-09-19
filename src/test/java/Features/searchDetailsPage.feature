Feature: Verify homepage title, then search India and book the order



Scenario: Search country India and verify departure date error message

    Given User is on mailTravel home page
    And   User accepts cookies
    When  User search for country "India"
    Then  User redirects to search details page
    When  User click Book Online button without selecting departure date
    Then  Text "Please select your departure date" should be displayed 
    And   User scroll to the bottom of the page
    And   Select next available date and select two adults
    Then  Verify price for two adults
    And   User make note of departure airport and price and selected adults 
    And   User click Book Online button
    Then  User redirects to passengers page
    And   User expands Departure & Passengers section
    Then  verify the adults count
    And   verify that departure airport name should be "London Heathrow (LHR)"
		When  User expands Accomodation section
		Then  Verify the number required is 1
		And   User selects first adult title "<title>"
		And   User selects first adult birth date <birthdate>
		And   User selects first adult birth month <birthmonth>
		And   User selects first adult birth year <birthyear>
		And   User enters first adult firstname "<firstName>"	
		And   User enters first adult lastname "<lastName>"	
		And   User selects second adult title "<title>"
		And   User selects second adult birth date <birthdate>
		And   User selects second adult birth month <birthmonth>
		And   User selects second adult birth year <birthyear>
		And   User enters second adult firstname "<firstName>"	
		And   User enters second adult lastname "<lastName>"	
		And   User enters leads name "leadName"	
		And   User enters leads mobile number '0987654321'	
		And   User enters leads email "email@gmail.com"e
		And   User enters leads address line1 "London"
		And   User enters leads address line2 "London"	
		And   User enters leads city "London"
		And   User selects hear about us 2		


Examples:
	|title |birthdate |birthmonth |birthyear |firstName |lastName |
	|Mr |12  |2 |19|first |last |

    
    
