@login @regression

Feature: Webdriver University - Login Page

  Background:
    Given I have to access the login page

  Scenario: Validate Successful Login - Specific Data
    When I enter a specific username "webdriver"
    And I enter a correct password webdriver123
    And I click on the login CTA
    Then I should be successful logged in message

  Scenario: Validate Unsuccessful Login - Specific Data
    When I enter a specific username "webdriver"
    And I enter a correct password webdriver12
    And I click on the login CTA
    Then I should be Unsuccessful logged in message

  Scenario Outline: Validation login successful and Unsuccessful
    When I enter a username <username>
    And I enter a password <password>
    And I click on the login CTA
    Then I should be following validation message <loginValidationMessage>

    Examples:
      | username   | password     | loginValidationMessage |
      | webdriver  | webdriver123 | validation succeeded   |
      | webdriver  | webdriver12  | validation failed      |
      | minhazsami | webdriver123 | validation failed      |