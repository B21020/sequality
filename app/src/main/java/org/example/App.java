package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        Calculate calculate = new Calculate();
        
        int sum = calculate.sum(2, 3);
        double average = calculate.average(2, 3);
        int sumFromOneToTen = calculate.sumFromOneToTen();
        double averageFromOneToTen = calculate.averageFromOneToTen();
        int sumOddFromOneToTen = calculate.sumOddFromOneToTen();
        int sumEvenFromOneToTen = calculate.sumEvenFromOneToTen();
        
        System.out.printf("Sum of 2 and 3 is %d. Average is %.1f.\n", sum, average);
        System.out.printf("Sum of 1 to 10 is %d. Average is %.1f.\n", sumFromOneToTen, averageFromOneToTen);
        System.out.printf("Sum of odd of 1 to 10 is %d. Sum of even is %d.\n", sumOddFromOneToTen, sumEvenFromOneToTen);
    }
}
