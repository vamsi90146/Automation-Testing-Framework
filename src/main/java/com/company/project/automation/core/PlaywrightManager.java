
package com.company.project.automation.core;

import com.microsoft.playwright.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.company.project.automation.config.FrameworkConfig;

@Component
public class PlaywrightManager {
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;

    @Autowired
    FrameworkConfig config;

    @javax.annotation.PostConstruct
    public void init() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
        page = context.newPage();
        page.navigate(config.getBaseUrl());
    }

    public Page getPage() { return page; }
}
