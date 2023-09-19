Feature: I want to verify user login successfully
	
	Scenario: Login to application without Data Tables
		Given I launched chrome Browser and open application URL
			When user login into application with username "newtest" and password "Test@123"
				Then I verifyied that user logged in successfully
					And I verified the Title of the page
						And I signout the application
							And I verified that user sign out successfully
