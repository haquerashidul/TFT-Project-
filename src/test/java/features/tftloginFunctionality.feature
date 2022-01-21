Feature: Login functionality 

Scenario Outline: User should be able to click the profile  Link 
Given user is in home page of the application 
When the user clicks on Profile
And enters valid username
And enters valid password
And select the checkbox Remember me
And clicks Login button 
Then user will be logged in
And will be able to see the name of the user 

Scenario: Negative login functionality test using both invalid credentilas
Given user is in home page of the application 
When the user clicks on Profile
And enters invalid username
And enters invalid password
And clicks Login button 
Then user will not be logged in
And user will be seeing login error message 


Scenario: Negative login finctionality test by not providing any data for username and password and clicking login button
Given user is in home page of the application 
When the user clicks on Profile
And does not enter any data for username
And does not enter any data for password
And click Login button
Then user will be seeing login error message Username is requried




