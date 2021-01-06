Feature: User can register an account
  As a user
  I need to be able to register an account
  So that I can buy products

  Scenario: User can register using valid data
    Given I am on the forms page
    When I enter the required data into the form
    Then I should be successfully registered