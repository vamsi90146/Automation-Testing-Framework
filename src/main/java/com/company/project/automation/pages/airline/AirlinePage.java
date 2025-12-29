package com.company.project.automation.pages.airline;

import com.company.project.automation.core.BasePage;
import com.company.project.automation.core.PlaywrightManager;
import org.springframework.stereotype.Component;

@Component
public class AirlinePage extends BasePage {

    public AirlinePage(PlaywrightManager manager) {
        super(manager.getPage());
    }

    private final String airlineModule = "#airline-module";
    private final String searchBtn = "#search-flight";
    private final String bookBtn = "#book-ticket";
    private final String cancelBtn = "#cancel-ticket";
    private final String modifyBtn = "#modify-ticket";
    private final String baggageBtn = "#add-baggage";
    private final String checkInBtn = "#web-checkin";
    private final String seatBtn = "#seat-selection";
    private final String boardingPassBtn = "#download-boarding-pass";
    private final String successMsg = "#success";

    public void openAirlineModule() { page.click(airlineModule); }
    public void searchFlight() { page.click(searchBtn); }
    public void bookTicket() { page.click(bookBtn); }
    public void cancelTicket() { page.click(cancelBtn); }
    public void modifyTicket() { page.click(modifyBtn); }
    public void addBaggage() { page.click(baggageBtn); }
    public void webCheckIn() { page.click(checkInBtn); }
    public void seatSelection() { page.click(seatBtn); }
    public void downloadBoardingPass() { page.click(boardingPassBtn); }

    public void validateSuccess() {
        page.waitForSelector(successMsg);
    }
}

