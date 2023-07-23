@login @regression
Feature: Login Functionality
  # User Story= Feature:

  Background:
    Given The user is on the login page

  @user
  Scenario: Login as user
    # Test Case = Scenario
#    Given The user is on the login page
    # Test Steps = Given, When, Then etc...
    When The user logs in with Melih's credentials
    Then The user should be able to login

  @admin @smoke @manager
  Scenario: Login as admin
#    Given The user is on the login page
    When The user logs in with Semih's credentials
    Then The user should be able to login

  @specialist
  Scenario: Login as specialist
#    Given The user is on the login page
    When The user logs in with Mehmet's credentials
    Then The user should be able to login