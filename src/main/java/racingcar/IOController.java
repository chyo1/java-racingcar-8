package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class IOController {
    // 이름 입력
    public String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉽표(,) 기준으로 구분)");
        return Console.readLine();
    }

    // 시도 횟수 입력
    public String getTrialCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        return Console.readLine();
    }

    // 우승자 출력
    public void showWinner(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < winners.size(); i++) {
            sb.append(winners.get(i));
            if (i != winners.size() - 1) {
                sb.append(", ");
            }
        }

        System.out.print("최종 우승자 : " + sb.toString());
    }
}
