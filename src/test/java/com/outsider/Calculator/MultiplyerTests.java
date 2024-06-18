package com.outsider.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MultiplyerTests {
    @Test
    @DisplayName("1과 2를 곱해서 2가 나온다")
    public void testMultiply() {
        int a = 1;
        int b = 2;
        int result = Multiplyer.multiply(a, b);
        Assertions.assertEquals(2, result);
    }
    @Test
    @DisplayName("2과 3를 곱해서 6이 나온다")
    public void testMultiply2() {
        int a = 2;
        int b = 3;
        int result = Multiplyer.multiply(a, b);
        Assertions.assertEquals(6, result);
    }
}
