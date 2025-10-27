package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class RacingProcess {
    private IOController ioController = new IOController();
    private Error error = new Error();
    private Calculator calculator = new Calculator();

    private List<Car> cars = new ArrayList<>();

    public void run() {
        // 자동차 입력 받기
        String carNamesInput = ioController.getCarNames();

        error.checkCarNamesInputFormat(carNamesInput);
        error.checkDuplicateName(carNamesInput);

        // 각 자동차 객체 만들기
        String[] carNamesSplitBySeparator = carNamesInput.split(",");
        for (String carName : carNamesSplitBySeparator) {
            cars.add(new Car(carName));
        }

        // 실행 횟수 입력 받기
        String trialCountInput = ioController.getTrialCount();
        error.checkTrialCountInputError(trialCountInput);

        // 실행 횟수만큼 반복
        int trialCount = Integer.parseInt(trialCountInput);
        System.out.println("실행 결과");
        for (int i = 0; i < trialCount; i++) {
            calculator.movingCars(cars);
            ioController.showResultsByStage(cars);
        }

        // 우승자 구하기
        List<Car> winners = calculator.getWinners(cars);
        ioController.showWinner(winners);

        Console.close();
    }
}
