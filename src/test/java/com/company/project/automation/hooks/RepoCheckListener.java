package com.company.project.automation.hooks;

import org.testng.ISuiteListener;
import org.testng.ISuite;

import java.io.IOException;

public class RepoCheckListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        try {
            System.out.println("Running Python repo analyzer...");
            Process p = Runtime.getRuntime().exec("python python/repo_analyzer/main.py");
            p.waitFor();
            System.out.println("Repo analysis completed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

