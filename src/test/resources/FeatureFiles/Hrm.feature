Feature: Test Orangehrm application

  Scenario Outline: Test Login with multiple set of data
    Given Open orangehrm application
    When User enter valid username "<UN>"  and Valid password "<PSW>"
    When User click on Login button from Hrm
    Then User should be login for only valid data set

    Examples: 
      | UN    | PSW      |
      | Admin | admin123 |
      | Jhon  | test123  |
      | Admin | admin123 |
