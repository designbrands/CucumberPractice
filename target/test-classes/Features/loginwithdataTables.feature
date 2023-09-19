Feature: I want to verify user login successfully
	
	Scenario Outline: Login with datatables Examples keyword
		Given I launched chrome Browser and open application
			When user login into application with <Username> and <Password>
				Then I then verified that user <Username> logged in successfully
					And I then verified Title of the page
						And I signout from the application
							And Verified that user sign out from the application
					
					Examples:
							|Username |Password |
							|newtest  |Test@123 |
							|newtest1 |Test@123 |