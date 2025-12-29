package com.company.project.automation.steps.airline;

import com.company.project.automation.pages.airline.AirlinePage;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class AirlineSteps {

    @Autowired
    private AirlinePage airlinePage;

    @Given("user opens airline module")
    public void openModule() {
        airlinePage.openAirlineModule();
    }

    @When("user searches flights")
    public void searchFlights() {
        airlinePage.searchFlight();
    }

    @When("user books a ticket")
    public void bookTicket() {
        airlinePage.bookTicket();
    }

    @When("user cancels a ticket")
    public void cancelTicket() {
        airlinePage.cancelTicket();
    }

    @When("user modifies ticket date")
    public void modifyTicket() {
        airlinePage.modifyTicket();
    }

    @When("user adds baggage to booking")
    public void addBaggage() {
        airlinePage.addBaggage();
    }

    @When("user performs web check in")
    public void webCheckIn() {
        airlinePage.webCheckIn();
    }

    @When("user selects a seat")
    public void seatSelect() {
        airlinePage.seatSelection();
    }

    @When("user downloads boarding pass")
    public void boardingPass() {
        airlinePage.downloadBoardingPass();
    }

    @Then("airline module operation should succeed")
    public void validateSuccess() {
        airlinePage.validateSuccess();
    }
}

