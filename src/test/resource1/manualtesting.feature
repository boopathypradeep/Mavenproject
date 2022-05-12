Feature: Validate the password field of new application
Scenario Outline: validate the password field with valid password and valid username
Background: user is on the login page of application on chrome browser
When user enters the valid username in username field
And user enters the valid password in password field
And clicks the login button 
Then error message should appear
Given user should be on the search page of adactin hotel application
When user selects the "<location>","<hotel>","<roomtype>","<numberofrooms>","<checkindate>","<checkoutdate>","<adults>","<children>"
And user clicks on search button
Then user should be successfully search hotel
Given user should be on the select hotel page of adactin hotel application
When user clicks the select button
And user clicks the continue button
Then user should be able to navigate book a hotel page
Given user should be on the book a hotel page
When user enters the first name
And user enters the last name 
And user enters the billing address
And user enters the credit card number
And user enters the credit card type
And user enters the expiry date
And user enters the cvv number
And user clicks the book now button
Then user should be successfully enter to booking confirmation page
When user clicks on the button my itinerary
Then booked itinerary page will be displayed
When user clicks order id button
And user clicks cancel selected
And user should click ok on alert 
And user should click search hotel button
Then adactin hotel application is successfully validated
Examples: 
|location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adults|children|
|New York|Hotel Sunshine|Super Deluxe|2|29\04\2022|01\05\2022|2|3|