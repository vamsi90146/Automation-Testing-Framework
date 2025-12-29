package com.company.project.automation.intelligence.repoexecutor;

public class FileMetadata {
    private String path;
    private long size;
    private String lastModified;

    public String getPath() { return path; }
    public void setPath(String p) { this.path = p; }

    public long getSize() { return size; }
    public void setSize(long s) { this.size = s; }

    public String getLastModified() { return lastModified; }
    public void setLastModified(String lm) { this.lastModified = lm; }
}
