package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        FibonacciCalc fibonacciCalc = new FibonacciCalc();
        int limit = 4_000_000;
        int sum = fibonacciCalc.sumEvenFibonacciElementsUpTo(limit);
        System.out.println("Suma parzystych elementów ciągu fibonacciego, których wartość nie przekracza " + limit +
                ": " + sum);
    }
}
