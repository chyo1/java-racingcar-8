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

        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        List<Car> cars = List.of(car1, car2, car3);

        // when
        car1.move();

        // then
        List<Car> expected = List.of(car1);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

    /**
     * 우승자가 여러 명일 때
     */
    @Test
    void moreThanOneWinners() {
        // given
        Calculator calculator = new Calculator();

        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        List<Car> cars = List.of(car1, car2, car3);

        // when
        car1.move(); car1.move();
        car2.move(); car2.move();
        car3.move();

        // then
        List<Car> expected = List.of(car1, car2);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

    /**
     * 우승자가 여러 명이며 아무도 움직이지 않았을 때
     */
    @Test
    void moreThanOneWinnersWithNoMoved() {
        // given
        Calculator calculator = new Calculator();

        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");
        List<Car> cars = List.of(car1, car2, car3);

        // when

        // then
        List<Car> expected = List.of(car1, car2, car3);
        Assertions.assertThat(expected).isEqualTo(calculator.getWinners(cars));
    }

}