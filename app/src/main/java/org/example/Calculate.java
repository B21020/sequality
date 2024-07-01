package org.example;

public class Calculate {
    public int sum(int a, int b) {
        return a + b;
    }

    public double average(int a, int b) {
        return (a + b) / 2.0;
    }

    public int sumFromOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    public double averageFromOneToTen() {
        return sumFromOneToTen() / 10.0;
    }

    public int sumOddFromOneToTen() {
        int sum = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum += i;
        }
        return sum;
    }

    public int sumEvenFromOneToTen() {
        int sum = 0;
        for (int i = 2; i <= 10; i += 2) {
            sum += i;
        }
        return sum;
    }
}
