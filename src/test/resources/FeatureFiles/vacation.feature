@americanairlines @regression
Feature: vacation

Scenario: Users  should able to select vaction package


  
 
 Given Browse to AmericanAirlines homepage
 When Navigate to Plan Travel
 And Navigate to Vacations
 And Fill form with info
 And Select desired package
 And Select a room
 And Click continue
 Then Log in Message pops up
  

