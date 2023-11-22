@All
Feature: Test Amazon application

  Background: 
    Given Open Amazon application

  @homepage
  Scenario: Test amazon homepage title
    When I get the current title for homepage
    Then Title should be valid for homepage

  #@BestSeller
  @ignore
  Scenario: Test BestSellers Pagetitle
    When I am on bestseller page
    When I get the current title for bestsessler
    Then title should be match for bestsesser

  #@Mobiles
  @ignore
  Scenario: Test Mobiles page title
    When I am on Mobile page
    When I get the current title for mobile
    Then title should be match for mobile
