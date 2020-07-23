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

    @Test
    void should_return_fizz_when_count_off_given_3() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 3;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("Fizz", result);
    }

    @Test
    void should_return_buzz_when_count_off_given_5() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 5;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("Buzz", result);
    }

    @Test
    void should_return_fizzbuzz_when_count_off_given_15() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 15;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("FizzBuzz", result);
    }

    @Test
    void should_return_whizz_when_count_off_given_7() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 7;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("Whizz", result);
    }

    @Test
    void should_return_FizzWhizz_when_count_off_given_21() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 21;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("FizzWhizz", result);
    }

    @Test
    void should_return_buzzwhizz_when_count_off_given_35() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 35;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("BuzzWhizz", result);
    }

    @Test
    void should_return_fizzbuzzwhizz_when_count_off_given_105() {
        //given
        FizzBuzz fizzbuzz = new FizzBuzz();
        int inputNumber = 105;

        //when
        String result = fizzbuzz.play(inputNumber);

        //then
        assertEquals("FizzBuzzWhizz", result);
    }
}
