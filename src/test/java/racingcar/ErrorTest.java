package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ErrorTest {

    @Test
    void checkCarNamesInputFormatTest() {
        Error error = new Error();

        // 구분자 오류
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a, b,c");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a,b,c ");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a1,b,c");
        });

        // 빈칸 오류
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a,,c");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat(",");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("");
        });

        // 숫자 입력
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a1,b,c");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("a,a,c");
        });

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            error.checkCarNamesInputFormat("aA,Aa,c");
        });
    }
}