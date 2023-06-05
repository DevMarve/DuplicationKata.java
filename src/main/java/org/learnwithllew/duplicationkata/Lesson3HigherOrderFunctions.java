package org.learnwithllew.duplicationkata;

import java.util.function.IntUnaryOperator;

public class Lesson3HigherOrderFunctions extends Song {
    public void singCheers() {
        singSong(2, this::getNumber);
        sing("Who do we appreciate?");
        singSong(17, this::getNextPrime);
        sing("These are the primes, that we find fine!");
    }

    private void singSong(int number, IntUnaryOperator nextNumber) {
        for (int i = 0; i < 4; i++) {
            sing(number + "! ");
            number = nextNumber.applyAsInt(number);
        }
    }

    private int getNumber(int number) {
        return number + 2;
    }

    private int getNextPrime(int number) {
        switch (number) {
            case 13:
                return 17;
            case 17:
                return 19;
            case 19:
                return 23;
            case 23:
                return 29;
        }
        return 0;
    }
}
