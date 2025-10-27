package racingcar;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RacingProcessTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    RacingProcess racingProcess = new RacingProcess();
    private IOController ioController = new IOController();
    private Error error = new Error();
    private Calculator calculator = new Calculator();

    @Test
    void 실행() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("one,two,three", "1");
                    Assertions.assertThat(output())
                            .contains("one : -", "two : ", "three : -", "최종 우승자 : one, three");
                },
                MOVING_FORWARD, STOP, MOVING_FORWARD
        );
    }

    @Override
    public void runMain() {
        racingProcess.run();
    }
}
