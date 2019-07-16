package com.codecool.balazske;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FilePartReaderTest {

    @Test
    public void test_isFilePartReaderReadCorrect() throws Exception {
        FilePartReader reader = new FilePartReader();
        reader.setup("resources/test.txt", 1, 2);
        assertEquals("A\nB\n", reader.readLines());
        reader.setup("resources/test.txt", 1, 4);
        assertEquals("A\nB\nC\nD\n", reader.readLines());
        reader.setup("resources/test.txt", 1, 5);
        assertEquals("A\nB\nC\nD\nE\n", reader.readLines());
    }

}