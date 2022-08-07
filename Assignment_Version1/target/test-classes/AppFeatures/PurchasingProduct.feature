Feature: Test of Purchasing the product Functionality
Scenario: Verify whether user can purchase the product in the cart after successfully entering name and credit card details 
Given Browser with no verifications
When user selects a product and add it into cart
Then user clicks on cart
And user clicks on placed order
And user fills registration form and clicks submit
And Order Placed Successfully
