package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrServiceTest {

    @Test
    void shouldSqrService() {
        SqrService service = new SqrService();

        int min = 200;
        int max = 300;
        int expected = 3;

        int actual = service.sqrtCeil(count);

        assertEquals (expected, actual);
    }
}


