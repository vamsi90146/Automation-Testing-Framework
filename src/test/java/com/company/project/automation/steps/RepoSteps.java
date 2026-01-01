package com.company.project.automation.steps;

import com.company.project.automation.config.FrameworkConfig;
import com.company.project.automation.intelligence.repoexecutor.*;
import io.cucumber.java.en.*;
import org.springframework.beans.factory.annotation.Autowired;

public class RepoSteps {

    @Autowired
    RepoExecutor executor;

    @Autowired
    ReportExporter exporter;

    @Autowired
    FrameworkConfig config;

    public void analyzeRepo() throws Exception {
        String repoPath = config.getRepoPath();
        RepoReport report = executor.analyzeRepo(repoPath);
        exporter.exportAsJson(report, "target/repo_report.json");

        System.out.println("Total Files: " + report.getTotalFiles());
    }
}

