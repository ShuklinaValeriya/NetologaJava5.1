package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SqrServiceTest {

    @Test
    void shouldSqrService200300() {
        SqrService service = new SqrService();

        int count = 0;
        int expected = 3;
        int actual = service.sqrtCeil(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrService100500() {
        SqrService service = new SqrService();

        int count = 0;
        int expected = 13;
        int actual = service.sqrtCeil(100, 500);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSqrService100200() {
        SqrService service = new SqrService();

        int count = 0;
        int expected = 5;
        int actual = service.sqrtCeil(100, 200);

        assertEquals(expected, actual);
    }
}


