package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    /* getWinners ----------------------------*/
    /**
     * 우승자가 1명일 때
     */
    @Test
    void OneWinner() {
        // given
        Calculator calculator = new Calculator();

        Car one = new Car("one");
        Car two = new Car("two");
        Car three = new Car("three");
        List<Car> cars = List.of(one, two, three);

        // when
        one.move();

        // then
        List<Car> expected = List.of(one);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

    /**
     * 우승자가 여러 명일 때
     */
    @Test
    void moreThanOneWinners() {
        // given
        Calculator calculator = new Calculator();

        Car one = new Car("one");
        Car two = new Car("two");
        Car three = new Car("three");
        List<Car> cars = List.of(one, two, three);

        // when
        one.move(); one.move();
        two.move(); two.move();
        three.move();

        // then
        List<Car> expected = List.of(one, two);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

    /**
     * 우승자가 여러 명이며 아무도 움직이지 않았을 때
     */
    @Test
    void moreThanOneWinnersWithNoMoved() {
        // given
        Calculator calculator = new Calculator();

        Car one = new Car("one");
        Car two = new Car("two");
        Car three = new Car("three");
        List<Car> cars = List.of(one, two, three);

        // when

        // then
        List<Car> expected = List.of(one, two, three);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

}