Feature: Opencart application test

  Scenario: Test Register feature
    Given Open Opencart application
    When user open register page
    When user enters all the required field
      | fname  | lname | email            | tel        | pas     | cpas    |
      | SarangW | Shah  | sarangW@gmail.com | 9878666996 | test123 | test123 |
    When user click yes radio button
    When user check privacy policy
    When User click on Continue button
    Then User should be able to register into open cart application
