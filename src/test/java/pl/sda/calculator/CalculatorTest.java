package pl.sda.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator sut = new Calculator();

    @Test
    @DisplayName("Powinno zwrocic 5 przy dodawaniu 3 do 2")
    void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        int arg1 = 2;
        int arg2 = 3;

        //when
        int actual = sut.add(arg1, arg2);

        //then
        assertEquals(5.0, actual);
    }

    @Test
    @DisplayName("Sprawdza podzielność przez 3 ")
    void shoulBeDividableByThree() {
        //given
        int arg = 9;
        //when
        boolean actual = sut.isDividableByThree(arg);
        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 14 jako wynik odejmowania cyfry 7 od 21 ")
    void shouldReturnFourteenOfSubstractionOperationForGivenArguments() {
        //given
        int arg1 = 21;
        int arg2 = 7;
        //when
        int actual = sut.substract(arg1, arg2);
        //then
        assertEquals(14, actual);
    }

    @Test
    @DisplayName("Powinno zwrócic 6 jako wynik mnożenia 2 razy 3")
    void shouldReturnSixAsResultOfMultiplyingArgs() {
        //given
        int arg1 = 2;
        int agr2 = 3;
        //when
        int actual = sut.multiplication(arg1, agr2);
        //then
        assertEquals(6, actual);
    }

    @Test
    @DisplayName("Powinno zwrócic 0  jako wynik mnożenia razy 0")
    void shouldReturnZeroAsResultOfMultiplyingArgs() {
        //given
        int arg1 = 0;
        int agrThatIsNotImportant = 3;
        //when
        int actual = sut.multiplication(arg1, agrThatIsNotImportant);
        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Zwraca 3 przy dzieleniu 9 przez 3")
    void shouldReturnThreeWhenNineIsDividedByThree() {
        //given
        int arg1 = 9;
        int arg2 = 3;
        //when
        int actual = sut.division(arg1, arg2);
        //then
        assertEquals(3, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 0 jako wynik dzielenia 0 przez dowolną liczbę")
    void shouldReturn0WhenZeroIsDevidedByNumber() {
        //given
        int arg1 = 0;
        int argIsNotImportant = 1234;
        //when
        int actual = sut.division(arg1, argIsNotImportant);
        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("Powinno zwrócić 0 jako wynik dzielenia dowolnej liczby przez 0")
    void shouldReturn0WhenNumberIsDividedByZero() {
        //given
        int argIsNotImportant = 1234;
        int arg2 = 0;
        //when
        int actual = sut.division(argIsNotImportant, arg2);
        //then
        assertEquals(0, actual);
    }

    @Test
    @DisplayName("powinno zwrócić prawdę dla liczby parzystej ")
    void shouldReturnTruthForEvenValue() {
        //given
        int arg1 = 6;
        //when
        boolean actual = sut.isItEven(arg1);
        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("powinno zwrócić falsz dla liczby nieparzystej ")
    void shouldReturnFalseForOddValue() {
        //given
        int arg1 = 7;
        //when
        boolean actual = sut.isItEven(arg1);
        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("powinno zwrócić prawdę dla liczby nieparzystej ")
    void shouldReturnTruthForOddValue() {
        //given
        int arg1 = 3;
        //when
        boolean actual = sut.isOddValue(arg1);
        //then
        assertTrue(actual);
    }

    @Test
    @DisplayName("powinno zwrócić falsz dla liczby parzystej ")
    void shouldReturnFalseForEvenValue() {
        //given
        int arg1 = 2;
        //when
        boolean actual = sut.isOddValue(arg1);
        //then
        assertFalse(actual);
    }

    @Test
    @DisplayName("powinno zwrócić 2,5 przy liczeniu 50% z liczby 5")
    void returnsFiftyPercentFromNumber5() {
        //given
        double arg1 = 5;
        double precentageOfNumber = 50.0;
        //when
        double actual = sut.precentageOfNumber(arg1, precentageOfNumber);
        //then
        assertEquals(2.5, actual, 0.00001d);
    }

    @Test
    @DisplayName("powinno zwrócić 200 przy liczeniu 10% z 2000")
    void returnsTenthPercentFromTwoTousnds() {
        //given
        double arg1 = 2000;
        double precentageOfNumber = 10;
        //when
        double actual = sut.precentageOfNumber(arg1, precentageOfNumber);
        //then
        assertEquals(2.5, actual, 0.00001d);
    }

}
