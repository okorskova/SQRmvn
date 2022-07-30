package ru.netology.sqr.sqrmvn.services;

public class SQRService {

    public int sqrtInARange(int min, int max) {
        int counter = 0;
        for (int number = 10; number <= 99; number++) {
            int squareNumber = number * number;
            if (squareNumber >= min && squareNumber <= max) {
                counter++;
            }
        }
        return counter;
    }
}
