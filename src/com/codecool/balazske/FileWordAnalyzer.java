package com.codecool.balazske;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileWordAnalyzer {

    private FilePartReader fileContent;

    FileWordAnalyzer(FilePartReader fileContent) {
        this.fileContent = fileContent;
    }

    public List<String> getWordsOrderedAlphabetically() throws Exception {
        List<String> lines = Arrays.asList(fileContent.readLines().split("\n"));
        lines.sort(String.CASE_INSENSITIVE_ORDER);
        return lines;
    }

    public List<String> getWordsContainingSubstring (String subString ) throws Exception {
        return Stream.of(fileContent.readLines().split("\n"))
                .filter(x -> x.toLowerCase().contains(subString.toLowerCase()))
                .collect(Collectors.toList());
    }
}
