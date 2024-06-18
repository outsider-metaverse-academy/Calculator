package com.outsider.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DividerTests {

    @Test
    @DisplayName("1과 2를 더한 결과가 3인지 확인")
    public void testAdd(){

        //given
        int first =2;
        int second=1;

        //when
        double result= Divide.divide(first,second);

        //then (verify)
        Assertions.assertEquals(2,result);
    }
}
