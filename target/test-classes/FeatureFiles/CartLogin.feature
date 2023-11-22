Feature: Cart Login test

  Scenario: Test open cart login with valid credentials
    Given User is on Login page
    When User enter valid credentials
      | email             | pas     |
      | sarangW@gmail.com | test123 |
    When user click on submit button
    Then User should be able to login into opencart
