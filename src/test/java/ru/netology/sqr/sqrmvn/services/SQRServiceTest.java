package ru.netology.sqr.sqrmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldFindQuantityOfSquares() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrtInARange(200, 300);

        Assertions.assertEquals(expected, actual);
    }
}
