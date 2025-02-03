Feature: ATM withdrawal
  User should be able to withdraw money from ATM

  Background:  User has positive balance
    Given User has positive balance in accounts
      | saving account   | 50 |
      | debit account    | 50 |
      | personal account | 50 |

  Scenario:  User has positive account balance so he should be able to withdraw money.
    When User requests 250 dollars from ATM
    Then User can withdraw 250 dollars
    And 750 dollars should be new account balance

  Scenario:  User can withdraw all the money from account.
    When User requests 1000 dollars from ATM
    Then User can withdraw 1000 dollars
    And 0 dollars should be new account balance
