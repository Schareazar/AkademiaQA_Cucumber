package pl.akademiaqa.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ATMWithdrawalSteps {

    @Given("User has {int} dollars in account")
    public void user_has_dollars_in_account(Integer int1) {
    }
    @When("User requests {int} dollars from ATM")
    public void user_requests_dollars_from_atm(Integer int1) {
    }
    @Then("User can withdraw {int} dollars")
    public void user_can_withdraw_dollars(Integer int1) {
    }
    @Then("{int} dollars should be new account balance")
    public void dollars_should_be_new_account_balance(Integer int1) {
    }
}
