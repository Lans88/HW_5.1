package ru.netology.hw51;

public class SQRService {
    int number = 0;

    public int square(int min, int max) {
        for (int i = 10; i < 99; i++) {
            int sqr = i * i;
            if (sqr > min & sqr < max) {
                number = number + 1;
            }
        }
        return number;
    }
}
