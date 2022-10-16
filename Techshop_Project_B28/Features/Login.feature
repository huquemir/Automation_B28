@smoke
Feature: Testing Login functionality to the application
#Comment

#Background: Optional. You have to put all the common steps 
#Description: What is in the requirement

Background: User can Login using the correct username and password

Given User opens the browser
And User navigates to "https://www.smarttechqa.com"  
When User clicks on the Sign In button
And User Enters the email
And User Enters the password
And User clicks on the login in button
Then The user is successfully logged in and username is displayed
And User is navigated to home page


Scenario: User is able to search the products
Description: This scenario tests how to search for products
When User clicks on the Search Box and Searches for "iphone 11"
And User clicks on the Search Button
Then User can search for the "iphone" item


Scenario: User is able to click on the latest products from the home page
Description: This scenario checks the latest product
When User clicks on the latest product from the homepage
Then User is able to view the item

Scenario: User is able to click on the cart button
When User clicks on the cart button
Then User is navigated to the Cart Page
Then I can validate user payment

Scenario: This is a scenario without a given or when
Then I want to check user is able to pay for the item
