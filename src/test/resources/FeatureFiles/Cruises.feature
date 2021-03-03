@americanairlines @regression
Feature: Cruises

Scenario: User should able to Select a cruise

Given Browse to AmericanAirlines homepage
When Navigate to Plan Travel
And Navigate to Cruises
And Navigate to Cruise lines
And Select Cruise
And Select View Itinerary
And Select Sailing Date
And Fillup Basic Information
And Select Room
Then User can see the total price