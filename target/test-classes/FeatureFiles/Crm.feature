Feature: Test CRM application

  Background: 
    Given Open CRM application

  Scenario: Test for signIn functionality
    When I click on SignIn link
    Then SignIn page should open

  Scenario: Test for Login functionality with valid data
    When I enter valid emailid "test@gmail.com" and valid password "test123"
    And I click on Submit button
    Then I should be able to login and It should navigate to Customers page

  Scenario: Test for signOut functionality
  	Given User should be login
    When I login into application click on Signout link
    Then I should able to logout
