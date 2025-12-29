
package com.company.project.automation.core;

import com.microsoft.playwright.Page;

public class BasePage {
    protected Page page;
    public BasePage(Page p){ this.page = p; }
}
