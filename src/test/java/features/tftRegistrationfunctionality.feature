#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Registration functionality
  New user will be able to register to the application

  Scenario Outline: Positive registration functionality
    Given user is in dashboard page of the application
    When user provides all the requried details "<Email>", "<Username>", "<Password>", "<ConfirmPassword>", "<Firstname>", "<Lastname>" & "<Displayname>"
    And Select the checkbox
    And clicks Register button
    Then user should be able to register

    Examples: 
      | Email               | Username  | Password  | ConfirmPassword | Firstname | Lastname | Displayname |
      | test12345@gmail.com | test12345 | test12345 | test12345       | Tom       | Hank     | Tom Hank    |
      | test12345mail.com   |           | test12345 | test12345       |           | Hank     |             |
      | test12345@gmail.com | test12345 |           | test12345       | Tom       |          | Tom         |
