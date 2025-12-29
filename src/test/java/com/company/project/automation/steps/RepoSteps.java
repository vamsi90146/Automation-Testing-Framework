package com.company.project.automation.steps;

import com.company.project.automation.intelligence.repoexecutor.*;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class RepoSteps {

    @Autowired
    RepoExecutor executor;

    @Autowired
    ReportExporter exporter;

    @Given("I analyze the repo located at {string}")
    public void analyzeRepo(String repoPath) throws Exception {
        RepoReport report = executor.analyzeRepo(repoPath);
        exporter.exportAsJson(report, "target/repo_report.json");

        System.out.println("Total Files: " + report.getTotalFiles());
    }
}

