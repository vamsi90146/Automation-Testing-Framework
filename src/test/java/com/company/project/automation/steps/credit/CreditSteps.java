package com.company.project.automation.steps.credit;

import com.company.project.automation.pages.credit.CreditPage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class CreditSteps {

    @Autowired
    private CreditPage creditPage;

    @Given("user opens credit module")
    public void openModule() {
        creditPage.openCreditModule();
    }

    @When("user applies for a credit card")
    public void applyForCard() {
        creditPage.applyForCreditCard();
    }

    @When("user upgrades credit limit")
    public void upgradeLimit() {
        creditPage.upgradeLimit();
    }

    @When("user downloads credit card statement")
    public void downloadStatement() {
        creditPage.downloadStatement();
    }

    @When("user converts transaction to EMI")
    public void emiConversion() {
        creditPage.convertToEmi();
    }

    @When("user updates credit card address")
    public void updateAddress() {
        creditPage.updateAddress();
    }

    @When("user raises credit card dispute")
    public void raiseDispute() {
        creditPage.raiseTransactionDispute();
    }

    @When("user checks credit rewards")
    public void checkRewards() {
        creditPage.checkRewards();
    }

    @When("user closes credit card")
    public void closeCard() {
        creditPage.closeCard();
    }

    @Then("credit module operation should succeed")
    public void validateSuccess() {
        creditPage.validateSuccess();
    }
}

