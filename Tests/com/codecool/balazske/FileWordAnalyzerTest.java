package com.codecool.balazske;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileWordAnalyzerTest {

    @Test
    public void test_getWordOderedByAlphapetically() throws Exception {
        List<String> goodResult = Arrays.asList("A", "B", "C", "D", "E", "F");

        FilePartReader reader1 = new FilePartReader();
        reader1.setup("resources/reader1_test.txt", 1, 6);
        FileWordAnalyzer analyzer1 = new FileWordAnalyzer(reader1);

        FilePartReader reader2 = new FilePartReader();
        reader2.setup("resources/reader2_test.txt", 1, 6);
        FileWordAnalyzer analyzer2 = new FileWordAnalyzer(reader2);

        FilePartReader reader3 = new FilePartReader();
        reader3.setup("resources/reader3_test.txt", 1, 6);
        FileWordAnalyzer analyzer3 = new FileWordAnalyzer(reader3);

        assertEquals(goodResult, analyzer1.getWordsOrderedAlphabetically());
        assertEquals(goodResult, analyzer2.getWordsOrderedAlphabetically());
        assertEquals(goodResult, analyzer3.getWordsOrderedAlphabetically());
    }

    @Test
    public void test_getWordContainingSubString() throws Exception {

        List<String> goodResult1 = Arrays.asList("aasda", "basdb", "dasdd", "gasdg");
        List<String> goodResult2 = Arrays.asList("ajkla", "bjklb", "djkld");
        List<String> goodResult3 = Arrays.asList("aqwea", "bqweb", "dqwed", "fqwef");

        FilePartReader reader1 = new FilePartReader();
        reader1.setup("resources/reader4_test.txt", 1, 6);
        FileWordAnalyzer analyzer1 = new FileWordAnalyzer(reader1);

        FilePartReader reader2 = new FilePartReader();
        reader2.setup("resources/reader5_test.txt", 1, 6);
        FileWordAnalyzer analyzer2 = new FileWordAnalyzer(reader2);

        FilePartReader reader3 = new FilePartReader();
        reader3.setup("resources/reader6_test.txt", 1, 6);
        FileWordAnalyzer analyzer3 = new FileWordAnalyzer(reader3);

        assertEquals(goodResult1, analyzer1.getWordsContainingSubstring("asd"));
        assertEquals(goodResult2, analyzer2.getWordsContainingSubstring("jkl"));
        assertEquals(goodResult3, analyzer3.getWordsContainingSubstring("qwe"));

    }

    @Test
    public void test_getStringWichPalindrome() throws Exception {
        List<String> goodResult = Arrays.asList("indul a görög aludni", "géza kék az ég");

        FilePartReader reader = new FilePartReader();
        reader.setup("resources/palindrome_test.txt", 1, 4);
        FileWordAnalyzer analyzer = new FileWordAnalyzer(reader);

        assertEquals(goodResult, analyzer.getStringsWhichPalindromes());
    }

}