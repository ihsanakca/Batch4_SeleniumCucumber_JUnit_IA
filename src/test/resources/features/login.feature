@login @regression
Feature: Login Functionality
  # User Story= Feature:

#  Background:
#    Given The user is on the login page

  @user @wip
  Scenario: Login as user
    # Test Case = Scenario
    Given The user is on the login page
    # Test Steps = Given, When, Then etc...
    When The user logs in with Melih's credentials
    Then The user should be able to login

  @user @wip
  Scenario: Login as user
    Given The user is on the login page
    When The user logs in with Rosa's credentials
    Then The user should be able to login
