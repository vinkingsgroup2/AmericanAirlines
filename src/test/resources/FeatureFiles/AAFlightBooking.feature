@americanairlines @regression
Feature: User ability to booking a ticket

Scenario Outline: User should able to booked a ticket
    Given Browes American Airlines home page
    When Click on the Plan Travel menu
    And Click on the flight option
    And Put the departing city
    And Put the arriving city
    And Select depart date
    And Select depart time
    And Select return date
    And Select return time
    And Select passenger number <PassengerNo>
    And Select passenger age
    And Search the fare
  	And Select the class
    Then Select the Airlines
    Then Click the search button

    Examples: 
      | PassengerNo |
      |           1 |