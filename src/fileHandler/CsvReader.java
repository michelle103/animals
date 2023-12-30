package fileHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<List<String>> readCsvFile(String path) {
        InputStream inputStream = getInputStream(path);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        List<String> csvLines = getLines(bufferedReader);
        return parseLinesToColumnList(csvLines);
    }

    private InputStream getInputStream(String path) {
        InputStream inputStream = this.getClass().getResourceAsStream(path);
        if (inputStream == null) throw new RuntimeException();
        return inputStream;
    }

    private List<String> getLines(BufferedReader bufferedReader) {
        List<String> csvLines = new ArrayList<>();
        try {
            while (bufferedReader.ready()) {
                csvLines.add(bufferedReader.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return csvLines;
    }

    private List<List<String>> parseLinesToColumnList(List<String> csvLines) {
        List<List<String>> fileContent = new ArrayList<>();
        csvLines.forEach(line -> {
            fileContent.add(getColumns(line));
        });
        return fileContent;
    }

    private List<String> getColumns(String csvLine) {
        return List.of(csvLine.split(";"));
    }
}
