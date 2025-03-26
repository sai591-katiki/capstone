Feature:
Scenario: To check the login,product search and add to cart functionalities
Given user opens the browser
And And navigate to the "https://magento.softwaretestingboard.com/" webpage
When user clicks on signin link
And user enters the Login credentials
|Logindata.xlsx|
And user clicks on sign in button
And user enters "shirts" in search box
And user selects "shirts for men" option
And user selects a product "Bella Tank" from the search result page
And user selects the size is "XS" 
And user selects the colour is "Black"
And user enters the quantity is "1"
And user click on Add to Cart button
Then user verifies the "You added Bella Tank to your shopping cart." message
And user closes the browser

