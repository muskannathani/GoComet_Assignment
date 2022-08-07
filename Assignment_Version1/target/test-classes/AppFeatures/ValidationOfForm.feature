Feature: Test of Validation of data Functionality
Scenario: Checking that validation of data entered by user is done 
Given Browser with no verifications
When user selects a product and add it into cart
Then user clicks on cart
And user clicks on placed order
And user fills registration form and clicks submit
And Data not entered in the form gives error