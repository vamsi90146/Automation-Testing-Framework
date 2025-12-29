package com.company.project.automation.intelligence.repoexecutor;

import org.springframework.stereotype.Component;
import java.nio.file.*;
import java.util.*;
import java.io.IOException;

@Component
public class RepoExecutor {

    public RepoReport analyzeRepo(String repoPath) throws IOException {
        RepoReport report = new RepoReport();
        List<FileMetadata> files = new ArrayList<>();

        Files.walk(Paths.get(repoPath))
                .filter(Files::isRegularFile)
                .forEach(path -> {
                    try {
                        FileMetadata meta = new FileMetadata();
                        meta.setPath(path.toString());
                        meta.setSize(Files.size(path));
                        meta.setLastModified(Files.getLastModifiedTime(path).toString());
                        files.add(meta);
                    } catch (IOException e) { e.printStackTrace(); }
                });

        report.setFiles(files);
        report.setTotalFiles(files.size());
        return report;
    }
}
