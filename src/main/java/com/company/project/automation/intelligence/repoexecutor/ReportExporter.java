package com.company.project.automation.intelligence.repoexecutor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;
import java.io.File;

@Component
public class ReportExporter {

    public void exportAsJson(RepoReport report, String outputPath) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputPath), report);
    }
}
