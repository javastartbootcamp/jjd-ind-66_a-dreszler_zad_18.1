package pl.javastart.euler2;

class FibonacciCalc {
    int sumEvenFibonacciElementsUpTo(int limit) {
        int sum = 0;
        int first = 0;
        int second = 1;

        while (second < limit) {
            int next = first + second;
            first = second;
            second = next;
            if (next % 2 == 0) {
                sum += next;
            }
        }

        return sum;
    }
}