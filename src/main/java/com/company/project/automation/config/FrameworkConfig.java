
package com.company.project.automation.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration

@ConfigurationProperties(prefix="framework")
public class FrameworkConfig {
    private String baseUrl;
    private String browser;
    private String repoPath;

    public String getBaseUrl(){ return baseUrl; }
    public void setBaseUrl(String v){ baseUrl=v; }
    public String getBrowser(){ return browser; }
    public void setBrowser(String b){ browser=b; }

    public String getRepoPath() {
        return repoPath;
    }

    public void setRepoPath(String repoPath) {
        repoPath = repoPath;
    }
}
