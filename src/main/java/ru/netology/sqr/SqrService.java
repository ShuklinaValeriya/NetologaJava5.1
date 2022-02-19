package ru.netology.sqr;

public class SqrService {

    int min = 200;
    int max = 300;

    public int sqrtCeil(int count) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    count++;
                }

            }
        }
        return count;
    }
}
