Feature: Test google application

  Background: 
    Given Open Google application

  Scenario: Test for google page title
    When I capture current title of google and compares with expected title
    Then Google page title should be Google

  Scenario: Test for search functionality with valid keyword
    When I search with valid keyword
    Then Google search should display valid result
