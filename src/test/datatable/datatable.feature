
Feature: to validate the login function of facebook 
Scenario: validating the login functionality using valid username and valid password
Given user is on the login page of the facebook on chrome browser
When user enters the valid username and valid password
|username|
|password|
And user clicks enter button
Then user should enter the login application successfully 