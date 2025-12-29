package com.company.project.automation.pages.credit;

import com.company.project.automation.core.BasePage;
import com.company.project.automation.core.PlaywrightManager;
import com.microsoft.playwright.Page;
import org.springframework.stereotype.Component;

@Component
public class CreditPage extends BasePage {

    public CreditPage(PlaywrightManager manager) {
        super(manager.getPage());
    }

    // Locators
    private final String creditModuleBtn = "#credit-module";
    private final String applyBtn = "#apply-credit-card";
    private final String limitUpgradeBtn = "#credit-limit-upgrade";
    private final String statementBtn = "#download-credit-statement";
    private final String emiBtn = "#convert-to-emi";
    private final String addressUpdateBtn = "#update-credit-address";
    private final String disputeBtn = "#raise-credit-dispute";
    private final String rewardsBtn = "#check-credit-rewards";
    private final String closeCardBtn = "#close-credit-card";
    private final String successMsg = "#success";

    // Step functions
    public void openCreditModule() {
        page.click(creditModuleBtn);
    }

    public void applyForCreditCard() {
        page.click(applyBtn);
    }

    public void upgradeLimit() {
        page.click(limitUpgradeBtn);
    }

    public void downloadStatement() {
        page.click(statementBtn);
    }

    public void convertToEmi() {
        page.click(emiBtn);
    }

    public void updateAddress() {
        page.click(addressUpdateBtn);
    }

    public void raiseTransactionDispute() {
        page.click(disputeBtn);
    }

    public void checkRewards() {
        page.click(rewardsBtn);
    }

    public void closeCard() {
        page.click(closeCardBtn);
    }

    public void validateSuccess() {
        page.waitForSelector(successMsg);
    }
}
