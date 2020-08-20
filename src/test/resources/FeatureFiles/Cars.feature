@americanairlines @regression
Feature: Users ability to reserve a car 

Scenario Outline: User should able to reserve a car 

	Given Browse to American Airlines homepage
	When Navigate Plan Travel
	And Click on Cars
	And Fill form with valid info
	And Click on Search
	And Clicks on Select
	Then Customer can see the total price
	
	Examples:
	|Compnay|
	|Avis|
	