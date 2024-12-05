Feature: ATM withdrawal scenario outline
  User should be able to withdraw money from ATM

  Scenario Outline:
  User should be able to withdraw money
    Given User has <AccountBalance> in account
    When User requests <RequestedAmount>
    Then User can withdraw <WithdrawalAmount>

    Examples: Positive balance
      | AccountBalance | RequestedAmount | WithdrawalAmount |
      | 1000           | 250             | 250              |
      | 100            | 100             | 100              |
      | 100            | 250             | 0                |
      | 0              | 5               | 0                |