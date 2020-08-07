Feature: Login into Application
Scenario: Positive test validating login
Given initilize the browser with chrome
And Navigate to "http://qaclickacademy.com/" Site
And Click on Login link in homepage to land on Secure sign in page
When User enters "test99@gmail.com" and "123456" and logs in
Then Verify that user is successfully logged in