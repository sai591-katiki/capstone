Feature:
Scenario Outline: To check the Registration Functionality
Given user opens the browser
And navigate to the "https://magento.softwaretestingboard.com/" webpage
When user clicks on the Create an Account link
When user enters '<First Name>' first name
And user enteres '<Last Name>' last name
And user enteres Invalid '<InvalidEmail>' Email
And user enteres '<Password>' password
And user enteres '<Confirm Password>' confirm password
And user clicks on Create an Account button
Then user verifies the '<error>' message appears under the email textbox
When user enters valid '<ValidEmail>' Email
And user clicks on Create an Account button
Then user verifies the thank you '<msg>' in next page
And close the browser
Examples:
|First Name|Last Name|InvalidEmail|Password|Confirm Password|error|ValidEmail|msg|
|katiki|sai|saikatiki|ece@1234|ece@1234|Please enter a valid email address (Ex: johndoe@domain.com).|saikatiki552@gmail.com|Thank you for registering with Main Website Store.|