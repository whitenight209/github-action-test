package com.chpark.example.githubactiontest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SampleTest {

    @Test
    void successTest() {
        Assertions.assertEquals(true, true);
    }

    @Test
    void failTest() {
        Assertions.assertEquals(true, false);
    }
}
