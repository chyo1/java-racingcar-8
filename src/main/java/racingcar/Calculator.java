package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Calculator {
    // 우승자 결정

    // 자동차 전진 여부 결정
    public void movingCars(List<Car> cars) {
        for (Car car : cars) {
            if (isCarMoved()) {
                car.move();
            }
        }
    }

    private boolean isCarMoved() {
        return 4 <= Randoms.pickNumberInRange(0, 9);
    }
}
