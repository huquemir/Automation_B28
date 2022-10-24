Feature: User should be able to go to reports page

Background: User should login before performing each scenario
Given User opens the browser
And User navigates to "https://www.smarttechqa.com"  
When User clicks on the Sign In button
And User Enters the email
And User Enters the password
And User clicks on the login in button
Then The user is successfully logged in and username is displayed
And User is navigated to home page
Given User clicks on the profile
And User clicks on Reports button

#Uploading a file
Scenario: User should be able to click on the upload button

When User uploads a file
Then The attribute "input" is displayed


#Alert handling
Scenario: User should be able to handle alert with Ok button

When User clicks on Upload button
And User Enters Name and User clicks on Ok button
Then Message "Thanks for uploading Hello" is displayed

Scenario: User should be able to handle alert by cancelling

When User clicks on Upload button
When User cancels the alert
Then Message "User cancelled the prompt." is displayed on screen

