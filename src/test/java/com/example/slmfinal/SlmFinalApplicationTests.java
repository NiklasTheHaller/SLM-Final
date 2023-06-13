package com.example.slmfinal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmFinalApplicationTests {

    @Test
    void digitsumTest(){

        DigitsumController calculatorController = new DigitsumController();

        int a = 1234;

        int result = calculatorController.digitSum(a);

        assertEquals(10, result);

    }

    @Test
    void usageTest(){

        DigitsumController calculatorController = new DigitsumController();

        int a = 1234;
        calculatorController.digitSum(a);
        int b = 456;
        calculatorController.digitSum(b);

        int result = calculatorController.usage();

        assertEquals(2, result);
    }

}
