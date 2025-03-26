Feature:
Scenario Outline: To check the Login Functionality
Given user opens the browser
And navigate to the "https://magento.softwaretestingboard.com/" webpage
When user clicks on signin link
And user enteres '<Email>' email
And user enteres wrong '<InvalidPassword>' password
And user clicks on sign in button
Then user verifies the error message '<error>' appears
When user enters correct '<ValidPassword>' password
And user clicks on sign in button
And users verifies '<MyAccount>' is displayed after successful sign in
And close the browser
Examples:
|Email|InvalidPassword|error|ValidPassword|MyAccount|
|saikatiki3@gmail.com|ece@123|The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.|ece@1234|Home Page|


