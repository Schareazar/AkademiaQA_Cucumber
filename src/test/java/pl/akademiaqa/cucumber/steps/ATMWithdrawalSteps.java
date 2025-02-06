package pl.akademiaqa.cucumber.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pl.Gdy;
import io.cucumber.java.pl.Wtedy;
import io.cucumber.java.pl.Zakładającże;
import pl.akademiaqa.dto.AccountDTO;

import java.util.List;

public class ATMWithdrawalSteps {

//Cucumber expression
    @Given("User has {int} dollars in account(s)/bank")
    public void user_has_dollars_in_account(Integer int1) {
        System.out.println("Dollars in account " + int1);
    }

    @Given("User has positive balance in accounts")
    public void user_has_positive_balance_in_accounts(List<AccountDTO> accounts) {

        for (AccountDTO account:accounts)
        {
            System.out.println(account.getAccountName() + " " + account.getAccountBalance());
        }
    }
//Regular expression
//    @Given("^User has (\\d+) dollars in (?:account|accounts|bank)$")
//    public void user_has_dollars_in_account(Integer int1) {
//        System.out.println("Dollars in account " + int1);
//    }

    @When("User requests {int} dollars from ATM/bank")
    public void user_requests_dollars_from_atm(Integer int1) {
        System.out.println("Dollars requested " + int1);
    }
    @Then("User can withdraw {int} dollars")
    public void user_can_withdraw_dollars(Integer int1) {
        System.out.println("Dollars withdrawn " + int1);
    }
    @Then("{int} dollars should be new account balance")
    public void dollars_should_be_new_account_balance(Integer int1) {
        System.out.println("Updated account balance " + int1);
    }

    @When("User sends confirmation letter")
    public void user_sends_confirmation_letter(String docString) {
        System.out.println(docString);
    }

    @Given("User's account is locked")
    public void user_s_account_is_locked() {
    }
    @When("User requests to withdraw {int} dollars")
    public void user_requests_to_withdraw_dollars(Integer int1) {
    }
    @Then("User can't withdraw any money")
    public void user_can_t_withdraw_any_money() {
    }
    @Then("User's account should be still locked")
    public void user_s_account_should_be_still_locked() {
    }
    @Then("User's account balance should not change")
    public void user_s_account_balance_should_not_change() {
    }

    @Zakładającże("użytkownik posiada {int} złotych na koncie")
    public void użytkownik_posiada_złotych_na_koncie(Integer int1) {
    }
    @Gdy("użytkownik spróbuje wypłacić {int} złotych z bankomatu")
    public void użytkownik_spróbuje_wypłacić_złotych_z_bankomatu(Integer int1) {
    }
    @Wtedy("bankomat wypłaci {int} złotych użytkownikowi")
    public void bankomat_wypłaci_złotych_użytkownikowi(Integer int1) {
    }
    @Wtedy("saldo konta zmieni się na {int} złotych")
    public void saldo_konta_zmieni_się_na_złotych(Integer int1) {
    }

}
