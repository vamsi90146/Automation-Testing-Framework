package com.company.project.automation.pages.debit;

import com.company.project.automation.core.BasePage;
import com.company.project.automation.core.PlaywrightManager;
import org.springframework.stereotype.Component;

@Component
public class DebitPage extends BasePage {

    public DebitPage(PlaywrightManager manager) {
        super(manager.getPage());
    }

    private final String debitModuleBtn = "#debit-module";
    private final String applyBtn = "#apply-debit-card";
    private final String blockBtn = "#block-debit-card";
    private final String unblockBtn = "#unblock-debit-card";
    private final String changePinBtn = "#change-debit-pin";
    private final String atmLimitBtn = "#atm-limit";
    private final String posBtn = "#pos-transaction";
    private final String onlineTxnBtn = "#online-transaction";
    private final String upgradeCardBtn = "#upgrade-debit-card";
    private final String successMsg = "#success";

    public void openDebitModule() {
        page.click(debitModuleBtn);
    }

    public void applyForDebitCard() { page.click(applyBtn); }
    public void blockCard() { page.click(blockBtn); }
    public void unblockCard() { page.click(unblockBtn); }
    public void changePin() { page.click(changePinBtn); }
    public void checkAtmLimit() { page.click(atmLimitBtn); }
    public void posTransaction() { page.click(posBtn); }
    public void onlineTransaction() { page.click(onlineTxnBtn); }
    public void upgradeCard() { page.click(upgradeCardBtn); }

    public void validateSuccess() {
        page.waitForSelector(successMsg);
    }
}

