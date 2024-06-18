package com.outsider.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SubtractionTest {
    @Test
    @DisplayName("빼기 테스트")
    public void testSub() {

        int first = 1;
        int second = 2;
        int result = first - second;
        Assertions.assertEquals(result, new Subtraction().sub(first, second));
    }
}
