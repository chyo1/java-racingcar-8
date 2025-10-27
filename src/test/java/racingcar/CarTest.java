package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CarTest {
    /**
     * 각 라운드 별 전진 횟수 출력
     */
    @Test
    void printMovingTest() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");
        Car car3 = new Car("car3");

        car1.move();
        car2.move();car2.move();
        car3.move();car3.move();car3.move();

        Assertions.assertThat(car1.printMoving()).isEqualTo("car1 : -");
        Assertions.assertThat(car2.printMoving()).isEqualTo("car2 : --");
        Assertions.assertThat(car3.printMoving()).isEqualTo("car3 : ---");
    }

    @Test
    void isFartherThanTest() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        car1.move();

        Assertions.assertThat(car1.isFartherThan(car2)).isEqualTo(true);
        Assertions.assertThat(car2.isFartherThan(car1)).isEqualTo(false);
    }

    @Test
    void isAtSameMovedTest() {
        Car car1 = new Car("car1");
        Car car2 = new Car("car2");

        Assertions.assertThat(car1.isAtSameMoved(car2)).isEqualTo(true);
    }
}