package racingcar;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 우승자 결정
    public List<Car> getWinners(List<Car> cars) {
        Car winner = cars.get(0);
        for (Car car : cars) {
            if (car.isFartherThan(winner)) {
                winner = car;
            }
        }

        List<Car> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isAtSameMoved(winner)) {
                winners.add(car);
            }
        }
        return winners;
    }
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
