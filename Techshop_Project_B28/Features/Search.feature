Feature: Search items in application

Background: User can Login using the correct username and password

Given User opens the browser
And User navigates to "https://www.smarttechqa.com"  
When User clicks on the Sign In button
And User Enters the email
And User Enters the password
And User clicks on the login in button
Then The user is successfully logged in and username is displayed
And User is navigated to home page

Scenario: User is able to search for an item using the search box

When User enters the keywords "airpods" 
And The user clicks on the Search button
And The user clicks on the item
Then The user is navigated to the "airpods" item page

