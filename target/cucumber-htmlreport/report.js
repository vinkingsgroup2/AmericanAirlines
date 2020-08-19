$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Bags.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to Carry on bags",
  "description": "",
  "id": "users-ability-to-carry-on-bags",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@americanairlines"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 4013585600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Users  should able to Carry on bags using Travel information",
  "description": "",
  "id": "users-ability-to-carry-on-bags;users--should-able-to-carry-on-bags-using-travel-information",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Browse to AmericanAirlines homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Travel information",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on Bags",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Carry on bags",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelsStepDef.browse_to_AmericanAirlines_homepage()"
});
formatter.result({
  "duration": 5946451800,
  "status": "passed"
});
formatter.match({
  "location": "BagsStepDef.click_on_Travel_information()"
});
formatter.result({
  "duration": 619393000,
  "status": "passed"
});
formatter.match({
  "location": "BagsStepDef.click_on_Bags()"
});
formatter.result({
  "duration": 310103600,
  "status": "passed"
});
formatter.match({
  "location": "BagsStepDef.carry_on_bags()"
});
formatter.result({
  "duration": 3662803500,
  "status": "passed"
});
formatter.after({
  "duration": 1822850200,
  "status": "passed"
});
formatter.uri("Hotels.feature");
formatter.feature({
  "line": 2,
  "name": "Users ability to choose hotel",
  "description": "",
  "id": "users-ability-to-choose-hotel",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@americanairlines"
    },
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 3023724600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to choose hotel using plan travel",
  "description": "",
  "id": "users-ability-to-choose-hotel;user-should-able-to-choose-hotel-using-plan-travel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Browse to AmericanAirlines homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click on Plan Travel",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on hotels",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "navigate to hotelBooking page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Select city where you like to go",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click on calender",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click Check in date",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click Check out date",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click Search",
  "keyword": "Then "
});
formatter.match({
  "location": "HotelsStepDef.browse_to_AmericanAirlines_homepage()"
});
formatter.result({
  "duration": 6600876500,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_on_Plan_Travel()"
});
formatter.result({
  "duration": 204872100,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_on_hotels()"
});
formatter.result({
  "duration": 241408600,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.navigate_to_hotelBooking_page()"
});
formatter.result({
  "duration": 10052047100,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.select_city_where_you_like_to_go()"
});
formatter.result({
  "duration": 103413400,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_on_calender()"
});
formatter.result({
  "duration": 66812000,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_Check_in_date()"
});
formatter.result({
  "duration": 89953000,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_Check_out_date()"
});
formatter.result({
  "duration": 63231100,
  "status": "passed"
});
formatter.match({
  "location": "HotelsStepDef.click_Search()"
});
formatter.result({
  "duration": 8800266600,
  "status": "passed"
});
formatter.after({
  "duration": 787199600,
  "status": "passed"
});
});