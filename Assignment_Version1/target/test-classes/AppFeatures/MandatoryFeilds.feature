Feature: Test of Mandatory Functionality
Scenario: Check that all mandatory fields are marked with * 
Given Browser with no verifications
When user selects a product and add it into cart
Then user clicks on cart
And user clicks on placed order
And Mandatory fields are not marked 
And user fills registration form and clicks submit
