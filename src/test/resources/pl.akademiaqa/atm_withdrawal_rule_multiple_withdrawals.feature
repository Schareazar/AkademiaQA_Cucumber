Feature: ATM withdrawal, rule multiple withdraws
  User should be able to withdraw money, multiple times, from ATM

  Background:
  User has positive balance
    Given User has 1000 dollars in account

  Rule: Multiple withdraws

    Scenario:
    User can withdraw money multiple times.
      When User requests to withdraw 200 dollars
      And User requests to withdraw 300 dollars
      Then User can withdraw 500 dollars
      And 500 dollars should be new account balance
