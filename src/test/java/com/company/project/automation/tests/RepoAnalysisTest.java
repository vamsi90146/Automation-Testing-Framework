package com.company.project.automation.tests;

import com.company.project.automation.config.FrameworkConfig;
import com.company.project.automation.intelligence.repoexecutor.*;
import com.company.project.automation.spring.SpringContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RepoAnalysisTest {

    RepoExecutor executor;
    ReportExporter exporter;

    FrameworkConfig config;

    @BeforeClass
    public void setup() {
        SpringContext.init();
        executor = SpringContext.getBean(RepoExecutor.class);
        exporter = SpringContext.getBean(ReportExporter.class);
        config = SpringContext.getBean(FrameworkConfig.class);
    }

    @Test
    public void testRepoAnalysis() throws Exception {
        String repoPath =config.getRepoPath();

        RepoReport report = executor.analyzeRepo(repoPath);
        exporter.exportAsJson(report, "target/repo_report.json");

        System.out.println("Files found: " + report.getTotalFiles());
    }
}

