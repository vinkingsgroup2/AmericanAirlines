@regression 
Feature: Log in

Scenario: User should able to log in

	Given Browse to American Airlines homepage
	When Navigate to log in
	And  Fill form 
	Then click on Login