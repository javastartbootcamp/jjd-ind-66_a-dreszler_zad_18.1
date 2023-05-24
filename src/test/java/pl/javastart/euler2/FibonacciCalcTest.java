package pl.javastart.euler2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciCalcTest {

    @ParameterizedTest(name = "Sum of even fibonacci elements lower or equal to {0} should be equal to {1}")
    @CsvSource({
            "1, 0",
            "2, 2",
            "3, 2",
            "10, 10",
            "34, 44"
    })
    void shouldReturnValidAnswer(int limit, int expected) {
        //given
        FibonacciCalc fibonacciCalc = new FibonacciCalc();
        //when
        int sum = fibonacciCalc.sumEvenFibonacciElementsUpTo(limit);
        //then
        assertThat(sum).isEqualTo(expected);
    }
}