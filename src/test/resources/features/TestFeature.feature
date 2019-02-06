@tag
Feature: Test feature

  Scenario: search for socks
    Given that i am on the amazon website
    When i enter 'socks' in search
    And i submit search
    And i click on the first item listed
    Then i can validate that I am on the selected item page