package com.company.project.automation.tests;

import com.company.project.automation.intelligence.repoexecutor.*;
import com.company.project.automation.spring.SpringContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RepoAnalysisTest {

    RepoExecutor executor;
    ReportExporter exporter;

    @BeforeClass
    public void setup() {
        SpringContext.init();
        executor = SpringContext.getBean(RepoExecutor.class);
        exporter = SpringContext.getBean(ReportExporter.class);
    }

    @Test
    public void testRepoAnalysis() throws Exception {
        String repoPath = "C:/my/repo";

        RepoReport report = executor.analyzeRepo(repoPath);
        exporter.exportAsJson(report, "target/repo_report.json");

        System.out.println("Files found: " + report.getTotalFiles());
    }
}

