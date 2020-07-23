package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_1() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 1;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("1", result);
    }
}
