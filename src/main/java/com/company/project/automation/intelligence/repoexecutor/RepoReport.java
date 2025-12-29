package com.company.project.automation.intelligence.repoexecutor;

import java.util.List;

public class RepoReport {
    private int totalFiles;
    private List<FileMetadata> files;

    public int getTotalFiles() { return totalFiles; }
    public void setTotalFiles(int t) { totalFiles = t; }

    public List<FileMetadata> getFiles() { return files; }
    public void setFiles(List<FileMetadata> f) { files = f; }
}
