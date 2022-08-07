Feature: Test of Numberic Values Functionality
Scenario: Checking that validation of numeric data
Given Browser with no verifications
When user selects a product and add it into cart
Then user clicks on cart
And user clicks on placed order
And Enter data in numeric field - “credit card “ using alphabets 