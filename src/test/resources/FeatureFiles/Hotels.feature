@americanairlines @regression
Feature: Users ability to choose hotel

Scenario: User should able to choose hotel using plan travel

	Given Browse to AmericanAirlines homepage
	When Click on Plan Travel 
	And  Click on hotels
	And  navigate to hotelBooking page
	And  Select city where you like to go 
    And  Click on calender 
	And Click Check in date
	And Click Check out date
	Then   Click Search
	
         
	