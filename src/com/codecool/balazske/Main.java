package com.codecool.balazske;

public class Main {
    public static void main(String[] args) throws Exception {
        FilePartReader file = new FilePartReader();
        file.setup("resources/test.txt", 1, 4);
        FileWordAnalyzer fileWordAnalyzer = new FileWordAnalyzer(file);
        System.out.println(fileWordAnalyzer.getStringsWhichPalindromes());
    }
}
