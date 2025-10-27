package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ErrorTest {

    @ParameterizedTest
    @ValueSource(strings = {"a, b,c", "a,b,c ", "a1,b,c"})
    void checkCarNamesInputParameterTest(String input) {
        Error error = new Error();

        // 빈칸 오류
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat(input);
        });
    }

    @ValueSource(strings = {"a,,c", ",", ""})
    void checkCarNamesInputBlankTest(String input) {
        Error error = new Error();

        // 빈칸 오류
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat(input);
        });
    }

    @ValueSource(strings = {"a1,b,c"})
    void checkCarNamesInputAlphaTest(String input) {
        Error error = new Error();

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat(input);
        });
    }

    @Test
    void checkDuplicateNameTest() {
        Error error = new Error();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkDuplicateName("a,a,c");
        });

        Assertions.assertDoesNotThrow(() -> {
            error.checkDuplicateName("aA,Aa,c");
        });

    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "101", "-1"})
    void checkTrialCountInputErrorTest(String input) {
        Error error = new Error();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkTrialCountInputError(input);
        });
    }
}