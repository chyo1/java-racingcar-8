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
        Car one = new Car("one");
        Car two = new Car("two");
        Car three = new Car("three");

        one.move();
        two.move();two.move();
        three.move();three.move();three.move();

        Assertions.assertThat(one.printMoving()).isEqualTo("one : -");
        Assertions.assertThat(two.printMoving()).isEqualTo("two : --");
        Assertions.assertThat(three.printMoving()).isEqualTo("three : ---");
    }

    @Test
    void isFartherThanTest() {
        Car one = new Car("one");
        Car two = new Car("two");

        one.move();

        Assertions.assertThat(one.isFartherThan(two)).isEqualTo(true);
        Assertions.assertThat(two.isFartherThan(one)).isEqualTo(false);
    }

    @Test
    void isAtSameMovedTest() {
        Car one = new Car("one");
        Car two = new Car("two");

        Assertions.assertThat(one.isAtSameMoved(two)).isEqualTo(true);
    }
}