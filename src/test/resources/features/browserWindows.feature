@windows
Feature: User can open a new window
  As a user
  I need to be able to open new windows
  So that I can access more content

  @newWin
  Scenario: User can navigate to new window
    Given I am on the browser windows page
    When I click on the new window link
    Then a new window should open

  @newTab
  Scenario: User can open a new tab
    Given I am on the browser windows page
    When I click on the new tab link
    Then a new tab should open in the browser

  @newWinMsg
  Scenario: User can open a new window message
    Given I am on the browser windows page
    When I click on the new window message link
    Then a new window message should open