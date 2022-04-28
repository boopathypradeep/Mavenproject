Feature: validate the creation of order id in adactinhotel application
Scenario Outline: validate the login functionality of adactin login page
Given user is on login page of adactin login page in chrome browser
When user enters valid "<username>" and valid "<password>"
And user should click login button
When user enters "<location>","<hotel>","<roomtype>","<numberofrooms>","<checkindate>","<checkoutdate>","<adultsperroom>","<childrenperroom>"
And user clicks search button
When user clicks on select button
And user should click continue
When user should enters "<firstname>","<lastname>","<billingaddress>","<creditcardno>","<creditcardtype>","<expirymonth>","<expiryyear>","<cvvnumber>" 
And user should click booknow button
When user clicks my itinery button
When user clicks order id 
And user clicks search hotel
Then order id should be created







 Examples: 
|username|password|location|hotel|roomtype|numberofrooms|checkindate|checkoutdate|adultsperroom|childrenperroom|firstname|lastname|billingaddress|creditcardno|creditcardtype|expirymonth|expiryyear|cvvnumber|
|BoopathyPradeep|Boopathy@9|Melbourne|Hotel Hervey|Deluxe|3|25/04/2022|27/04/2022|6|7|Aravindh|subramaniam|karur|9876543223456567|VISA|8|2021|786|