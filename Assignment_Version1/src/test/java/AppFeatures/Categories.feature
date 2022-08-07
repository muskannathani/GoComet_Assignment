Feature: Test of Categories Functionality
Scenario: Check that all category pages have relevant products
Given Browser with no verifications
When user selects a mobile category product
Then Mobile Products list displayed
When user selects a laptop category product
Then Laptop Products list displayed
When user selects a monitors category product
Then Monitors Products list displayed

