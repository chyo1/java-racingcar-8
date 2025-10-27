package racingcar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Error {

    public static final int NAME_LENGTH_LIMIT = 5;
    public static final int TRIAL_COUNT_UNDER_LIMIT = 0;
    public static final int TRIAL_COUNT_UPPER_LIMIT = 100;

    public void checkCarNamesInputFormat(String carNamesInput) {
        String[] inputs = carNamesInput.split(",");
        if (inputs.length == 0) {
            throw new IllegalArgumentException("입력이 비어있습니다.");
        }
        for (String input : inputs) {
            validateCarName(input);
        }
    }

    private void validateCarName(String input) {
        if (input.length() > NAME_LENGTH_LIMIT || input.isEmpty() || input.isBlank()
                || input.chars().anyMatch(c -> !Character.isLetter(c))) {
            throw new IllegalArgumentException("차의 이름은 5자 이내의 알파벳만 입력 가능합니다.");
        }
    }

    public void checkDuplicateName(String carNamesInput) {
        String[] inputs = carNamesInput.split(",");

        Set<String> carNames = new HashSet<>(Arrays.stream(inputs).toList());

        if (carNames.size() != inputs.length) {
            throw new IllegalArgumentException("차의 이름은 중복될 수 없습니다.");
        }
    }


    // 시도 횟수 입력 검증
    public void checkTrialCountInputError(String trialCountInput) {
        int trialCount;
        try {
            trialCount = Integer.parseInt(trialCountInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자만 입력 가능합니다.");
        }

        if (trialCount <= TRIAL_COUNT_UNDER_LIMIT || TRIAL_COUNT_UPPER_LIMIT < trialCount) {
            throw new IllegalArgumentException("시도 횟수는 1에서 100 사이의 자연수만 입력 가능합니다.");
        }
    }
}
