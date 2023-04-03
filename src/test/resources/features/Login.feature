@login

Feature: Webdriver University - Login Page

  Scenario: Validate Successful Login - Specific Data
    Given I have to access the login page
    When I enter a specific username "webdriver"
    And I enter a correct password webdriver123
    And I click on the login CTA
    Then I should be successful logged in message

  Scenario: Validate Unsuccessful Login - Specific Data
    Given I have to access the login page
    When I enter a specific username "webdriver"
    And I enter a correct password webdriver12
    And I click on the login CTA
    Then I should be Unsuccessful logged in message