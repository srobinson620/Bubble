package com.sparta.sr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    @DisplayName("Test Output")
    void simpleTest(){
        int[] testData = {4,3,2,9,1,5};
        int[] expectedResult = {1,2,3,4,5,9};
        Assertions.assertArrayEquals(expectedResult,App.bubbleSort(testData));
    }
    @Test
    @DisplayName("Test empty array")
    void emptyTest(){
        int[] testData = {};
        int[] expectedResult = {};
        Assertions.assertArrayEquals(expectedResult,App.bubbleSort(testData));
    }
    @Test
    @DisplayName("Test single element array")
    void oneElementTest(){
        int[] testData = {1};
        int[] expectedResult = {1};
        Assertions.assertArrayEquals(expectedResult,App.bubbleSort(testData));
    }
}
