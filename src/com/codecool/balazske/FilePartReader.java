package com.codecool.balazske;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilePartReader {

    private String filePath = "default";
    private Integer fromLine = 0;
    private Integer toLine = 0;

    public void setup(String filePath, Integer fromLine, Integer toLine) {
        if (toLine < fromLine) throw new IllegalArgumentException("To line is smaller than from line");
        this.filePath = filePath;
        this.fromLine = fromLine;
        this.toLine = toLine;
    }

    public String read() throws Exception {
        FileReader file = new FileReader(this.filePath);
        BufferedReader reader = new BufferedReader(file);
        String content = "";
        String line = reader.readLine();
        while(line != null){
            content += line + "\n";
            line = reader.readLine();

        }
        return content;
    }

    public String readLines() throws Exception {
        String content = read();
        StringBuilder result = new StringBuilder();
        List<String> lines = Arrays.asList(content.split("\n"));
        for(int i = fromLine - 1; i <= toLine - 1; i++){
            result.append(lines.get(i) + "\n");
        }
        return result.toString();
    }


}
