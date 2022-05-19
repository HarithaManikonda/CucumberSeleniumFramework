Feature: check homepage functionality

Background: User is logged in
Given usee is on log in page
When user enters username and password
And clicks on login button
Then the user is navigated to the homepage

Scenario: check logout link
	When user click on welcome link
	Then logout link is displayed
	
Scenario: verify quick launch tool bar is present
	When user click on dashboard link
	Then qucik launch bar toolbar is displayed