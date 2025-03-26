Feature:
Scenario: To check the Sign Out Process functionality
Given user opens the browser
And And navigate to the "https://magento.softwaretestingboard.com/" homepage
When user clicks on signin link
And user enters the Login credentials
|Logindata.xlsx|
And user clicks on login button
When user click on that menu icon
And user clicks on the sign out option
Then user verifies that the session ends "You are signed out" and redirected to homepage 
And close the browser
