package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class RacingProcess {
    IOController ioController = new IOController();

    public void run() {
        // 자동차 입력 받기
        String carNames = ioController.getCarNames();
        // 각 자동차 객체 만들기

        // 실행 횟수 입력 받기
        String trialCount = ioController.getTrialCount();
        // 실행 횟수만큼 반복

        // 우승자 구하기

        // 우승자 출력
        List<String> winners = null;
        ioController.showWinner(winners);

        Console.close();
    }
}
