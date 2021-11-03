Feature: TO Validate FaceBook Login Page
Scenario: To Validate Login With Invalid Username and Password
Given The user should launch the chrome browser
When The user should type the url
And The user sholud maximize the window
And The user should type the invalid username and passward
And The user should click the login button
And The user should get title of incorrect credential page
Then The user should navigate to the incorrect credential page
