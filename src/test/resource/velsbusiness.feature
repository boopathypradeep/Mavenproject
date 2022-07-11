Feature: CURD operation API RestAssured automation script from shipping address module
Scenario: verify the user able to login the greens ecommerce application
When user add header key "Content-Type" and value "application/json"
And user enters authentication username "boopathypradeepr@gmail.com" and password "Boopathy@9"
And user sends the post http request
And verify the status code 
Then user should verify the login with message ".Login successfully"
 
Scenario: validating the user can add address in greens application
When user adds the header key "Content-Type" and value "application/json" and adds authentication key "Authorization" and value "Bearer "
And user adds the response body
And user sends the request
And verify the status code and verify 
Then the new address is created

Scenario: validating the user can update the address
When user add the header key "Content-Type" and value "application/json" and adds authentication token key "Authorization" and value "Bearer "
And user adds  response body 
And user sends request methods
Then verify the message and status code address is successfully updated

Scenario: validating the user get the address 
When user add the header key "Content-Type" and values "application/json" and adds authentication token key "Authorization" and value "Bearer "
And user gives the request body
And user send request methods
Then verify the message and status code address is successfully get
 
Scenario: validating the user delete the address
When user added the header key "Content-Type" and values "application/json" and adds authentication token key "Authorization" and value "Bearer "
And adds the request methods
And user sendss request methods
Then verify the messages and status code address is successfully get