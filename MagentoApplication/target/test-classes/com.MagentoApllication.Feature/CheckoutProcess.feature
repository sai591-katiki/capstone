Feature:
Scenario: To check the Checkout Process functionality
Given user opens the browser
And And navigate to the "https://magento.softwaretestingboard.com/" homepage
When user clicks on sign in link
And user enters the Login credentials
|Logindata.xlsx|
And user clicks on the cart symbol
And user clicks on the Proceed to Checkout button
When user enters the invalid shipping details
|InvalidShippingDetails.xlsx|
Then user verifies the error message appears
When user enters the valid shiiping details
|ValidShippingDetails.xlsx|
And user clicks on NEXT button
And user clicks on Place Order button
Then user verifies the status of the order
And close the browser
