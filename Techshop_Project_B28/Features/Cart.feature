Feature: User is able to add items to cart

Background: User should login before performing each scenario
Given User opens the browser
And User navigates to "https://www.smarttechqa.com"  
When User clicks on the Sign In button
And User Enters the email
And User Enters the password
And User clicks on the login in button
Then The user is successfully logged in and username is displayed
And User is navigated to home page

#Handle dynamic object and handle drop down
Scenario: User clicks on an item from the homepage and adds the item to the cart
When User clicks on the first item
And User selects the quantity
And User clicks on Add to Cart button
Then the correct quantity is displayed

#Handle Mouse Hover
Scenario: User can hover over their username
Given User clicks on the profile
When User hovers over their profile

