@orangetoolz

Feature: Visit the BulkSMS website - orangetoolz

  Background:
    Given I have to access the Deshboard page


  Scenario: Validate the successful login into the page - Specific Data
    When I enter a valid username "test@orangetoolz.com"
    And I enter a valid password 8Kh8nTe*^jdk
    And I click on the lOGIN CTA
    And I have to click on contact manager option
    And After that I have to click Add Member CTA
    Then I successfully login into the page

