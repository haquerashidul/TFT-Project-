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

Feature: Facebook icon functionality 

Scenario Outline: User should be able to click the facebook icon Link
Given user home page of the application 
When the user clicks on Facebook icon 
Then new window open on facebook page with Transofotech Academy informations

Scenario: User should be able to click the Linkedin icon Link
Given user home page of the application 
When the user clicks on Linkedin icon 
Then new window open on Linkedin page with Transofotech Academy informations

Scenario: User should be able to click the Youtube icon Link
Given user home page of the application 
When the user clicks on Youtube icon 
Then new window open on Youtube page with Transofotech Academy informations







