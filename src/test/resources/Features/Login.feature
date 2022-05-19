Feature: feature to test login functionality

@smoke
Scenario: Check login is sucessful with valid credentials

Given user is on login
When user enters username and password
And clicks on login button
Then user is navigated to login page


    
  
