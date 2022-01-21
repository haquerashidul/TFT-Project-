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
Feature: Book An Appointment form and link Functionality
  As a user I should be able to make an appointment with Transfotech Academy

  Scenario Outline: Book an appointment link shoud be clickable and displayed for the user to fill out the information
    Given user is in homepage of the application
    When user clicks Book an Appointment link
    And user can provides all the requried details "<Firstname>", "<Lastname>","<Email>","<Phonenumber>","<Date>", "<Time>" & "<Message>"
    And Select the subjectbox
    Then clicks Send A Request button

    Examples: 
      | Firstname | Lastname | Email             | Phonenumber | Date       | Time    | Message |
      | John      | Smith    | test123@gmail.com |  1234567890 | 01/24/2022 | 01:30PM | Hello   |

  Scenario Outline: Verify if the user decided to cancel out from the Book an appointment form completing halfway and come back again
   ## This scenario failed because when the user comeback after completing halfway their private info remain in the form
    Given user is in homepage of the application
    When user clicks Book an Appointment link
    And user can provides all the requried details "<Firstname>", "<Lastname>","<Email>","<Phonenumber>","<Date>", "<Time>" & "<Message>"
    And Select the subjectbox
    Then clicks the X button to cancel out from the form
     Then user clicks  back again Book an Appointment link
      

    Examples: 
      | Firstname | Lastname | Email | Phonenumber | Date       | Time    | Message |
      | John      | Smith    |       |             | 01/28/2022 | 03:30PM | Hello   |

  Scenario Outline: Verify the behavior of the form just clciking Send A Request button
    Given user is in homepage of the application
    When user clicks Book an Appointment link
    Then clicks Send A Request button

  Scenario Outline: Verify if the user can input expired date to book an appointment 
  ## This secanrio should be fail. The application accepting the expired date when the user input date. There is defect in the application. 
    Given user is in homepage of the application
    When user clicks Book an Appointment link
    And user can provides all the requried details "<Firstname>", "<Lastname>","<Email>","<Phonenumber>","<Date>", "<Time>" & "<Message>"
    And Select the subjectbox
    Then clicks Send A Request button

    Examples: 
      | Firstname | Lastname | Email             | Phonenumber | Date       | Time    | Message |
      | John      | Smith    | test123@gmail.com |  1234567890 | 01/24/2020 | 01:30PM | Hello   |
    

