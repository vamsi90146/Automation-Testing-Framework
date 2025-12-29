package com.company.project.automation.steps.debit;

import com.company.project.automation.pages.debit.DebitPage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class DebitSteps {

    @Autowired
    private DebitPage debitPage;

    @Given("user opens debit module")
    public void openModule() {
        debitPage.openDebitModule();
    }

    @When("user applies for a debit card")
    public void applyDebit() {
        debitPage.applyForDebitCard();
    }

    @When("user blocks debit card")
    public void block() {
        debitPage.blockCard();
    }

    @When("user unblocks debit card")
    public void unblock() {
        debitPage.unblockCard();
    }

    @When("user changes debit pin")
    public void changePin() {
        debitPage.changePin();
    }

    @When("user checks ATM withdrawal limit")
    public void atmLimit() {
        debitPage.checkAtmLimit();
    }

    @When("user performs POS transaction")
    public void posTxn() {
        debitPage.posTransaction();
    }

    @When("user performs online transaction")
    public void onlineTxn() {
        debitPage.onlineTransaction();
    }

    @When("user upgrades debit card")
    public void upgradeCard() {
        debitPage.upgradeCard();
    }

    @Then("debit module operation should succeed")
    public void validateSuccess() {
        debitPage.validateSuccess();
    }
}

