package com.outsider.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AdderTests {

    @Test
    @DisplayName("1과 2를 더한 결과가 3인지 확인")
    public void testAdd() {
        //given
        int first = 1;
        int second = 2;

        //when
        int result = new Adder().add(first, second);

        //then(verify)
        Assertions.assertEquals(3, result);
    }

    @DisplayName("2과 23 더한 결과가 3인지 확인")
    public void testAdd2() {
        //given
        int first = 2;
        int second = 3;

        //when
        int result = new Adder().add(first, second);

        //then(verify)
        Assertions.assertEquals(5, result);
    }
}
