Feature: ATM withdrawal rule locked account
  User should be able to withdraw money, from ATM, but not when his account is locked

  Background:
  User has positive balance
    Given User has 1000 dollars in account
    But User's account is locked

  Rule: Locked account

    Scenario:
    User has positive balance, but his account is locked
      When User requests to withdraw 100 dollars
      Then User can't withdraw any money
      And User's account should be still locked
      And User's account balance should not change