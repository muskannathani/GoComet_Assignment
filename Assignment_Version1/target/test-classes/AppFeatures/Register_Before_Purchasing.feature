Feature: Test of Registration before purchasing Functionality
Scenario: Checking whether the user needs to be registered before purchasing a product 
Given Browser with no verifications
When user selects a product and add it into cart
Then user clicks on cart
And user clicks on placed order
And user fills registration form 
And user clicks submit button