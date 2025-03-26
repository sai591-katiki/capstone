Feature:
Scenario: Adding Multiple Products to the Cart and Verify Cart
Given user opens the browser
And user navigates to the url "https://magento.softwaretestingboard.com/" webpage
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
And user enters "shirts" in search box
And user selects "shirts for men" option
And user selects a product "Radiant Tee" from the search result page
And user selects the size is "XS" 
And user selects the colour is "Blue"
And user enters the quantity is "1"
And user click on Add to Cart button
And user clicks on the shopping cart 
Then user verifies the selected items "Bella Tank"
And user verifies "Radiant Tee"
And user verifies the price is "$61.00"
