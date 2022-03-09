Feature: Home Page 


@Test
Scenario: Verify User Can Login
Given Open Application "<URL>"
Then Click on Login button
Then Enter user name and password
Then Click on login button
Then Verify User Can Login