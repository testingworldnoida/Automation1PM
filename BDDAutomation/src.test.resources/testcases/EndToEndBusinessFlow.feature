Feature: End to End Shoping flow

Scenario: TC_001 Test Login Search Add to Card Logout Scenario
Given user is on login page
When User enters username
And User enters password
And User clicks on signinbutton
Then User should be logged in
And  User should get welcome message
When User enter data into searchbox
And  User clicks on search button


